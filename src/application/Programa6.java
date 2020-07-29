package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConvert;

public class Programa6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("What is the dollar price? ");
		double  precoDoDolar = sc.nextDouble();
		System.out.printf("How many dollars will be bought? ");
		double total = sc.nextDouble();
		
		double resultado = CurrencyConvert.dollarToReal(total, precoDoDolar);
		System.out.printf("Amount to be paid in reais =  %.2f%n", resultado);
		sc.close();
	}

}
