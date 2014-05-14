package partnerIntg.com.good.dao;

import org.springframework.transaction.annotation.Transactional;
import partnerIntg.com.good.valueObjs.PurchaseOrderCustomerDetails;
import partnerIntg.com.good.valueObjs.PurchaseOrderDetails;

/**
 * Created with IntelliJ IDEA.
 * User: vianrotti
 * Date: 11/12/13
 * Time: 11:17 PM
 * To change this template use File | Settings | File Templates.
 */
public interface PurchaseOrderCustomerDetailsDaoIface {
    @Transactional
    public void save(PurchaseOrderCustomerDetails purchaseOrderCustomerDetails);
    @Transactional
    public void delete(PurchaseOrderCustomerDetails purchaseOrderCustomerDetails);
    @Transactional
    public void update (PurchaseOrderCustomerDetails purchaseOrderCustomerDetails);
}
