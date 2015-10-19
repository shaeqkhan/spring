package pkg.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.WebServiceRef;

import pkg.schema.beans.TempConvert;
import pkg.schema.beans.TempConvertSoap;

@SuppressWarnings("restriction")
public class Consumer {
	
	@WebServiceRef
	static private TempConvert service = null;
	
	public static void main(String[] args) {
		
		try {
			service = new TempConvert(
					new URL("http://www.w3schools.com/webservices/tempconvert.asmx?WSDL"), 
					new QName("http://www.w3schools.com/webservices/", "TempConvert"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
		TempConvertSoap serviceInterface = service.getTempConvertSoap();
		
		System.out.println("Celsius to Fahrenheit : " + serviceInterface.celsiusToFahrenheit("36.7"));
		System.out.println("Fahrenheit to Celsius : " + serviceInterface.fahrenheitToCelsius("100"));
	}

}
