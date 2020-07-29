package Entidades;

public class Retangulo {
	public double largura;
	public double altura;

	public double area() {
		return largura * altura;
	}
	public double perimetro() {
		return largura * 2.0 + altura * 2.0;
	}
	public double diagonal() {
		return Math.sqrt(largura * largura + altura * altura);
	}
}
