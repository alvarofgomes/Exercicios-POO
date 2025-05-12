package application;

import java.util.*;

public class Banco {

	Scanner sc = new Scanner(System.in);
	
	private int n;
	private String titular;
	private double saldo;
	
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void deposito(double qtd) {
		
		this.saldo += qtd;
		
	}
	
	public void saque(double qtd) {
		
		this.saldo -= qtd;
		
	}
	
	public void teste(String res) {
		
		if(res.equals("s")) {
			
			System.out.println("Digite o valor do depósito inicial: ");
			setSaldo(sc.nextDouble());
			
		}else {
			
			setSaldo(0);
			
		}
		
	}
	
	public String toString() {
		
		return "Dados Da Conta: \n" + "Conta:" + getN() + "\nTítular:" + getTitular() + 
				"\nSaldo:" + getSaldo();
		
	}

}
