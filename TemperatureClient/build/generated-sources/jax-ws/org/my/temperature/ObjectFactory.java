
package org.my.temperature;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.my.temperature package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CelsiusToFahrenheitResponse_QNAME = new QName("http://Temperature.my.org/", "CelsiusToFahrenheitResponse");
    private final static QName _FahrenheitToCelsiusResponse_QNAME = new QName("http://Temperature.my.org/", "FahrenheitToCelsiusResponse");
    private final static QName _FahrenheitToCelsius_QNAME = new QName("http://Temperature.my.org/", "FahrenheitToCelsius");
    private final static QName _Hello_QNAME = new QName("http://Temperature.my.org/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://Temperature.my.org/", "helloResponse");
    private final static QName _CelsiusToFahrenheit_QNAME = new QName("http://Temperature.my.org/", "CelsiusToFahrenheit");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.my.temperature
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CelsiusToFahrenheit }
     * 
     */
    public CelsiusToFahrenheit createCelsiusToFahrenheit() {
        return new CelsiusToFahrenheit();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link FahrenheitToCelsius }
     * 
     */
    public FahrenheitToCelsius createFahrenheitToCelsius() {
        return new FahrenheitToCelsius();
    }

    /**
     * Create an instance of {@link CelsiusToFahrenheitResponse }
     * 
     */
    public CelsiusToFahrenheitResponse createCelsiusToFahrenheitResponse() {
        return new CelsiusToFahrenheitResponse();
    }

    /**
     * Create an instance of {@link FahrenheitToCelsiusResponse }
     * 
     */
    public FahrenheitToCelsiusResponse createFahrenheitToCelsiusResponse() {
        return new FahrenheitToCelsiusResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CelsiusToFahrenheitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Temperature.my.org/", name = "CelsiusToFahrenheitResponse")
    public JAXBElement<CelsiusToFahrenheitResponse> createCelsiusToFahrenheitResponse(CelsiusToFahrenheitResponse value) {
        return new JAXBElement<CelsiusToFahrenheitResponse>(_CelsiusToFahrenheitResponse_QNAME, CelsiusToFahrenheitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FahrenheitToCelsiusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Temperature.my.org/", name = "FahrenheitToCelsiusResponse")
    public JAXBElement<FahrenheitToCelsiusResponse> createFahrenheitToCelsiusResponse(FahrenheitToCelsiusResponse value) {
        return new JAXBElement<FahrenheitToCelsiusResponse>(_FahrenheitToCelsiusResponse_QNAME, FahrenheitToCelsiusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FahrenheitToCelsius }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Temperature.my.org/", name = "FahrenheitToCelsius")
    public JAXBElement<FahrenheitToCelsius> createFahrenheitToCelsius(FahrenheitToCelsius value) {
        return new JAXBElement<FahrenheitToCelsius>(_FahrenheitToCelsius_QNAME, FahrenheitToCelsius.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Temperature.my.org/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Temperature.my.org/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CelsiusToFahrenheit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://Temperature.my.org/", name = "CelsiusToFahrenheit")
    public JAXBElement<CelsiusToFahrenheit> createCelsiusToFahrenheit(CelsiusToFahrenheit value) {
        return new JAXBElement<CelsiusToFahrenheit>(_CelsiusToFahrenheit_QNAME, CelsiusToFahrenheit.class, null, value);
    }

}
