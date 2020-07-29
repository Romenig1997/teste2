package application;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Produto2;

public class Programa2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira os dados do produto:");
		System.out.print("nome: ");
		String nome = sc.nextLine();

		System.out.print("Preco: ");
		double preco = sc.nextDouble();

		/*System.out.print("Quantidade no estoque: ");
		int quantidade = sc.nextInt();*/

		Produto2 produto = new Produto2(nome, preco);

		System.out.println("Dados do produto: " + produto);

		System.out.println();
		System.out.println("Entre com o numero de produtos que foi adicionado ao estoque:");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		System.out.println("Dados atualizados: " + produto);

		System.out.println();
		System.out.println("Entre com o numero de produtos que foi removido do estoque:");
		quantidade = sc.nextInt();
		produto.removerProduto(quantidade);
		System.out.println("Dados atualizados: " + produto);

		sc.close();

	}

}
