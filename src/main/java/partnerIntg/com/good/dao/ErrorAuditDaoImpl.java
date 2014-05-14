package partnerIntg.com.good.dao;

import org.springframework.stereotype.Repository;
import partnerIntg.com.good.valueObjs.ErrorAudit;

/**
 * Created with IntelliJ IDEA.
 * User: vianrotti
 * Date: 11/13/13
 * Time: 4:57 PM
 * To change this template use File | Settings | File Templates.
 */
@Repository("errorAuditDaoIface")
public class ErrorAuditDaoImpl extends CustomHibernateTemplate implements ErrorAuditDaoIface {
    @Override
    public void save(ErrorAudit errorAudit) {
        getHibernateTemplate().save(errorAudit);
    }

    @Override
    public void delete(ErrorAudit errorAudit) {
        getHibernateTemplate().delete(errorAudit);
    }

    @Override
    public void update(ErrorAudit errorAudit) {
        getHibernateTemplate().update(errorAudit);
    }
}
