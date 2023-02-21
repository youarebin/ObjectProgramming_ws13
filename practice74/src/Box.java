//컴퓨터학과_20220740_가유빈
public class Box {
	private int x, y, z;
	
	public Box(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public String toString() {
		String rslt = "";
		
		rslt += "가로: " + x;
		rslt += ", 세로: " + y;
		rslt += ", 높이: " + z;
		rslt += "\n부피: " + getVolume();
		rslt += "\n무게: " + String.format("%.2f",getWeight()) + "\n";
		
		return rslt;
	}
	
	public int getVolume() {
		return x*y*z;
	}
	public double getWeight () {
		return  x*y*z*1.1;
	}
}
