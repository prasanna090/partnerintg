//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.13 at 12:09:05 PM PST 
//


package partnerIntg.com.good.xmlprocess;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ItemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="distributorProductName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="productDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="term" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="termValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="salesPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                   &lt;element name="listPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="extendedPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *                   &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="reqDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemsType", propOrder = {
    "item"
})
public class ItemsType {

    @XmlElement(required = true)
    protected List<Item> item;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link partnerIntg.com.good.xmlprocess.ItemsType.Item }
     * 
     * 
     */
    public List<Item> getItem() {
        if (item == null) {
            item = new ArrayList<Item>();
        }
        return this.item;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="serialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="distributorProductName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="productDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="term" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="termValue" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="salesPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *         &lt;element name="listPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="extendedPrice" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
     *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="reqDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "productName",
        "serialNumber",
        "distributorProductName",
        "productDescription",
        "term",
        "termValue",
        "salesPrice",
        "quantity",
        "listPrice",
        "extendedPrice",
        "comment",
        "reqDate",
        "contractStartDate",
        "contractEndDate",
        "contractNumber"
    })
    public static class Item {

        @XmlElement(required = true)
        protected String productName;
        protected String serialNumber;
        @XmlElement(required = true)
        protected String distributorProductName;
        @XmlElement(required = true)
        protected String productDescription;
        @XmlElement(required = true)
        protected String term;
        protected int termValue;
        @XmlElement(required = true)
        protected BigDecimal salesPrice;
        @XmlElement(required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger quantity;
        @XmlElement(required = true)
        protected BigDecimal listPrice;
        @XmlElement(required = true)
        protected BigDecimal extendedPrice;
        protected String comment;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar reqDate;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar contractStartDate;

        public XMLGregorianCalendar getContractStartDate() {
            return contractStartDate;
        }

        public void setContractStartDate(XMLGregorianCalendar contractStartDate) {
            this.contractStartDate = contractStartDate;
        }

        public XMLGregorianCalendar getContractEndDate() {
            return contractEndDate;
        }

        public void setContractEndDate(XMLGregorianCalendar contractEndDate) {
            this.contractEndDate = contractEndDate;
        }

        public String getContractNumber() {
            return contractNumber;
        }

        public void setContractNumber(String contractNumber) {
            this.contractNumber = contractNumber;
        }

        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar contractEndDate;
        protected String contractNumber;

        /**
         * Gets the value of the productName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductName() {
            return productName;
        }

        /**
         * Sets the value of the productName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductName(String value) {
            this.productName = value;
        }

        /**
         * Gets the value of the serialNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSerialNumber() {
            return serialNumber;
        }

        /**
         * Sets the value of the serialNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSerialNumber(String value) {
            this.serialNumber = value;
        }

        /**
         * Gets the value of the distributorProductName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistributorProductName() {
            return distributorProductName;
        }

        /**
         * Sets the value of the distributorProductName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistributorProductName(String value) {
            this.distributorProductName = value;
        }

        /**
         * Gets the value of the productDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductDescription() {
            return productDescription;
        }

        /**
         * Sets the value of the productDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductDescription(String value) {
            this.productDescription = value;
        }

        /**
         * Gets the value of the term property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTerm() {
            return term;
        }

        /**
         * Sets the value of the term property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTerm(String value) {
            this.term = value;
        }

        /**
         * Gets the value of the termValue property.
         * 
         */
        public int getTermValue() {
            return termValue;
        }

        /**
         * Sets the value of the termValue property.
         * 
         */
        public void setTermValue(int value) {
            this.termValue = value;
        }

        /**
         * Gets the value of the salesPrice property.
         * 
         * @return
         *     possible object is
         *     {@link java.math.BigDecimal }
         *     
         */
        public BigDecimal getSalesPrice() {
            return salesPrice;
        }

        /**
         * Sets the value of the salesPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.math.BigDecimal }
         *     
         */
        public void setSalesPrice(BigDecimal value) {
            this.salesPrice = value;
        }

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link java.math.BigInteger }
         *     
         */
        public BigInteger getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.math.BigInteger }
         *     
         */
        public void setQuantity(BigInteger value) {
            this.quantity = value;
        }

        /**
         * Gets the value of the listPrice property.
         * 
         * @return
         *     possible object is
         *     {@link java.math.BigDecimal }
         *     
         */
        public BigDecimal getListPrice() {
            return listPrice;
        }

        /**
         * Sets the value of the listPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.math.BigDecimal }
         *     
         */
        public void setListPrice(BigDecimal value) {
            this.listPrice = value;
        }

        /**
         * Gets the value of the extendedPrice property.
         * 
         * @return
         *     possible object is
         *     {@link java.math.BigDecimal }
         *     
         */
        public BigDecimal getExtendedPrice() {
            return extendedPrice;
        }

        /**
         * Sets the value of the extendedPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link java.math.BigDecimal }
         *     
         */
        public void setExtendedPrice(BigDecimal value) {
            this.extendedPrice = value;
        }

        /**
         * Gets the value of the comment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComment() {
            return comment;
        }

        /**
         * Sets the value of the comment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComment(String value) {
            this.comment = value;
        }

        /**
         * Gets the value of the reqDate property.
         * 
         * @return
         *     possible object is
         *     {@link javax.xml.datatype.XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getReqDate() {
            return reqDate;
        }

        /**
         * Sets the value of the reqDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link javax.xml.datatype.XMLGregorianCalendar }
         *     
         */
        public void setReqDate(XMLGregorianCalendar value) {
            this.reqDate = value;
        }

    }

}