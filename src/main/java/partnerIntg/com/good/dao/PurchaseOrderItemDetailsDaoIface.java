package partnerIntg.com.good.dao;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import partnerIntg.com.good.valueObjs.PurchaseOrderDetails;
import partnerIntg.com.good.valueObjs.PurchaseOrderItemDetails;

/**
 * Created with IntelliJ IDEA.
 * User: vianrotti
 * Date: 11/12/13
 * Time: 7:59 PM
 * To change this template use File | Settings | File Templates.
 */
public interface PurchaseOrderItemDetailsDaoIface {
     public void save(PurchaseOrderItemDetails purchaseOrderItemDetails);
    public void delete(PurchaseOrderItemDetails purchaseOrderItemDetails);
    public void update(PurchaseOrderItemDetails purchaseOrderItemDetails);
}
