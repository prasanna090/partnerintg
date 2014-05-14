package partnerIntg.com.good.businessObjs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import partnerIntg.com.good.dao.PurchaseOrderCustomerDetailsDaoIface;
import partnerIntg.com.good.valueObjs.PurchaseOrderCustomerDetails;
import partnerIntg.com.good.xmlprocess.PurchaseOrderType;

/**
 * Created with IntelliJ IDEA.
 * User: vianrotti
 * Date: 11/12/13
 * Time: 11:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class PurchaseOrderCustomerDetailsImpl implements PurchaseOrderCustomerDetailsIface {


    @Autowired
    PurchaseOrderCustomerDetailsDaoIface purchaseOrderCustomerDetailsDaoIface;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void save(PurchaseOrderCustomerDetails purchaseOrderCustomerDetails) {
        purchaseOrderCustomerDetailsDaoIface.save(purchaseOrderCustomerDetails);
    }

    @Override
    public void delete(PurchaseOrderCustomerDetails purchaseOrderCustomerDetails) {
        purchaseOrderCustomerDetailsDaoIface.delete(purchaseOrderCustomerDetails);
    }

    @Override
    public void update(PurchaseOrderCustomerDetails purchaseOrderCustomerDetails) {
        purchaseOrderCustomerDetailsDaoIface.update(purchaseOrderCustomerDetails);
    }

    @Override
    public PurchaseOrderCustomerDetails convertBillToObject(PurchaseOrderType purchaseOrderType) {
        if (purchaseOrderType.getPoHeader().getBillToCustomer() == null) {
            return null;
        }
        PurchaseOrderCustomerDetails purchaseOrderCustomerDetails = new PurchaseOrderCustomerDetails();
        purchaseOrderCustomerDetails.setCustomerType("BILL_TO");
        purchaseOrderCustomerDetails.setCountry(purchaseOrderType.getPoHeader().getBillToCustomer().getCountry());
        purchaseOrderCustomerDetails.setZipCode(purchaseOrderType.getPoHeader().getBillToCustomer().getZip());
        purchaseOrderCustomerDetails.setCustomerNumber(purchaseOrderType.getPoHeader().getBillToCustomer().getCustomerNumber());
        purchaseOrderCustomerDetails.setContactEmail(purchaseOrderType.getPoHeader().getBillToCustomer().getContactEmail());
        purchaseOrderCustomerDetails.setContactName(purchaseOrderType.getPoHeader().getBillToCustomer().getContactName());
        purchaseOrderCustomerDetails.setCity(purchaseOrderType.getPoHeader().getBillToCustomer().getCity());
        purchaseOrderCustomerDetails.setComment_(purchaseOrderType.getPoHeader().getBillToCustomer().getComment());
        purchaseOrderCustomerDetails.setCity(purchaseOrderType.getPoHeader().getBillToCustomer().getCity());
        purchaseOrderCustomerDetails.setName(purchaseOrderType.getPoHeader().getBillToCustomer().getName());
        purchaseOrderCustomerDetails.setPhone(purchaseOrderType.getPoHeader().getBillToCustomer().getPhone());
        purchaseOrderCustomerDetails.setState(purchaseOrderType.getPoHeader().getBillToCustomer().getState());
        purchaseOrderCustomerDetails.setAddressLine1(purchaseOrderType.getPoHeader().getBillToCustomer().getAddressLine1());
        purchaseOrderCustomerDetails.setAddressLine2(purchaseOrderType.getPoHeader().getBillToCustomer().getAddressLine2());
        purchaseOrderCustomerDetails.setAddressLine3(purchaseOrderType.getPoHeader().getBillToCustomer().getAddressLine3());
        purchaseOrderCustomerDetails.setAddressLine4(purchaseOrderType.getPoHeader().getBillToCustomer().getAddressLine4());
        return purchaseOrderCustomerDetails;
    }

    @Override
    public PurchaseOrderCustomerDetails convertShipToObject(PurchaseOrderType purchaseOrderType) {
        PurchaseOrderCustomerDetails purchaseOrderCustomerDetails = new PurchaseOrderCustomerDetails();
        purchaseOrderCustomerDetails.setCustomerType("SHIP_TO");
        purchaseOrderCustomerDetails.setCountry(purchaseOrderType.getPoHeader().getShipToCustomer().getCountry());
        purchaseOrderCustomerDetails.setZipCode(purchaseOrderType.getPoHeader().getShipToCustomer().getZip());
        purchaseOrderCustomerDetails.setCustomerNumber(purchaseOrderType.getPoHeader().getShipToCustomer().getCustomerNumber());
        purchaseOrderCustomerDetails.setContactEmail(purchaseOrderType.getPoHeader().getShipToCustomer().getContactEmail());
        purchaseOrderCustomerDetails.setContactName(purchaseOrderType.getPoHeader().getShipToCustomer().getContactName());
        purchaseOrderCustomerDetails.setCity(purchaseOrderType.getPoHeader().getShipToCustomer().getCity());
        purchaseOrderCustomerDetails.setComment_(purchaseOrderType.getPoHeader().getShipToCustomer().getComment());
        purchaseOrderCustomerDetails.setCity(purchaseOrderType.getPoHeader().getShipToCustomer().getCity());
        purchaseOrderCustomerDetails.setName(purchaseOrderType.getPoHeader().getShipToCustomer().getName());
        purchaseOrderCustomerDetails.setPhone(purchaseOrderType.getPoHeader().getShipToCustomer().getPhone());
        purchaseOrderCustomerDetails.setState(purchaseOrderType.getPoHeader().getShipToCustomer().getState());
        purchaseOrderCustomerDetails.setAddressLine1(purchaseOrderType.getPoHeader().getShipToCustomer().getAddressLine1());
        purchaseOrderCustomerDetails.setAddressLine2(purchaseOrderType.getPoHeader().getShipToCustomer().getAddressLine2());
        purchaseOrderCustomerDetails.setAddressLine3(purchaseOrderType.getPoHeader().getShipToCustomer().getAddressLine3());
        purchaseOrderCustomerDetails.setAddressLine4(purchaseOrderType.getPoHeader().getShipToCustomer().getAddressLine4());
        return purchaseOrderCustomerDetails; //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public PurchaseOrderCustomerDetails convertSoldToObject(PurchaseOrderType purchaseOrderType) {
        PurchaseOrderCustomerDetails purchaseOrderCustomerDetails = new PurchaseOrderCustomerDetails();
        purchaseOrderCustomerDetails.setCustomerType("SOLD_TO");
        purchaseOrderCustomerDetails.setCountry(purchaseOrderType.getPoHeader().getSoldToCustomer().getCountry());
        purchaseOrderCustomerDetails.setZipCode(purchaseOrderType.getPoHeader().getSoldToCustomer().getZip());
        purchaseOrderCustomerDetails.setCustomerNumber(purchaseOrderType.getPoHeader().getSoldToCustomer().getCustomerNumber());
        purchaseOrderCustomerDetails.setContactEmail(purchaseOrderType.getPoHeader().getSoldToCustomer().getContactEmail());
        purchaseOrderCustomerDetails.setContactName(purchaseOrderType.getPoHeader().getSoldToCustomer().getContactName());
        purchaseOrderCustomerDetails.setCity(purchaseOrderType.getPoHeader().getSoldToCustomer().getCity());
        purchaseOrderCustomerDetails.setComment_(purchaseOrderType.getPoHeader().getSoldToCustomer().getComment());
        purchaseOrderCustomerDetails.setCity(purchaseOrderType.getPoHeader().getSoldToCustomer().getCity());
        purchaseOrderCustomerDetails.setName(purchaseOrderType.getPoHeader().getSoldToCustomer().getName());
        purchaseOrderCustomerDetails.setPhone(purchaseOrderType.getPoHeader().getSoldToCustomer().getPhone());
        purchaseOrderCustomerDetails.setState(purchaseOrderType.getPoHeader().getSoldToCustomer().getState());
        purchaseOrderCustomerDetails.setAddressLine1(purchaseOrderType.getPoHeader().getShipToCustomer().getAddressLine1());
        purchaseOrderCustomerDetails.setAddressLine2(purchaseOrderType.getPoHeader().getShipToCustomer().getAddressLine2());
        purchaseOrderCustomerDetails.setAddressLine3(purchaseOrderType.getPoHeader().getShipToCustomer().getAddressLine3());
        purchaseOrderCustomerDetails.setAddressLine4(purchaseOrderType.getPoHeader().getShipToCustomer().getAddressLine4());
        return purchaseOrderCustomerDetails;
    }

    public PurchaseOrderCustomerDetailsDaoIface getPurchaseOrderCustomerDetailsDaoIface() {
        return purchaseOrderCustomerDetailsDaoIface;
    }

    public void setPurchaseOrderCustomerDetailsDaoIface(PurchaseOrderCustomerDetailsDaoIface purchaseOrderCustomerDetailsDaoIface) {
        this.purchaseOrderCustomerDetailsDaoIface = purchaseOrderCustomerDetailsDaoIface;
    }

}
