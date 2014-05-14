package partnerIntg.com.good.dao;

import org.springframework.stereotype.Repository;
import partnerIntg.com.good.valueObjs.PurchaseOrderDetails;
import partnerIntg.com.good.valueObjs.PurchaseOrderItemDetails;

/**
 * Created with IntelliJ IDEA.
 * User: vianrotti
 * Date: 11/12/13
 * Time: 8:00 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository("purchaseOrderItemDetailsDaoIface")
public class PurchaseOrderItemDetailsDaoImpl extends CustomHibernateTemplate implements PurchaseOrderItemDetailsDaoIface {

    @Override
    public void save(PurchaseOrderItemDetails purchaseOrderItemDetails) {
        getHibernateTemplate().save(purchaseOrderItemDetails);
    }

    @Override
    public void delete(PurchaseOrderItemDetails purchaseOrderItemDetails) {
        getHibernateTemplate().delete(purchaseOrderItemDetails);
    }

    @Override
    public void update(PurchaseOrderItemDetails purchaseOrderItemDetails) {
       getHibernateTemplate().update(purchaseOrderItemDetails);
    }
}
