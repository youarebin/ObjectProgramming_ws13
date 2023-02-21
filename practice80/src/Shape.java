//컴퓨터학과_20220740_가유빈
public class Shape {
	int x,y;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		String rslt = "";
		
		rslt += "중심좌표: (" + x + ", " + y + ")\n";
	
		return rslt;
	}
}
