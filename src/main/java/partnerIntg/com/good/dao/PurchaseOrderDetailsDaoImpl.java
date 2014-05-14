package partnerIntg.com.good.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import partnerIntg.com.good.valueObjs.PurchaseOrderDetails;

/**
 * Created with IntelliJ IDEA.
 * User: vianrotti
 * Date: 11/12/13
 * Time: 8:00 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository("purchaseOrderDetailsDaoIface")
public class PurchaseOrderDetailsDaoImpl extends CustomHibernateTemplate implements PurchaseOrderDetailsDaoIface {
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void save(PurchaseOrderDetails purchaseOrderDetails) {
        getHibernateTemplate().save(purchaseOrderDetails);
    }

    @Override
    public void delete(PurchaseOrderDetails purchaseOrderDetails) {
        getHibernateTemplate().delete(purchaseOrderDetails);
    }

    @Override
    public void update(PurchaseOrderDetails purchaseOrderDetails) {
        getHibernateTemplate().update(purchaseOrderDetails);
    }
}
