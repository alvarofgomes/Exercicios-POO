package application;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite A Quantidade da Entrada: ");
		n = sc.nextInt();
		
		double[] v = new double[n];
		double soma = 0.0;
		
		System.out.println("Digite " + n + " Alturas:");
		
		for(int i = 0; i < n; i++) {
			
			v[i] = sc.nextDouble();
			soma += v[i];
		}
		
		System.out.println("Altura Média = " + String.format("%.2f", (soma / n)));
		
		sc.close();

	}

}