//컴퓨터학과_20220740_가유빈
public class Graduate extends Student{
	private String lab;
	
	public void setLab(String lab) {this.lab = lab;}
	public String getLab() {return lab;}
	
	public Graduate() {
		super();
		this.lab = "";
	}
	public Graduate(int id, int tuition, double gpa, String lab) {
		super(id,tuition,gpa);
		this.lab = lab;
	}
	public int calcScholarship() {
		if(getGpa() > 3.5)
			return (int)(getTuition() * (super.calcScholarship()+ 20)/100);
		else
			return super.calcScholarship();
	}
	@Override
	public String toString() {
		String rslt = "";
			
		rslt += "학번: " + getId();
		rslt += ", 등록금: " + getTuition();
		rslt += ", 평균등급: " + String.format("%.2f",getGpa());
		rslt += ", 장학금: " + calcScholarship();
		rslt += ", 연구실: " + getLab();
			
		return rslt;
	}
}
