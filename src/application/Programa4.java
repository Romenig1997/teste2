package application;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Empregado;

public class Programa4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Empregado empregado = new Empregado();
		System.out.print("Name: ");
		empregado.nome = sc.nextLine();
		System.out.printf("Gross Salary:");
		empregado.salarioBruto = sc.nextDouble();
		System.out.printf("Tax:");
		empregado.imposto = sc.nextDouble();
		
		System.out.println("Employee: " + empregado.toString());
		System.out.println("Wich percentage  to increase salary? ");
		double porcentagem = sc.nextDouble();
		empregado.aumento(porcentagem);
		System.out.println("Upadte data: " + empregado.toString());
		
		sc.close();

	}

}
