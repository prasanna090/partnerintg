package partnerIntg.com.good.businessObjs;

import partnerIntg.com.good.valueObjs.ErrorAudit;
import partnerIntg.com.good.valueObjs.PurchaseOrderDetails;
import partnerIntg.com.good.xmlprocess.PurchaseOrderType;

/**
 * Created with IntelliJ IDEA.
 * User: vianrotti
 * Date: 11/12/13
 * Time: 7:55 PM
 * To change this template use File | Settings | File Templates.
 */
public interface ErrorAuditIface {
    public void save(ErrorAudit errorAudit);
    public void delete(ErrorAudit errorAudit);
    public void update(ErrorAudit errorAudit);
}
