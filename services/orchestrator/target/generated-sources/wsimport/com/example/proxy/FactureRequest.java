
package com.example.proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for factureRequest complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="factureRequest">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="refFacture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="refClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="codeSpot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="typeSpot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="isOccupied" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="etageLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="durationInHours" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="prixTTC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "factureRequest", propOrder = {
    "refFacture",
    "refClient",
    "codeSpot",
    "typeSpot",
    "isOccupied",
    "etageLabel",
    "durationInHours",
    "prixTTC"
})
public class FactureRequest {

    protected String refFacture;
    protected String refClient;
    protected String codeSpot;
    protected String typeSpot;
    protected boolean isOccupied;
    protected String etageLabel;
    protected Integer durationInHours;
    protected Double prixTTC;

    /**
     * Gets the value of the refFacture property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefFacture() {
        return refFacture;
    }

    /**
     * Sets the value of the refFacture property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefFacture(String value) {
        this.refFacture = value;
    }

    /**
     * Gets the value of the refClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefClient() {
        return refClient;
    }

    /**
     * Sets the value of the refClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefClient(String value) {
        this.refClient = value;
    }

    /**
     * Gets the value of the codeSpot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeSpot() {
        return codeSpot;
    }

    /**
     * Sets the value of the codeSpot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeSpot(String value) {
        this.codeSpot = value;
    }

    /**
     * Gets the value of the typeSpot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeSpot() {
        return typeSpot;
    }

    /**
     * Sets the value of the typeSpot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeSpot(String value) {
        this.typeSpot = value;
    }

    /**
     * Gets the value of the isOccupied property.
     * 
     */
    public boolean isIsOccupied() {
        return isOccupied;
    }

    /**
     * Sets the value of the isOccupied property.
     * 
     */
    public void setIsOccupied(boolean value) {
        this.isOccupied = value;
    }

    /**
     * Gets the value of the etageLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtageLabel() {
        return etageLabel;
    }

    /**
     * Sets the value of the etageLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtageLabel(String value) {
        this.etageLabel = value;
    }

    /**
     * Gets the value of the durationInHours property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDurationInHours() {
        return durationInHours;
    }

    /**
     * Sets the value of the durationInHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDurationInHours(Integer value) {
        this.durationInHours = value;
    }

    /**
     * Gets the value of the prixTTC property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrixTTC() {
        return prixTTC;
    }

    /**
     * Sets the value of the prixTTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrixTTC(Double value) {
        this.prixTTC = value;
    }

}
