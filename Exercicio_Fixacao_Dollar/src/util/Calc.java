package util;

public class Calc {

	public static final double IOF = 6.0;
	
	public static double converterDollar(double d,double qtddollar) {
		
		double bruto = d * qtddollar;
		double total = ((bruto * IOF) / 100) + bruto;
		
		return total;
		
	}
	
}