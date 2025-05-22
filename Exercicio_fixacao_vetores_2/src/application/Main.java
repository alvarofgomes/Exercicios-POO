package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Produtos;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite A Quantidade De Produtos: ");
		int qtd = sc.nextInt();
		
		Produtos[] vet = new Produtos[qtd];
		for(int i = 0; i < vet.length; i++) {
			System.out.println("Digite O Nome Do " + (i+1) + "º Produto: ");
			String np  = sc.nextLine();
			sc.nextLine();
			System.out.println("Digite O Preço Do " + (i+1) + "º Produto: ");
			double preco = sc.nextDouble();
			vet[i] = new Produtos(np,preco);
			
		}

		double soma = 0.0;
		for(int i = 0; i < vet.length; i++) {
			
			soma += vet[i].getPrecoProduto();
			
		}
		
		System.out.printf("O Preço Médio Dos Produtos = %.2f", soma / qtd);
		
		sc.close();
	}

}