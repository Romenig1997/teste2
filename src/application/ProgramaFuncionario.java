package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Funcionario;

public class ProgramaFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many employees will be registred? ");
		int n = sc.nextInt();

		List<Funcionario> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while(existeId(list, id)){
				System.out.print("Esse id já existe, tente novamente:");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();

			Funcionario funcionario = new Funcionario(id, nome, salario);
			list.add(funcionario);
		}

		System.out.println("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Funcionario funcionario = list.stream().filter(lista -> lista.getId() == id).findFirst().orElse(null);
		if (funcionario == null) {
			System.out.println("This is do not exist!");
		} else {
			System.out.print("Enter the porcentagem: ");
			double porcentagem = sc.nextDouble();
			funcionario.salarioAumentado(porcentagem);

		}

		System.out.println("List of employees:");
		for (Funcionario lista : list) {
			System.out.print(lista.toString());
		}

		sc.close();

	}
	
	public static boolean existeId(List<Funcionario> list, int id) {
		Funcionario funcionario = list.stream().filter(lista -> lista.getId() == id).findFirst().orElse(null);
		return funcionario != null;
		
	}
}
