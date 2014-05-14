package partnerIntg.com.good.valueObjs;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: vianrotti
 * Date: 11/13/13
 * Time: 9:37 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="po_item_details")
public class PurchaseOrderItemDetails {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "poItemDetailsSeq")
    @SequenceGenerator(name = "poItemDetailsSeq", sequenceName = "PO_ITEM_DETAILS_SEQ", allocationSize = 1)
    @Column(name="po_item_details_id",nullable = false)
    private long poItemDetailsId;

    @Column(name="product_code",nullable = false)
    private String productCode;
    @Column(name="product_description",nullable = false)
    private String productDescription;
    @Column(name="distributor_product_code",nullable = false)
    private String distiProductCode;
    @Column(name="term",nullable = true)
    private String term;
    @Column(name="value",nullable = true)
    private int value;
    @Column(name="list_price",nullable = false)
    private double listPrice;
    @Column(name="sales_price",nullable = false)
    private double salesPrice;
    @Column(name="extended_price",nullable = false)
    private double extendedPrice;
    @Column(name="serial_number")
    private String serialNumber;
    @Column(name="quantity",nullable = false)
    private long quantity;
    @Column(name="requested_date")
    private Date requestedDate;

    @Column (name="contract_start_date")
    private Date contractStartDate;
    @Column (name="contract_end_date")
    private Date contractEndDate;
    @Column (name="contract_number")
    private String contractNumber;

    public Date getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(Date contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public Date getContractEndDate() {
        return contractEndDate;
    }

    public void setContractEndDate(Date contractEndDate) {
        this.contractEndDate = contractEndDate;
    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getPoFileName() {
        return poFileName;
    }

    public void setPoFileName(String poFileName) {
        this.poFileName = poFileName;
    }

    @Column (name = "po_file_name")
    private String poFileName;

    @ManyToOne
    @JoinColumn(name="po_details_id", insertable = false, updatable = false)
    private PurchaseOrderDetails purchaseOrderDetails;

    @Id
    @GenericGenerator(name = "generator", strategy = "foreign",
            parameters = @Parameter(name = "property", value = "purchaseOrderDetails"))
    @GeneratedValue(generator = "generator")
    @Column(name="po_details_id")
    private long poDetailsId;

    public PurchaseOrderDetails getPurchaseOrderDetails() {
        return purchaseOrderDetails;
    }

    public void setPurchaseOrderDetails(PurchaseOrderDetails purchaseOrderDetails) {
        this.purchaseOrderDetails = purchaseOrderDetails;
    }

    public long getPoDetailsId() {
        return poDetailsId;
    }

    public void setPoDetailsId(long poDetailsId) {
        this.poDetailsId = poDetailsId;
    }

    public long getPoItemDetailsId() {
        return poItemDetailsId;
    }

    public void setPoItemDetailsId(long poItemDetailsId) {
        this.poItemDetailsId = poItemDetailsId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getDistiProductCode() {
        return distiProductCode;
    }

    public void setDistiProductCode(String distiProductCode) {
        this.distiProductCode = distiProductCode;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double getListPrice() {
        return listPrice;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public double getExtendedPrice() {
        return extendedPrice;
    }

    public void setExtendedPrice(double extendedPrice) {
        this.extendedPrice = extendedPrice;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public Date getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(Date requestedDate) {
        this.requestedDate = requestedDate;
    }
}
