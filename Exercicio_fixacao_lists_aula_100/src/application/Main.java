package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos funcionários serão registrados: ");
		int qtd = sc.nextInt();
		
		Funcionarios[] f = new Funcionarios[qtd];
		
		for(int i = 0; i < qtd; i++) {
			
			System.out.println("Funcionários #" + (i + 1) +":");
			System.out.println("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Salário: ");
			double salario = sc.nextDouble();

			f[i] = new Funcionarios(id, nome, salario);
			
		}
		
		System.out.println("Digite o id do funcionário que vai receber o aumento salarial: ");
		
		
		for(int i = 0; i < qtd; i++) {
			
			System.out.println(f[i]);
			
		}
		
		sc.close();
	}

}