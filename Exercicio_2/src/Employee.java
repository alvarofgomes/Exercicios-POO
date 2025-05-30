public class Employee {

	private String name;
	private double grossSalary;
	private double tax;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double NetSalary() {
		
		return this.getGrossSalary() - this.tax;
				
	}
	
	public void IncreseSalary(double percentage) {
		
		this.grossSalary += (getGrossSalary() * percentage / 100);
		
	}
	
	public String toString() {
		
		return "Employee:" + this.getName() + ":" + String.format("%.2f", NetSalary()) + "R$";
		
	}
	
	public String toStringUp() {
		
		return "Update Data: " + this.getName() + ": " + String.format("%.2f", NetSalary()) + "R$";
		
	}
	
}
