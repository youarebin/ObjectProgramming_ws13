//20220740_컴퓨터학과_가유빈
public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	private int area() {
		return width*height;
	}
	public boolean isSmallerThan(Rectangle s) {
		if(area() < s.area())
			return true;
		else
			return false;
	}
}
