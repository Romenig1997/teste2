package application;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Conta;

public class ProgramaConta {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Conta conta;
		System.out.print("Enter account number: ");
		int numeroDaConta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nomeDoCliente = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		
		char opcao = sc.next().charAt(0);
		if (opcao == 'y') {
			System.out.print("Enter initial deposit value: ");
				double depositoInicial = sc.nextDouble();

					conta = new Conta(numeroDaConta, nomeDoCliente, depositoInicial);

						} else {
							conta = new Conta(numeroDaConta, nomeDoCliente);
		}
		System.out.println("Account data: \n" + conta.toString());

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposito = sc.nextDouble();
		conta.deposito(deposito);

		System.out.println("Update account data: \n" + conta.toString());
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double saque = sc.nextDouble();
		conta.saque(saque);
		System.out.println("Update account data: \n" + conta.toString());
		
		

		sc.close();
	}

}
