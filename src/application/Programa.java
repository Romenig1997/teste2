package application;

import java.util.Locale;
import java.util.Scanner;

import Entidades.triangle;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		triangle x, y;
		
		x = new triangle();
		y = new triangle();
		
		System.out.println("Insira as Medidas do triangulo X?");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Insira as medidas do Triangulo Y?");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Area do Triangulo X: %.4f%n",  areaX);
		System.out.printf("Area do Triangulo Y: %.4f%n",  areaY);
		
		if(areaX >  areaY) {
			System.out.println("Area maior triangulo X");
		} else {
			System.out.println("Area maior  triangulo Y");
		}
		
		sc.close();
		
		
	}

}
