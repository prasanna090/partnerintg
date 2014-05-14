package partnerIntg.com.good.valueObjs;


import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: vianrotti
 * Date: 11/12/13
 * Time: 7:37 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="po_details")
public class PurchaseOrderDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "poDetailsSeq")
    @SequenceGenerator(name = "poDetailsSeq", sequenceName = "po_details_seq", allocationSize = 1)
    @Column(name="po_details_id")
    private long poDetailsId;

    public String getSourceSystem() {
        return sourceSystem;
    }

    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    public String getSourceSystemId() {
        return sourceSystemId;
    }

    public void setSourceSystemId(String sourceSystemId) {
        this.sourceSystemId = sourceSystemId;
    }

    @Column (name="source_system", nullable = false)
    private String sourceSystem;
    @Column (name="source_system_id", nullable = false)
    private String sourceSystemId;
    @Column(name="po_number",nullable = false)
    private String poNumber;
    @Column(name="isa_control_number",nullable = true)
    private String ISAControlNumber;
    @Column(name="distributor_id",nullable = false)
    private String distributorId;

    public String getISAControlNumber() {
        return ISAControlNumber;
    }

    public void setISAControlNumber(String ISAControlNumber) {
        this.ISAControlNumber = ISAControlNumber;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    @Column(name="receiver_id",nullable = true)
    private String receiverId;
    @Column(name="payment_terms",nullable = false)
    private String paymentTerms;
    @Column(name="total_value",nullable = false)
    private double totalValue;
    @Column(name="order_date",nullable = false)
    private Date orderDate;
    @Column(name="quote_number",nullable = false)
    private String quoteNumber;
    @Column(name="opp_id")
    private String oppId;
    @Column(name="enduser_po_number")
    private String endUserPoNumber;
    @Column(name="currency",nullable = false)
    private String currency;
    @Column(name="comment_")
    private String comment;
    @Column(name="processed_flag",nullable = false)
    private String processedFlag = "N";
    @Column(name="created_date")
    private Date createdDate;

    public String getPoFileName() {
        return poFileName;
    }

    public void setPoFileName(String poFileName) {
        this.poFileName = poFileName;
    }

    @Column(name="po_file_name")
    private String poFileName;

    @OneToMany(mappedBy = "purchaseOrderDetails")
    private Set<PurchaseOrderCustomerDetails> purchaseOrderCustomerDetailsSet = new HashSet<PurchaseOrderCustomerDetails>(0);

    @OneToMany (mappedBy = "purchaseOrderDetails")
    private Set<PurchaseOrderItemDetails> purchaseOrderItemDetailsSet = new HashSet<PurchaseOrderItemDetails>(0);

    public Set<PurchaseOrderItemDetails> getPurchaseOrderItemDetailsSet() {
        return purchaseOrderItemDetailsSet;
    }

    public void setPurchaseOrderItemDetailsSet(Set<PurchaseOrderItemDetails> purchaseOrderItemDetailsSet) {
        this.purchaseOrderItemDetailsSet = purchaseOrderItemDetailsSet;
    }

    public Set<PurchaseOrderCustomerDetails> getPurchaseOrderCustomerDetailsSet() {
        return purchaseOrderCustomerDetailsSet;
    }

    public void setPurchaseOrderCustomerDetailsSet(Set<PurchaseOrderCustomerDetails> purchaseOrderCustomerDetailsSet) {
        this.purchaseOrderCustomerDetailsSet = purchaseOrderCustomerDetailsSet;
    }

    public long getPoDetailsId() {
        return poDetailsId;
    }

    public void setPoDetailsId(long poDetailsId) {
        this.poDetailsId = poDetailsId;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(String poNumber) {
        this.poNumber = poNumber;
    }

    public String getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(String distributorId) {
        this.distributorId = distributorId;
    }

    public String getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getQuoteNumber() {
        return quoteNumber;
    }

    public void setQuoteNumber(String quoteNumber) {
        this.quoteNumber = quoteNumber;
    }

    public String getOppId() {
        return oppId;
    }

    public void setOppId(String oppId) {
        this.oppId = oppId;
    }

    public String getEndUserPoNumber() {
        return endUserPoNumber;
    }

    public void setEndUserPoNumber(String endUserPoNumber) {
        this.endUserPoNumber = endUserPoNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getProcessedFlag() {
        return processedFlag;
    }

    public void setProcessedFlag(String processedFlag) {
        this.processedFlag = processedFlag;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
