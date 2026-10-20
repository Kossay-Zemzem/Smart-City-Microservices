
package com.example.proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for client complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="client">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         <element name="refClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="isBusiness" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "client", propOrder = {
    "id",
    "refClient",
    "nom",
    "isBusiness"
})
public class Client {

    protected Integer id;
    protected String refClient;
    protected String nom;
    protected boolean isBusiness;

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
     * Gets the value of the nom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNom() {
        return nom;
    }

    /**
     * Sets the value of the nom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNom(String value) {
        this.nom = value;
    }

    /**
     * Gets the value of the isBusiness property.
     * 
     */
    public boolean isIsBusiness() {
        return isBusiness;
    }

    /**
     * Sets the value of the isBusiness property.
     * 
     */
    public void setIsBusiness(boolean value) {
        this.isBusiness = value;
    }

}
