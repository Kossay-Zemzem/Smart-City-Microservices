
package com.example.proxy;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for factureDTO complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="factureDTO">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="refFacture" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="type" type="{http://services.facture.smartcity.com/}TypeFacture" minOccurs="0"/>
 *         <element name="montantHT" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="montantTTC" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="dateEmission" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="dateLimitePaiement" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         <element name="prixUnitaire" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="consomationTotal" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="prixServiceSuppl" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         <element name="clientRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="clientNom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="codeSpot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="typeSpot" type="{http://services.facture.smartcity.com/}parkingSpotType" minOccurs="0"/>
 *         <element name="isOccupied" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         <element name="etageLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="durationInHours" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "factureDTO", propOrder = {
    "id",
    "refFacture",
    "type",
    "montantHT",
    "montantTTC",
    "dateEmission",
    "dateLimitePaiement",
    "prixUnitaire",
    "consomationTotal",
    "prixServiceSuppl",
    "clientRef",
    "clientNom",
    "codeSpot",
    "typeSpot",
    "isOccupied",
    "etageLabel",
    "durationInHours"
})
public class FactureDTO {

    protected Integer id;
    protected String refFacture;
    @XmlSchemaType(name = "string")
    protected TypeFacture type;
    protected Double montantHT;
    protected Double montantTTC;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateEmission;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateLimitePaiement;
    protected Double prixUnitaire;
    protected Integer consomationTotal;
    protected Double prixServiceSuppl;
    protected String clientRef;
    protected String clientNom;
    protected String codeSpot;
    @XmlSchemaType(name = "string")
    protected ParkingSpotType typeSpot;
    protected boolean isOccupied;
    protected String etageLabel;
    protected Integer durationInHours;

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
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TypeFacture }
     *     
     */
    public TypeFacture getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeFacture }
     *     
     */
    public void setType(TypeFacture value) {
        this.type = value;
    }

    /**
     * Gets the value of the montantHT property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontantHT() {
        return montantHT;
    }

    /**
     * Sets the value of the montantHT property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontantHT(Double value) {
        this.montantHT = value;
    }

    /**
     * Gets the value of the montantTTC property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMontantTTC() {
        return montantTTC;
    }

    /**
     * Sets the value of the montantTTC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMontantTTC(Double value) {
        this.montantTTC = value;
    }

    /**
     * Gets the value of the dateEmission property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateEmission() {
        return dateEmission;
    }

    /**
     * Sets the value of the dateEmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateEmission(XMLGregorianCalendar value) {
        this.dateEmission = value;
    }

    /**
     * Gets the value of the dateLimitePaiement property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateLimitePaiement() {
        return dateLimitePaiement;
    }

    /**
     * Sets the value of the dateLimitePaiement property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateLimitePaiement(XMLGregorianCalendar value) {
        this.dateLimitePaiement = value;
    }

    /**
     * Gets the value of the prixUnitaire property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrixUnitaire() {
        return prixUnitaire;
    }

    /**
     * Sets the value of the prixUnitaire property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrixUnitaire(Double value) {
        this.prixUnitaire = value;
    }

    /**
     * Gets the value of the consomationTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getConsomationTotal() {
        return consomationTotal;
    }

    /**
     * Sets the value of the consomationTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setConsomationTotal(Integer value) {
        this.consomationTotal = value;
    }

    /**
     * Gets the value of the prixServiceSuppl property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPrixServiceSuppl() {
        return prixServiceSuppl;
    }

    /**
     * Sets the value of the prixServiceSuppl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPrixServiceSuppl(Double value) {
        this.prixServiceSuppl = value;
    }

    /**
     * Gets the value of the clientRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientRef() {
        return clientRef;
    }

    /**
     * Sets the value of the clientRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientRef(String value) {
        this.clientRef = value;
    }

    /**
     * Gets the value of the clientNom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientNom() {
        return clientNom;
    }

    /**
     * Sets the value of the clientNom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientNom(String value) {
        this.clientNom = value;
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

}
