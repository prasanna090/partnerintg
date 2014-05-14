package partnerIntg.com.good.businessObjs;

import partnerIntg.com.good.dao.PurchaseOrderDetailsDaoIface;
import partnerIntg.com.good.valueObjs.PurchaseOrderDetails;
import partnerIntg.com.good.xmlprocess.PurchaseOrderType;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: vianrotti
 * Date: 11/12/13
 * Time: 7:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class PurchaseOrderDetailsImpl implements PurchaseOrderDetailsIface {

    public PurchaseOrderDetailsDaoIface getPurchaseOrderDetailsDaoIface() {
        return purchaseOrderDetailsDaoIface;
    }

    public void setPurchaseOrderDetailsDaoIface(PurchaseOrderDetailsDaoIface purchaseOrderDetailsDaoIface) {
        this.purchaseOrderDetailsDaoIface = purchaseOrderDetailsDaoIface;
    }

    private PurchaseOrderDetailsDaoIface purchaseOrderDetailsDaoIface;


    @Override
    public void save(PurchaseOrderDetails purchaseOrderDetails) {
        purchaseOrderDetailsDaoIface.save(purchaseOrderDetails);
    }

    @Override
    public void delete(PurchaseOrderDetails purchaseOrderDetails) {
        purchaseOrderDetailsDaoIface.delete(purchaseOrderDetails);
    }

    @Override
    public void update(PurchaseOrderDetails purchaseOrderDetails) {
        purchaseOrderDetailsDaoIface.update(purchaseOrderDetails);
    }

    @Override
    public PurchaseOrderDetails convertObject(PurchaseOrderType purchaseOrderType, String name) {
        PurchaseOrderDetails purchaseOrderDetails = new PurchaseOrderDetails();
        purchaseOrderDetails.setSourceSystem(purchaseOrderType.getPoHeader().getPoDetails().getSourceSystem());
        purchaseOrderDetails.setSourceSystemId(purchaseOrderType.getPoHeader().getPoDetails().getSourceSystemId());
        purchaseOrderDetails.setOrderDate(purchaseOrderType.getPoHeader().getPoDetails().getOrderDate().toGregorianCalendar().getTime());
        purchaseOrderDetails.setPoNumber(purchaseOrderType.getPoHeader().getPoDetails().getPoNumber());
        purchaseOrderDetails.setTotalValue(purchaseOrderType.getPoHeader().getPoDetails().getTotalValue());
        purchaseOrderDetails.setQuoteNumber(purchaseOrderType.getPoHeader().getPoDetails().getQuoteNum());
        purchaseOrderDetails.setProcessedFlag("N");
        purchaseOrderDetails.setEndUserPoNumber(purchaseOrderType.getPoHeader().getPoDetails().getEndUserPO());
        purchaseOrderDetails.setDistributorId(purchaseOrderType.getPoHeader().getPoDetails().getDistributorId());
        purchaseOrderDetails.setPaymentTerms(purchaseOrderType.getPoHeader().getPoDetails().getPaymentTerms());
        purchaseOrderDetails.setComment(purchaseOrderType.getPoHeader().getPoDetails().getComment());
        purchaseOrderDetails.setCreatedDate(new Date());
        purchaseOrderDetails.setCurrency(purchaseOrderType.getPoHeader().getPoDetails().getCurrency());
        purchaseOrderDetails.setOppId(purchaseOrderType.getPoHeader().getPoDetails().getOppId());
        purchaseOrderDetails.setPoFileName(name);
        purchaseOrderDetails.setReceiverId(purchaseOrderType.getPoHeader().getPoDetails().getReceiverId());
        purchaseOrderDetails.setISAControlNumber(purchaseOrderType.getPoHeader().getPoDetails().getISAControlNumber());
        return purchaseOrderDetails;
    }
}
