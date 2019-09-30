package jsp05_day4;

public class Rectangle extends Shape{
	public int lenght;
	public int width;
	public Rectangle() {
		super();
		
	}
	public Rectangle(String Color, int Lenght, int Width) {
		super();
		this.lenght=Lenght;
		this.width=Width;
		
	}
	public double getArea(int lenght, int width) {
		super.getArea();
		
		return lenght*width;
		
	}
	public String toString(String color) {
		super.toString();
		
		return color;
		
	}
	public void processShape() {
		System.out.println("Mau la: "+toString("Gray"));
		System.out.println("Dien tich la: "+getArea(6,20));
	}
	public static void main(String[] args) {
		Rectangle rec =new Rectangle();
		rec.processShape();
	}
}
