
package com.example.proxy;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for TypeFacture</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="TypeFacture">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="ELECT"/>
 *     <enumeration value="EAU"/>
 *     <enumeration value="PARKING"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "TypeFacture")
@XmlEnum
public enum TypeFacture {

    ELECT,
    EAU,
    PARKING;

    public String value() {
        return name();
    }

    public static TypeFacture fromValue(String v) {
        return valueOf(v);
    }

}
