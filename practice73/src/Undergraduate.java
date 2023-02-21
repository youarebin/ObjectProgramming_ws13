
public class Undergraduate extends Student{
	private int year;
	
	public void setYear(int year) {this.year = year;}
	public int getYear() {return year;}
	
	public Undergraduate() {
		super();
		this.year = 0;
	}
	public Undergraduate(int id, int tuition, double gpa, int year) {
		super(id,tuition,gpa);
		this.year = year;
	}
	public int calcScholarship() {
			return (int)(getTuition() * (super.calcScholarship()+ 10)/100);
	}
	
	public String toString() {
		String rslt = "";
		
		rslt += "학번: " + getId();
		rslt += ", 등록금: " + getTuition();
		rslt += ", 평균등급: " + String.format("%.2f",getGpa());
		rslt += ", 장학금: " + calcScholarship();
		rslt += ", 학년: " + getYear();
			
		return rslt;
	}
}
