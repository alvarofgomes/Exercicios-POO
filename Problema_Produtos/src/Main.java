import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite Os Dados Do Produtos: ");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Preço: ");
		double preco = sc.nextDouble();

		Produto p = new Produto(nome, preco);
		
		System.out.println("Dados Do Produto: " + p);
		System.out.println("------------------------------------------------------------");
		System.out.println("Adicone Mais Produtos Ao Estoque: ");
		p.AdicionarProdutos(sc.nextInt());
		
		System.out.println("Atualizando Produto:" + p);
		
		System.out.println("Remova Produtos Do Estoque: ");
		p.Removerprodutos(sc.nextInt());
		System.out.println("------------------------------------------------------------");
		System.out.printf("Atualizando Produto: " + p);
		
	}

}