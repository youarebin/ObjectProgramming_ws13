//컴퓨터학과_20220740_가유빈
public class MaterialBox extends Box{
	private String attribute;
	
	public void setAttribute(String attribute) {this.attribute = attribute;}
	public String getAttribute() {return attribute;}
	
	public MaterialBox(int x, int y, int z, String attribute) {
		super(x,y,z);
		this.attribute = attribute;
	}
	public double getWeight () {
		if(attribute == "paper")
			return getVolume()*1.5;
		else if(attribute == "wood")
			return getVolume()* 2.5;
		else
			return getVolume()*1.1;
	}
	@Override
	public String toString() {
		String rslt = "";
		
		System.out.print(super.toString());
		rslt += "\n부피: " + getVolume();
		rslt += "\n무게: " + String.format("%.2f",getWeight());
		rslt += "\n재질: " + getAttribute() + "\n";
		
		return rslt;
	}
}
