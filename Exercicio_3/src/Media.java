public class Media {

	private double n1;
	private double n2;
	private double n3;
	private String name;
	
	public double getN1() {
		return n1;
	}
	public void setN1(double n1) {
		this.n1 = n1;
	}
	public double getN2() {
		return n2;
	}
	public void setN2(double n2) {
		this.n2 = n2;
	}
	public double getN3() {
		return n3;
	}
	public void setN3(double n3) {
		this.n3 = n3;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double NotaFinal() {
		
		return getN1() + getN2() + getN3();
		
	}
	
	public double Resto() {
		
		return 60 % NotaFinal();
		
	}
	
	public void Resultado() {
		
		if (NotaFinal() >= 60) {
			
			System.out.printf("Final Grade = %.2f\n", NotaFinal());
			System.out.println("PASS!");
			
		}
		else {
			
			System.out.printf("Final Grade = %.2f\n", NotaFinal());
			System.out.println("FAILED!");
			System.out.printf("MISSING %.2f POINTS ", Resto());
			
		}
		
	}
	
}