import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		Triangulo areaX = new Triangulo();
		Triangulo areaY = new Triangulo();
		
		System.out.println("Digite O três lados do triângulo X: ");
		areaX.a = sc.nextDouble();
		areaX.b = sc.nextDouble();
		areaX.c = sc.nextDouble();
		
		System.out.println("Digite O três lados do triângulo X: ");
		areaY.a = sc.nextDouble();
		areaY.b = sc.nextDouble();
		areaY.c = sc.nextDouble();
		 
		double ax = areaX.area();
		double ay = areaY.area();

		
		System.out.printf("%.4f\n", ax);
		System.out.printf("%.4f\n", ay);
		
		if(ax > ay) {
			
			System.out.println("O Triângulo X é maior que o Y. ");
			
		}else {
			
			System.out.println("O Triângulo Y é maior que o X. ");
			
		}
		
	}

}