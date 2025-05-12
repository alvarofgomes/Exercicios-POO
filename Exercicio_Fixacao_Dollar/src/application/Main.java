package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calc;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite O Valor Do Dollar: ");
		double valorDollar = sc.nextDouble();
		System.out.println("Digite a quantidade Do Dollar: ");
		double qtdDollar = sc.nextDouble();
		
		double valorFinal = Calc.converterDollar(valorDollar, qtdDollar);

		System.out.printf("Valor Do Dollar: %.2f%n", valorFinal);
		
		sc.close();

	}

}