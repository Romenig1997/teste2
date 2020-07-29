package application;

import java.util.Scanner;

import Entidades.Estudante;

public class ProgramaAluguel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Estudante[] vetor = new Estudante[10];
		
		for(int i=1; i<=n; i++) {
			System.out.println("Rent #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vetor[room] = new Estudante(nome, email);
		}
		
		System.out.println("Bussy rooms:");
		for(int i=0; i<10;i++) {
			if(vetor[i] != null) {
				System.out.println(i + ": "+ vetor[i]);
			}
		}
		
		
		sc.close();
		

	}

}
