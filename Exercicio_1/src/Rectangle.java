public class Rectangle {

	public double width;
	public double height;
	
	public double Area() {
		
		return this.width * this.height;
		
	}
	
	public double Perimeter() {
		
		return (this.width + this.height) * 2;
		
	}
	
	public double Diagonal() {
		
		return Math.sqrt((this.width * this.width) + (this.height * this.height));
		
	}
	
	public String toString() {
		
		return "Area = " + String.format("%.2f", Area()) + "\nPerimeter = " + String.format("%.2f", Perimeter()) + "\nDiagonal = " + String.format("%.2f", Diagonal());
		
	}
	
}