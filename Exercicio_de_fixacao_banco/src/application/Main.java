package application;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Banco b = new Banco();
		
		System.out.println("Digite o número da conta: ");
		b.setN(sc.nextInt());
		sc.nextLine();
		System.out.println("Digite o nome do titular da conta: ");
		b.setTitular(sc.nextLine());
		System.out.println("Há um depósito inicial?(s/n)");
		String res = sc.nextLine();
		
		b.teste(res);
		
		System.out.println(b);
		
		System.out.println("Digite o valor do depósito: ");
		b.deposito(sc.nextDouble());
		
		System.out.println("Atualização dos dados da conta: " + b);
		
		System.out.println("Digite o valor do saque: ");
		b.saque(sc.nextDouble());
		
		System.out.println("Atualização dos dados da conta: " + b);
		
		sc.close();
		
	}

}
