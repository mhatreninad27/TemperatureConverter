
package org.my.temperature;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FahrenheitToCelsius complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FahrenheitToCelsius">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="f" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FahrenheitToCelsius", propOrder = {
    "f"
})
public class FahrenheitToCelsius {

    protected float f;

    /**
     * Gets the value of the f property.
     * 
     */
    public float getF() {
        return f;
    }

    /**
     * Sets the value of the f property.
     * 
     */
    public void setF(float value) {
        this.f = value;
    }

}
