
package com.example.proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for generateFacture complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="generateFacture">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="factureRequest" type="{http://services.facture.smartcity.com/}factureRequest" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generateFacture", propOrder = {
    "factureRequest"
})
public class GenerateFacture {

    protected FactureRequest factureRequest;

    /**
     * Gets the value of the factureRequest property.
     * 
     * @return
     *     possible object is
     *     {@link FactureRequest }
     *     
     */
    public FactureRequest getFactureRequest() {
        return factureRequest;
    }

    /**
     * Sets the value of the factureRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link FactureRequest }
     *     
     */
    public void setFactureRequest(FactureRequest value) {
        this.factureRequest = value;
    }

}
