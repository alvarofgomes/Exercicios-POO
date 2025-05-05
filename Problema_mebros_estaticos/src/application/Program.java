package application;

import java.util.Locale;
import java.util.Scanner;
import util.Calcular;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite O Raio: ");
		double r = sc.nextDouble();
		
		double c = Calcular.circumferencia(r);
		double v = Calcular.volume(r);
		
		System.out.printf("Circumferencia: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calcular.PI);
		
		sc.close();

	}

}