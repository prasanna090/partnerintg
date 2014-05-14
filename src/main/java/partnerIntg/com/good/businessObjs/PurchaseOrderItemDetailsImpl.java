package partnerIntg.com.good.businessObjs;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import partnerIntg.com.good.dao.PurchaseOrderItemDetailsDaoIface;
import partnerIntg.com.good.valueObjs.PurchaseOrderItemDetails;
import partnerIntg.com.good.xmlprocess.ItemsType;
import partnerIntg.com.good.xmlprocess.PurchaseOrderType;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class PurchaseOrderItemDetailsImpl implements PurchaseOrderItemDetailsIface {


    public PurchaseOrderItemDetailsDaoIface getPurchaseOrderItemDetailsDaoIface() {
        return purchaseOrderItemDetailsDaoIface;
    }

    public void setPurchaseOrderItemDetailsDaoIface(PurchaseOrderItemDetailsDaoIface purchaseOrderItemDetailsDaoIface) {
        this.purchaseOrderItemDetailsDaoIface = purchaseOrderItemDetailsDaoIface;
    }

    private PurchaseOrderItemDetailsDaoIface purchaseOrderItemDetailsDaoIface;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void save(PurchaseOrderItemDetails purchaseOrderItemDetails) {
        purchaseOrderItemDetailsDaoIface.save(purchaseOrderItemDetails);
    }

    @Override
    public void delete(PurchaseOrderItemDetails purchaseOrderItemDetails) {
        purchaseOrderItemDetailsDaoIface.delete(purchaseOrderItemDetails);
    }

    @Override
    public void update(PurchaseOrderItemDetails purchaseOrderItemDetails) {
        purchaseOrderItemDetailsDaoIface.update(purchaseOrderItemDetails);
    }

    @Override
    public Set<PurchaseOrderItemDetails> convertObject(PurchaseOrderType purchaseOrderType) {
       Set<PurchaseOrderItemDetails> purchaseOrderItemDetailsSet = new HashSet<PurchaseOrderItemDetails>();
       for (ItemsType.Item item : purchaseOrderType.getItems().getItem()) {
           PurchaseOrderItemDetails purchaseOrderItemDetails = new PurchaseOrderItemDetails();
           purchaseOrderItemDetails.setRequestedDate(new Date());
           purchaseOrderItemDetails.setSerialNumber(item.getSerialNumber());
           if (item.getListPrice() != null )
                purchaseOrderItemDetails.setListPrice(item.getListPrice().doubleValue());
          if (item.getSalesPrice() != null )
           purchaseOrderItemDetails.setSalesPrice(item.getSalesPrice().doubleValue());
           purchaseOrderItemDetails.setTerm(item.getTerm());
           purchaseOrderItemDetails.setValue(item.getTermValue());
           purchaseOrderItemDetails.setProductCode(item.getProductName());
           purchaseOrderItemDetails.setDistiProductCode(item.getDistributorProductName());
           purchaseOrderItemDetails.setProductDescription(item.getProductDescription());
     //      if (item.getExtendedPrice() != null )
                purchaseOrderItemDetails.setExtendedPrice(item.getExtendedPrice().doubleValue());
           purchaseOrderItemDetails.setQuantity(item.getQuantity().longValue());
           if (item.getContractEndDate() != null) {
               purchaseOrderItemDetails.setContractEndDate(item.getContractEndDate().toGregorianCalendar().getTime());
               purchaseOrderItemDetails.setContractStartDate(item.getContractStartDate().toGregorianCalendar().getTime());
              }
           purchaseOrderItemDetails.setContractNumber(item.getContractNumber());

           purchaseOrderItemDetailsSet.add(purchaseOrderItemDetails);
       }
        return purchaseOrderItemDetailsSet;
    }
}
