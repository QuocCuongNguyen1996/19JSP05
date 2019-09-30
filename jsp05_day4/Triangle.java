package jsp05_day4;

public class Triangle extends Shape{
	public int base;
	public int height;
	public Triangle() {
		super();
		
	}
	public Triangle(String Color, int Base, int Height) {
		super();
		this.base=Base;
		this.height=Height;
		
	}
	public double getArea(int base, int height) {
		super.getArea();
		
		return 0.5*base*height;
		
	}
	public String toString(String color) {
		super.toString();
		
		return color;
		
	}

	public void processShape() {
		System.out.println("Mau la: "+toString("Yellow"));
		System.out.println("Dien tich la: "+getArea(5,10));
	}
	public static void main(String[] args) {
		Triangle tri =new Triangle();
		tri.processShape();
	}
}
