package partnerIntg.com.good.dao;

import org.springframework.transaction.annotation.Transactional;
import partnerIntg.com.good.valueObjs.PurchaseOrderCustomerDetails;
import partnerIntg.com.good.valueObjs.PurchaseOrderDetails;

/**
 * Created with IntelliJ IDEA.
 * User: vianrotti
 * Date: 11/12/13
 * Time: 11:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class PurchaseOrderCustomerDetailsDaoImpl extends CustomHibernateTemplate implements PurchaseOrderCustomerDetailsDaoIface  {

    @Override
    public void save(PurchaseOrderCustomerDetails purchaseOrderCustomerDetails) {
        getHibernateTemplate().save(purchaseOrderCustomerDetails);
    }

    @Override
    public void delete(PurchaseOrderCustomerDetails purchaseOrderCustomerDetails) {
        getHibernateTemplate().delete(purchaseOrderCustomerDetails);
    }

    @Override
    public void update(PurchaseOrderCustomerDetails purchaseOrderCustomerDetails) {
        getHibernateTemplate().update(purchaseOrderCustomerDetails);
    }
}
