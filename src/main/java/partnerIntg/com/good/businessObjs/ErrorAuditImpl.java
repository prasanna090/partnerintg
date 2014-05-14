package partnerIntg.com.good.businessObjs;

import partnerIntg.com.good.dao.ErrorAuditDaoIface;
import partnerIntg.com.good.valueObjs.ErrorAudit;

/**
 * Created with IntelliJ IDEA.
 * User: vianrotti
 * Date: 11/13/13
 * Time: 4:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class ErrorAuditImpl implements ErrorAuditIface {


    private ErrorAuditDaoIface errorAuditDaoIface;

    public ErrorAuditDaoIface getErrorAuditDaoIface() {
        return errorAuditDaoIface;
    }

    public void setErrorAuditDaoIface(ErrorAuditDaoIface errorAuditDaoIface) {
        this.errorAuditDaoIface = errorAuditDaoIface;
    }

    @Override
    public void save(ErrorAudit errorAudit) {
       errorAuditDaoIface.save(errorAudit);
    }

    @Override
    public void delete(ErrorAudit errorAudit) {
       errorAuditDaoIface.delete(errorAudit);
    }

    @Override
    public void update(ErrorAudit errorAudit) {
        errorAuditDaoIface.update(errorAudit);
    }
}
