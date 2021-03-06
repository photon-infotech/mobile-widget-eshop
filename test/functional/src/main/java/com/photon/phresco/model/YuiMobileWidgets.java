//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.22 at 01:42:28 PM IST 
//


package com.photon.phresco.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="mobilewidget" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="billInfoEmailValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="billInfoFirstNameValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="billInfoLastNameValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="billInfoCompanyValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="billInfoAddress1Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="billInfoAddress2Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="billInfoCityValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="billInfoStateValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="billInfoPostCodeValue" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="billInfoPhoneNumberValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="billInfoCommentsValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "", propOrder = {
    "mobilewidget"
})
@XmlRootElement(name = "yuiMobileWidgets")
public class YuiMobileWidgets {

    protected List<YuiMobileWidgets.Mobilewidget> mobilewidget;

    /**
     * Gets the value of the mobilewidget property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobilewidget property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobilewidget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link YuiMobileWidgets.Mobilewidget }
     * 
     * 
     */
    public List<YuiMobileWidgets.Mobilewidget> getMobilewidget() {
        if (mobilewidget == null) {
            mobilewidget = new ArrayList<YuiMobileWidgets.Mobilewidget>();
        }
        return this.mobilewidget;
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
     *         &lt;element name="billInfoEmailValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="billInfoFirstNameValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="billInfoLastNameValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="billInfoCompanyValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="billInfoAddress1Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="billInfoAddress2Value" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="billInfoCityValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="billInfoStateValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="billInfoPostCodeValue" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="billInfoPhoneNumberValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="billInfoCommentsValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "billInfoEmailValue",
        "billInfoFirstNameValue",
        "billInfoLastNameValue",
        "billInfoCompanyValue",
        "billInfoAddress1Value",
        "billInfoAddress2Value",
        "billInfoCityValue",
        "billInfoStateValue",
        "billInfoPostCodeValue",
        "billInfoPhoneNumberValue",
        "billInfoCommentsValue"
    })
    public static class Mobilewidget {

        @XmlElement(required = true)
        protected String billInfoEmailValue;
        @XmlElement(required = true)
        protected String billInfoFirstNameValue;
        @XmlElement(required = true)
        protected String billInfoLastNameValue;
        @XmlElement(required = true)
        protected String billInfoCompanyValue;
        @XmlElement(required = true)
        protected String billInfoAddress1Value;
        @XmlElement(required = true)
        protected String billInfoAddress2Value;
        @XmlElement(required = true)
        protected String billInfoCityValue;
        @XmlElement(required = true)
        protected String billInfoStateValue;
        protected String billInfoPostCodeValue;
        @XmlElement(required = true)
        protected String billInfoPhoneNumberValue;
        @XmlElement(required = true)
        protected String billInfoCommentsValue;

        /**
         * Gets the value of the billInfoEmailValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillInfoEmailValue() {
            return billInfoEmailValue;
        }

        /**
         * Sets the value of the billInfoEmailValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillInfoEmailValue(String value) {
            this.billInfoEmailValue = value;
        }

        /**
         * Gets the value of the billInfoFirstNameValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillInfoFirstNameValue() {
            return billInfoFirstNameValue;
        }

        /**
         * Sets the value of the billInfoFirstNameValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillInfoFirstNameValue(String value) {
            this.billInfoFirstNameValue = value;
        }

        /**
         * Gets the value of the billInfoLastNameValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillInfoLastNameValue() {
            return billInfoLastNameValue;
        }

        /**
         * Sets the value of the billInfoLastNameValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillInfoLastNameValue(String value) {
            this.billInfoLastNameValue = value;
        }

        /**
         * Gets the value of the billInfoCompanyValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillInfoCompanyValue() {
            return billInfoCompanyValue;
        }

        /**
         * Sets the value of the billInfoCompanyValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillInfoCompanyValue(String value) {
            this.billInfoCompanyValue = value;
        }

        /**
         * Gets the value of the billInfoAddress1Value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillInfoAddress1Value() {
            return billInfoAddress1Value;
        }

        /**
         * Sets the value of the billInfoAddress1Value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillInfoAddress1Value(String value) {
            this.billInfoAddress1Value = value;
        }

        /**
         * Gets the value of the billInfoAddress2Value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillInfoAddress2Value() {
            return billInfoAddress2Value;
        }

        /**
         * Sets the value of the billInfoAddress2Value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillInfoAddress2Value(String value) {
            this.billInfoAddress2Value = value;
        }

        /**
         * Gets the value of the billInfoCityValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillInfoCityValue() {
            return billInfoCityValue;
        }

        /**
         * Sets the value of the billInfoCityValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillInfoCityValue(String value) {
            this.billInfoCityValue = value;
        }

        /**
         * Gets the value of the billInfoStateValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillInfoStateValue() {
            return billInfoStateValue;
        }

        /**
         * Sets the value of the billInfoStateValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillInfoStateValue(String value) {
            this.billInfoStateValue = value;
        }

        /**
         * Gets the value of the billInfoPostCodeValue property.
         * 
         */
        public String getBillInfoPostCodeValue() {
            return billInfoPostCodeValue;
        }

        /**
         * Sets the value of the billInfoPostCodeValue property.
         * 
         */
        public void setBillInfoPostCodeValue(String value) {
            this.billInfoPostCodeValue = value;
        }

        /**
         * Gets the value of the billInfoPhoneNumberValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillInfoPhoneNumberValue() {
            return billInfoPhoneNumberValue;
        }

        /**
         * Sets the value of the billInfoPhoneNumberValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillInfoPhoneNumberValue(String value) {
            this.billInfoPhoneNumberValue = value;
        }

        /**
         * Gets the value of the billInfoCommentsValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBillInfoCommentsValue() {
            return billInfoCommentsValue;
        }

        /**
         * Sets the value of the billInfoCommentsValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBillInfoCommentsValue(String value) {
            this.billInfoCommentsValue = value;
        }

    }

}
