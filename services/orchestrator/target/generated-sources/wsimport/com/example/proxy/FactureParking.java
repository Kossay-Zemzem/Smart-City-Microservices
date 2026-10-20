
package com.example.proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for factureParking complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="factureParking">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="refFacture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="codeSpot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="typeSpot" type="{http://services.facture.smartcity.com/}parkingSpotType" minOccurs="0"/>
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
@XmlType(name = "factureParking", propOrder = {
    "id",
    "refFacture",
    "codeSpot",
    "typeSpot",
    "isOccupied",
    "etageLabel",
    "durationInHours",
    "prixTTC"
})
public class FactureParking {

    protected Integer id;
    protected String refFacture;
    protected String codeSpot;
    @XmlSchemaType(name = "string")
    protected ParkingSpotType typeSpot;
    protected boolean isOccupied;
    protected String etageLabel;
    protected Integer durationInHours;
    protected Double prixTTC;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

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
     *     {@link ParkingSpotType }
     *     
     */
    public ParkingSpotType getTypeSpot() {
        return typeSpot;
    }

    /**
     * Sets the value of the typeSpot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkingSpotType }
     *     
     */
    public void setTypeSpot(ParkingSpotType value) {
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
