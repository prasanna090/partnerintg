package partnerIntg.com.good.dao;

import partnerIntg.com.good.valueObjs.ErrorAudit;

/**
 * Created with IntelliJ IDEA.
 * User: vianrotti
 * Date: 11/13/13
 * Time: 4:56 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ErrorAuditDaoIface {
    public void save(ErrorAudit errorAudit);
    public void delete(ErrorAudit errorAudit);
    public void update (ErrorAudit errorAudit);
}
