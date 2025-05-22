package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluguel;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] vet = new Aluguel[10];
		
		System.out.println("Quantos Quartos Serão Digitados: ");
		int qtd =  sc.nextInt();
		
		for(int i = 0; i < qtd; i++) {
			sc.nextLine();
			System.out.println("Aluguel: #" + (i + 1));
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Número Do Quarto: ");
			int quarto = sc.nextInt();
			
			vet[quarto] = new Aluguel(nome, email);
		
		}
		
		System.out.println();
		System.out.println("Quarto Ocupado: ");
		for(int i = 0; i < 10; i++) {
			
			if(vet[i] != null) {
				
				System.out.println(i + ":" + vet[i]);
				
			}
			
		}
		
		sc.close();
	}

}
