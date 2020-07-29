package application;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Retangulo;

public class Programa3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter rectangle width and height:");

		Retangulo a = new Retangulo();
		a.altura = sc.nextDouble();
		a.largura = sc.nextDouble();

		System.out.printf("AREA = %.2f%n", a.area());
		System.out.printf("PERIMETER =  %.2f%n", a.perimetro());
		System.out.printf("DIAGONAL = %.2f%n", a.diagonal());
		sc.close();
	}

}
