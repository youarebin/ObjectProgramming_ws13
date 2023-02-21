//컴퓨터학과_20220740_가유빈
public class BodyData {
	private int weight;
	private int height;
	
	//접근자와 설정자
	public void setWeight(int weight) {this.weight = weight;}
	public int getWeight() {return weight;}
	public void setHeight(int height) {this.height = height;}
	public int getHeight() {return height;}
	
	public int idealWeight() {
		return getHeight() - 110;
	}
	public boolean isTallerThan(BodyData b) {
		if(b.getHeight() < height)
			return true;
		else
			return false;
	}
	public boolean needDiet() {
		if(weight > idealWeight())
			return true;
		else
			return false;
	}
}