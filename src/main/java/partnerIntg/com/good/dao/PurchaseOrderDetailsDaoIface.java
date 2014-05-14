package partnerIntg.com.good.dao;

import org.springframework.transaction.annotation.Transactional;
import partnerIntg.com.good.valueObjs.PurchaseOrderDetails;

/**
 * Created with IntelliJ IDEA.
 * User: vianrotti
 * Date: 11/12/13
 * Time: 7:59 PM
 * To change this template use File | Settings | File Templates.
 */
public interface PurchaseOrderDetailsDaoIface {
    @Transactional
    public void save(PurchaseOrderDetails purchaseOrderDetails);
    @Transactional
    public void delete(PurchaseOrderDetails purchaseOrderDetails);
    @Transactional
    public void update (PurchaseOrderDetails purchaseOrderDetails);
}
