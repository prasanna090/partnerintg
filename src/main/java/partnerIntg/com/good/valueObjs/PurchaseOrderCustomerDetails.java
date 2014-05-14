package partnerIntg.com.good.valueObjs;


import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: vianrotti
 * Date: 11/12/13
 * Time: 10:48 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name="po_customer_details")
public class PurchaseOrderCustomerDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "poCustomerDetailsSeq")
    @SequenceGenerator(name = "poCustomerDetailsSeq", sequenceName = "po_customer_details_seq", allocationSize = 1)
    @Column(name="po_customer_details_id")
    private long poCustomerDetailsId;

    public long getPoDetailsId() {
        return poDetailsId;
    }

    public void setPoDetailsId(long poDetailsId) {
        this.poDetailsId = poDetailsId;
    }

    public PurchaseOrderDetails getPurchaseOrderDetails() {
        return purchaseOrderDetails;
    }

    public void setPurchaseOrderDetails(PurchaseOrderDetails purchaseOrderDetails) {
        this.purchaseOrderDetails = purchaseOrderDetails;
    }

    @Id
    @GenericGenerator(name = "generator", strategy = "foreign",
            parameters = @Parameter(name = "property", value = "purchaseOrderDetails"))
    @GeneratedValue(generator = "generator")
    @Column(name="po_details_id")
    private long poDetailsId;

    @Column(name="customer_number",nullable = true)
    private String customerNumber;

    @Column(name="name",nullable = false)
    private String name;

    @Column(name="address_line1",nullable = false)
    private String addressLine1;
    @Column(name="address_line2",nullable = true)
    private String addressLine2;
    @Column(name="address_line3",nullable = true)
    private String addressLine3;

    public String getAddressLine4() {
        return addressLine4;
    }

    public void setAddressLine4(String addressLine4) {
        this.addressLine4 = addressLine4;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    @Column(name="address_line4",nullable = true)
    private String addressLine4;

    @Column(name="city",nullable = false)
    private String city;

    @Column(name="state")
    private String state;

    @Column(name="zip_code",nullable = false)
    private String zipCode;

    @Column(name="country",nullable = false)
    private String country;

    @Column(name="comment_")
    private String comment_;

    @Column(name="phone")
    private String phone;

    @Column(name="contact_email",nullable = false)
    private String contactEmail;

    @Column(name="contact_name",nullable = false)
    private String contactName;

    @Column(name="customer_type",nullable = false)
    private String customerType;

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @ManyToOne
    @JoinColumn(name="po_Details_id")
    private PurchaseOrderDetails purchaseOrderDetails;


    public long getPoCustomerDetailsId() {
        return poCustomerDetailsId;
    }

    public void setPoCustomerDetailsId(long poCustomerDetailsId) {
        this.poCustomerDetailsId = poCustomerDetailsId;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getComment_() {
        return comment_;
    }

    public void setComment_(String comment_) {
        this.comment_ = comment_;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
}
