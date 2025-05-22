package application;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos Números Serão Digitados: ");
		int qtd = sc.nextInt();
		
		double[] vet = new double[qtd];
		for(int i = 0; i < vet.length; i++) {
			
			System.out.println("Digite O" + (i + 1) + "º Número: ");
			vet[i] = sc.nextDouble();
			
		}
		
		double s = 0.0;
		for(int i = 0; i < vet.length; i++) {

			s += vet[i];
			
		}
		
		System.out.print("Valores = ");
		for(int i = 0; i < vet.length; i++) {
			
			System.out.print(String.format("%.1f ", vet[i]));
			
		}
		System.out.println();
		System.out.println("Soma = " + String.format("%.2f", s));
		System.out.println("Média = " + (s / qtd));
		
		sc.close();
	}

}