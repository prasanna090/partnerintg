package partnerIntg.com.good.valueObjs;

import com.sun.org.apache.xerces.internal.impl.dv.xs.IDDV;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: vianrotti
 * Date: 11/13/13
 * Time: 4:45 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="error_audit")
public class ErrorAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "errorAuditDetails")
    @SequenceGenerator(name = "errorAuditDetails", sequenceName = "error_audit_seq", allocationSize = 1)
    @Column(name="ERROR_AUDIT_ID")
    private long id;

    @Column(name="job_id")
    private long jobId;

    public String getProcessedFlag() {
        return processedFlag;
    }

    public void setProcessedFlag(String processedFlag) {
        this.processedFlag = processedFlag;
    }

    @Column (name = "processed_flag")
    private String processedFlag = "N";

    public long getJobId() {
        return jobId;
    }

    public void setJobId(long jobId) {
        this.jobId = jobId;
    }

    @Column(name="po_number")
    private String poNumber;

    @Column(name="message")
    private String message;

    @Column(name="created_date")
    private Date createdDate;

    @Column(name="error_source")
    private String errorSource = "JAVA";

    public String getErrorSource() {
        return errorSource;
    }

    public void setErrorSource(String errorSource) {
        this.errorSource = errorSource;
    }

    @Column(name="file_name")
    private String fileName;

    public long getErrorId() {
        return errorId;
    }

    public void setErrorId(long errorId) {
        this.errorId = errorId;
    }

    @Column (name="error_code")
    private long errorId;



    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
