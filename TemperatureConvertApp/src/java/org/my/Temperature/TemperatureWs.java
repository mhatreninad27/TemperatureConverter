/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.my.Temperature;


import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Dell
 */
@WebService(serviceName = "TemperatureWs")
public class TemperatureWs {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CelsiusToFahrenheit")
    public float CelsiusToFahrenheit(@WebParam(name = "c") float c) {
        //TODO write your implementation code here:
        return  (c*9/5)*32;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "FahrenheitToCelsius")
    public float FahrenheitToCelsius(@WebParam(name = "f") float f) {
        //TODO write your implementation code here:
        return (f-32)*5/9;
    }
}
