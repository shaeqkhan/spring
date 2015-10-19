package pkg.schema.beans;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2015-10-19T14:06:21.600-04:00
 * Generated source version: 3.0.1
 * 
 */
@WebService(targetNamespace = "http://www.w3schools.com/webservices/", name = "TempConvertSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface TempConvertSoap {

    @WebResult(name = "FahrenheitToCelsiusResult", targetNamespace = "http://www.w3schools.com/webservices/")
    @RequestWrapper(localName = "FahrenheitToCelsius", targetNamespace = "http://www.w3schools.com/webservices/", className = "pkg.schema.beans.FahrenheitToCelsius")
    @WebMethod(operationName = "FahrenheitToCelsius", action = "http://www.w3schools.com/webservices/FahrenheitToCelsius")
    @ResponseWrapper(localName = "FahrenheitToCelsiusResponse", targetNamespace = "http://www.w3schools.com/webservices/", className = "pkg.schema.beans.FahrenheitToCelsiusResponse")
    public java.lang.String fahrenheitToCelsius(
        @WebParam(name = "Fahrenheit", targetNamespace = "http://www.w3schools.com/webservices/")
        java.lang.String fahrenheit
    );

    @WebResult(name = "CelsiusToFahrenheitResult", targetNamespace = "http://www.w3schools.com/webservices/")
    @RequestWrapper(localName = "CelsiusToFahrenheit", targetNamespace = "http://www.w3schools.com/webservices/", className = "pkg.schema.beans.CelsiusToFahrenheit")
    @WebMethod(operationName = "CelsiusToFahrenheit", action = "http://www.w3schools.com/webservices/CelsiusToFahrenheit")
    @ResponseWrapper(localName = "CelsiusToFahrenheitResponse", targetNamespace = "http://www.w3schools.com/webservices/", className = "pkg.schema.beans.CelsiusToFahrenheitResponse")
    public java.lang.String celsiusToFahrenheit(
        @WebParam(name = "Celsius", targetNamespace = "http://www.w3schools.com/webservices/")
        java.lang.String celsius
    );
}