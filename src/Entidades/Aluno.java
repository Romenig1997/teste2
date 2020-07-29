package Entidades;

public class Aluno {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;

	public double soma() {
		return nota1 + nota2 + nota3;
	}

	public double pontos() {
		return 60.00 - soma();
	}

	public void situacaoAluno() {

		double pontosFaltam = 60.00 - soma();

		if (soma() >= 60.00) {

			System.out.println("PASS");

		} else {

			System.out.println("FAILED");

			System.out.printf("MISSING %.2f%n", pontosFaltam);

		}

	}

	public String toString() {
		return "FINAL GRADE = " + String.format("%.2f%n", soma());
	}

}
