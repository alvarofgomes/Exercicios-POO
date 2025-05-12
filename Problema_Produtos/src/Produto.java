public class Produto {

	private String nome;
	private double preco;
	private int estoque;
	
	public Produto(String nome, double preco, int estoque) {
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public double tot() {
		
		return preco * estoque;
		
	}
	
	public void AdicionarProdutos(int estoque) {
		
		this.estoque += estoque;
		
	}
	
	public void Removerprodutos(int estoque) {
		
		this.estoque -= estoque;
		
	}
	
	public String toString() {
		
		return nome + ", $ " + String.format("%.2f", preco) + ", " + " Unidades: " + estoque + " Total:" + String.format("%.2f", tot());
		
	}
	
}
