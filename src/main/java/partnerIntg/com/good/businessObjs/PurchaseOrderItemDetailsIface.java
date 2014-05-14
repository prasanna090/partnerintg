package partnerIntg.com.good.businessObjs;


import partnerIntg.com.good.valueObjs.PurchaseOrderItemDetails;
import partnerIntg.com.good.xmlprocess.PurchaseOrderType;

import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: vianrotti
 * Date: 11/12/13
 * Time: 7:55 PM
 * To change this template use File | Settings | File Templates.
 */
public interface PurchaseOrderItemDetailsIface {
    public void save(PurchaseOrderItemDetails purchaseOrderItemDetails);
    public void delete(PurchaseOrderItemDetails purchaseOrderItemDetails);
    public void update(PurchaseOrderItemDetails purchaseOrderItemDetails);
    public Set<PurchaseOrderItemDetails> convertObject(PurchaseOrderType purchaseOrderType);
}
