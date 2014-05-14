package partnerIntg;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import partnerIntg.com.good.businessObjs.ErrorAuditIface;
import partnerIntg.com.good.businessObjs.PurchaseOrderCustomerDetailsIface;
import partnerIntg.com.good.businessObjs.PurchaseOrderDetailsIface;
import partnerIntg.com.good.businessObjs.PurchaseOrderItemDetailsIface;
import partnerIntg.com.good.valueObjs.ErrorAudit;
import partnerIntg.com.good.valueObjs.PurchaseOrderCustomerDetails;
import partnerIntg.com.good.valueObjs.PurchaseOrderDetails;
import partnerIntg.com.good.valueObjs.PurchaseOrderItemDetails;
import partnerIntg.com.good.xmlprocess.PurchaseOrderType;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.*;
import java.util.Date;
import java.util.Properties;
import java.util.Set;
import java.util.UUID;

/**
 * Hello world!
 */
public class App {
    private static final Logger log = (Logger) LoggerFactory.getLogger(App.class);
    private static Long uuid = UUID.randomUUID().getMostSignificantBits();

    static class FileExt implements FilenameFilter {

        public boolean accept(File dir, String name) {
            return name.toLowerCase().endsWith("xml");
        }

    }

    static boolean validateAgainstXSD(InputStream xml, InputStream xsd, ErrorAuditIface errorAuditIface, String name) {
        try {
            SchemaFactory factory =
                    SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new StreamSource(xsd));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(xml));
            return true;
        } catch (Exception ex) {
            ErrorAudit errorAudit = new ErrorAudit();
            errorAudit.setCreatedDate(new Date());
            errorAudit.setMessage(ex.getClass().getName() + ": " + ex.getMessage());
            errorAudit.setErrorId(1000);
            errorAudit.setJobId(uuid);
            errorAudit.setFileName(name + ": " + 1000);
            errorAuditIface.save(errorAudit);
            log.error("Error in XML validation", ex);
            try {
                xml.close();
                xsd.close();
            } catch (IOException e) {
                log.error("Error in XML validation", e);
                return false;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        ApplicationContext appContext =
                new ClassPathXmlApplicationContext("/BeansLocation.xml");
        log.error("UUID for the Job is : " + uuid);
        PurchaseOrderDetailsIface purchaseOrderDetailsIface = (PurchaseOrderDetailsIface) appContext.getBean("purchaseOrderDetailsIface");
        PurchaseOrderCustomerDetailsIface purchaseOrderCustomerDetailsIface = (PurchaseOrderCustomerDetailsIface) appContext.getBean("purchaseOrderCustomerDetailsIface");
        PurchaseOrderItemDetailsIface purchaseOrderItemDetailsIface = (PurchaseOrderItemDetailsIface) appContext.getBean("purchaseOrderItemDetailsIface");
        ErrorAuditIface errorAuditIface = (ErrorAuditIface) appContext.getBean("errorAuditIface");
        Properties property = new Properties();
        try {

            JAXBContext context = JAXBContext.newInstance("partnerIntg.com.good.xmlprocess");
            Unmarshaller jaxbUnmarshaller = context.createUnmarshaller();
          FileInputStream fileInputStream = new FileInputStream(new File("/Users/prasannarotti/sourceCode/IdeaProjects/partnerIntg/src/main/resources/xmlIntg.properties"));
            //FileInputStream fileInputStream = new FileInputStream(new File("/Users/vianrotti/IdeaProjects/partnerIntg/src/main/resources/xmlIntg.properties"));

            property.load(fileInputStream);
            System.out.println("loaded properites" + property.getProperty("ftp.folder.working"));//PurchaseOrderType.class.getClassLoader().getResourceAsStream("/xmlIntg.properties"));
            File[] files = new File(property.getProperty("ftp.folder.working")).listFiles(new FileExt());
            String xsdFile = property.getProperty("ftp.folder.xsdLocation") + property.getProperty("ftp.xsdFileName");
            for (File file : files) {
                try {
                    if (validateAgainstXSD(new FileInputStream(file), new FileInputStream(xsdFile), errorAuditIface, file.getName())) {
                        JAXBElement<?> jaxbElement = (JAXBElement<?>) jaxbUnmarshaller.unmarshal(file);
                        PurchaseOrderType purchaseOrderType = (PurchaseOrderType) jaxbElement.getValue();
                        PurchaseOrderDetails purchaseOrderDetails = purchaseOrderDetailsIface.convertObject(purchaseOrderType,file.getName());
                        //   PurchaseOrderCustomerDetails purchaseOrderBillToCustomerDetails = purchaseOrderCustomerDetailsIface.convertBillToObject(purchaseOrderType);
                        PurchaseOrderCustomerDetails purchaseOrderShipToCustomerDetails = purchaseOrderCustomerDetailsIface.convertShipToObject(purchaseOrderType);
                        PurchaseOrderCustomerDetails purchaseOrderSoldToCustomerDetails = purchaseOrderCustomerDetailsIface.convertSoldToObject(purchaseOrderType);
                        PurchaseOrderCustomerDetails purchaseOrderBillToCustomerDetails = purchaseOrderCustomerDetailsIface.convertBillToObject(purchaseOrderType);
                        Set<PurchaseOrderItemDetails> purchaseOrderItemDetailsSet = purchaseOrderItemDetailsIface.convertObject(purchaseOrderType);


                        purchaseOrderDetails.setPurchaseOrderItemDetailsSet(purchaseOrderItemDetailsSet);
                        if ( purchaseOrderBillToCustomerDetails!= null) {
                             purchaseOrderBillToCustomerDetails.setPurchaseOrderDetails(purchaseOrderDetails);
                        }
                        purchaseOrderShipToCustomerDetails.setPurchaseOrderDetails(purchaseOrderDetails);
                        purchaseOrderSoldToCustomerDetails.setPurchaseOrderDetails(purchaseOrderDetails);

                        purchaseOrderDetailsIface.save(purchaseOrderDetails);
                        if ( purchaseOrderBillToCustomerDetails!= null) {
                            purchaseOrderCustomerDetailsIface.save(purchaseOrderBillToCustomerDetails);
                        }
                        purchaseOrderCustomerDetailsIface.save(purchaseOrderShipToCustomerDetails);
                        purchaseOrderCustomerDetailsIface.save(purchaseOrderSoldToCustomerDetails);

                        int index = 0;
                        for (PurchaseOrderItemDetails purchaseOrderItemDetails : purchaseOrderItemDetailsSet) {
                            purchaseOrderItemDetails.setPurchaseOrderDetails(purchaseOrderDetails);
                            purchaseOrderItemDetails.setPoFileName(purchaseOrderDetails.getPoFileName() + ":" + index++);
                            purchaseOrderItemDetailsIface.save(purchaseOrderItemDetails);
                        }

                    }
                } catch (Exception e) {
                    ErrorAudit errorAudit = new ErrorAudit();
                    errorAudit.setCreatedDate(new Date());
                    errorAudit.setMessage(e.getClass().getName() + ": " +e.getMessage());
                     errorAudit.setFileName(file.getName() + ": " + 1100);
                    errorAudit.setErrorId(1100);
                    errorAudit.setJobId(uuid);
                    errorAuditIface.save(errorAudit);
                    log.error("Exception in main function", e);
                }
            }
        } catch (Exception e) {
            ErrorAudit errorAudit = new ErrorAudit();
            errorAudit.setCreatedDate(new Date());
            errorAudit.setMessage(e.getClass().getName() + ": " +e.getMessage());
            errorAudit.setErrorId(1200);
            errorAudit.setJobId(uuid);
            // errorAudit.setFileName(name);
            errorAuditIface.save(errorAudit);
            log.error("Exception in main function", e);
        }


    }
}
