
package org.my.temperature;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CelsiusToFahrenheit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CelsiusToFahrenheit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="c" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CelsiusToFahrenheit", propOrder = {
    "c"
})
public class CelsiusToFahrenheit {

    protected float c;

    /**
     * Gets the value of the c property.
     * 
     */
    public float getC() {
        return c;
    }

    /**
     * Sets the value of the c property.
     * 
     */
    public void setC(float value) {
        this.c = value;
    }

}
