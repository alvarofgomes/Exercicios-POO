import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee funcio = new Employee();
		
		System.out.println("Dados Do Fúcionario: ");
		System.out.println("Name: ");
		funcio.setName(sc.nextLine());
		System.out.println("Gross Salary: ");
		funcio.setGrossSalary(sc.nextDouble());
		System.out.println("Tax: ");
		funcio.setTax(sc.nextDouble());
		System.out.println("--------------------");
		System.out.println(funcio.toString());
		System.out.println("--------------------");
		System.out.println("Wich percentage to increase salary:" );
		funcio.IncreseSalary(sc.nextDouble());
		System.out.println("--------------------");
		System.out.println(funcio.toStringUp());
		
		sc.close();

	}

}
