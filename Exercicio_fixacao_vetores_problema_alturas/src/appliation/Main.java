package appliation;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite Quantas Pessoas Serão Digitadas: ");
		int qtd = sc.nextInt();
		
		String[] vetNome = new String[qtd];
		int[] vetIdade = new int[qtd];
		double[] vetAltura = new double[qtd];
		
		for(int i = 0; i < qtd; i++) {
			
			System.out.println("Digite Os Dados Da " + (i + 1) + "º Pessoa");
			System.out.println("Nome: ");
			sc.nextLine();
			vetNome[i] = sc.nextLine();
			System.out.println("Idade: ");
			vetIdade[i] = sc.nextInt();
			System.out.println("Altura: ");
			vetAltura[i] = sc.nextDouble();
			
		}
		
		double s = 0.0;
		for(int i = 0; i < qtd; i++) {
			s += vetAltura[i];
		}
		System.out.println("Altura Média = " + String.format("%.2f",(s / qtd)));
		
		int menor16 = 0;
		for(int i = 0; i < qtd; i++) {

			if(vetIdade[i] < 16) {
				
				menor16 += 1;
				
			}
			
		}
		
		System.out.println("Porcentagem De Pessoas Com Menos De 16 Anos:" + ((double)menor16 / qtd) * 100 + "%");
		for(int i = 0; i < qtd; i++) {

			if(vetIdade[i] < 16) {
				
				System.out.println(vetNome[i] + " Tem Menos De 16 Anos.");
				
			}
			
		}
		
		sc.close();
		
	}

}