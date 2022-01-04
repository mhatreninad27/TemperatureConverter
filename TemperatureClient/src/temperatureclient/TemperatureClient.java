/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temperatureclient;
import java.util.Scanner;
/**
 *
 * @author Dell
 */
public class TemperatureClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b;
        Scanner rs = new Scanner(System.in);
        System.out.println("Degree in Fehrenheit");
        int f =rs.nextInt();
        System.out.println("Fahrenheit to Celsius:" + fahrenheitToCelsius(f));
        System.out.println("Degree in Celsius:");
        int c = rs.nextInt();
        System.out.println("Celsius To Fahrenheit:" + celsiusToFahrenheit(c));
    }

    
    private static float celsiusToFahrenheit(float c) {
        org.my.temperature.TemperatureWs_Service service = new org.my.temperature.TemperatureWs_Service();
        org.my.temperature.TemperatureWs port = service.getTemperatureWsPort();
        return port.celsiusToFahrenheit(c);
    }

    private static float fahrenheitToCelsius(float f) {
        org.my.temperature.TemperatureWs_Service service = new org.my.temperature.TemperatureWs_Service();
        org.my.temperature.TemperatureWs port = service.getTemperatureWsPort();
        return port.fahrenheitToCelsius(f);
    }
   
    
}
