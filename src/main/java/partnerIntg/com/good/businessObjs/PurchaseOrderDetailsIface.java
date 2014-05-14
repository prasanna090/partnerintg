package partnerIntg.com.good.businessObjs;

import partnerIntg.com.good.valueObjs.PurchaseOrderDetails;
import partnerIntg.com.good.xmlprocess.PurchaseOrderType;

/**
 * Created with IntelliJ IDEA.
 * User: vianrotti
 * Date: 11/12/13
 * Time: 7:55 PM
 * To change this template use File | Settings | File Templates.
 */
public interface PurchaseOrderDetailsIface {
    public void save (PurchaseOrderDetails purchaseOrderDetails);
    public void delete (PurchaseOrderDetails purchaseOrderDetails);
    public void update (PurchaseOrderDetails purchaseOrderDetails);

    PurchaseOrderDetails convertObject(PurchaseOrderType purchaseOrderType, String name);
}
