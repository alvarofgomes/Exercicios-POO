package application;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos Números Serão Digitados: ");
		int qtd = sc.nextInt();
		
		int[] vet = new int[qtd];
		for(int i = 0; i < qtd; i++) {
			
			System.out.println("Digite O " + (i + 1) + "º Número: ");
			vet[i] = sc.nextInt();
			
		}
		
		System.out.println("Números Negativos: ");
		for(int i = 0; i < qtd; i++) {
			
			if(vet[i] < 0) {
				
				System.out.println(vet[i]);
				
			}
			
		}
		
		sc.close();
	}

}
