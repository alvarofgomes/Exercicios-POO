import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Media m = new Media();
		
		System.out.println("Nome: ");
		m.setName(sc.nextLine());
		System.out.println("Digite A 1º Nota Do Aluno: ");
		m.setN1(sc.nextDouble());
		System.out.println("Digite A 2º Nota Do Aluno: ");
		m.setN2(sc.nextDouble());
		System.out.println("Digite A 3º Nota Do Aluno: ");
		m.setN3(sc.nextDouble());
		
		m.Resultado();
		
	}

}