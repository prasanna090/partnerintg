package partnerIntg.com.good.businessObjs;

import partnerIntg.com.good.valueObjs.PurchaseOrderCustomerDetails;
import partnerIntg.com.good.valueObjs.PurchaseOrderDetails;
import partnerIntg.com.good.xmlprocess.PurchaseOrderType;

/**
 * Created with IntelliJ IDEA.
 * User: vianrotti
 * Date: 11/12/13
 * Time: 11:13 PM
 * To change this template use File | Settings | File Templates.
 */
public interface PurchaseOrderCustomerDetailsIface {
    public void save (PurchaseOrderCustomerDetails purchaseOrderCustomerDetails);
    public void delete (PurchaseOrderCustomerDetails purchaseOrderCustomerDetails);
    public void update (PurchaseOrderCustomerDetails purchaseOrderCustomerDetails);
    public PurchaseOrderCustomerDetails convertBillToObject(PurchaseOrderType purchaseOrderType);
    public PurchaseOrderCustomerDetails convertShipToObject(PurchaseOrderType purchaseOrderType);
    public PurchaseOrderCustomerDetails convertSoldToObject(PurchaseOrderType purchaseOrderType);
}
