//컴퓨터학과_20220740_가유빈
public class Circle extends Shape{
	double radius;
	
	public Circle() {
		super(0,0);
		radius = 0;
	}
	public Circle(double radius) {
		this();
	}
	public Circle(int x, int y, double radius) {
		super(x,y);
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}
	double getArea() {
		return 3.14 * radius * radius;
	}
	
	public String toString() {
		String rslt = "";
		
		rslt += super.toString();
		rslt += "반지름: " + radius + "\n";
		rslt += "단면적: " + String.format("%.2f",getArea()) + "\n";
		
		return rslt;
	}
}
