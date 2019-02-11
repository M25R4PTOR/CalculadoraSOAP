package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

public class UsarCalculadora {

	public static void main(String[] args) throws MalformedURLException, RemoteException {
		String url = "http://www.dneonline.com/calculator.asmx?wsdl";
		CalculatorSoapStub calculadora = new CalculatorSoapStub(new URL(url), null);
		int resultadoAdd = calculadora.add(4, 1);
		int resultadoSubs = calculadora.subtract(25, 22);
		int resultadoMult = calculadora.multiply(3, 8);
		int resultadoDiv = calculadora.divide(125, 5);

		System.out.println("Suma:" + resultadoAdd);
		System.out.println("Resta:" + resultadoSubs);
		System.out.println("Multiplicación:" + resultadoMult);
		System.out.println("División:" + resultadoDiv);
	}
}