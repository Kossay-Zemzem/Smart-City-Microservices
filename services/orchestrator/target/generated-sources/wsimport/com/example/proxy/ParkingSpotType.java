
package com.example.proxy;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 * 
 * <p>Java class for parkingSpotType</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * <pre>{@code
 * <simpleType name="parkingSpotType">
 *   <restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     <enumeration value="NORMAL"/>
 *     <enumeration value="VIP"/>
 *   </restriction>
 * </simpleType>
 * }</pre>
 * 
 */
@XmlType(name = "parkingSpotType")
@XmlEnum
public enum ParkingSpotType {

    NORMAL,
    VIP;

    public String value() {
        return name();
    }

    public static ParkingSpotType fromValue(String v) {
        return valueOf(v);
    }

}
