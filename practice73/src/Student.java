
public class Student {
	private int id, tuition;
	private double gpa;
	protected static double rate;
	
	public void setTuition(int tuition) {this.tuition = tuition;}
	public void setGpa(double gpa) {this.gpa = gpa;}
	public void setRate(double rate) {
		//this.rate = rate;
		Student.rate = rate;
		}
	
	public int getTuition() {return tuition;}
	public double getGpa() {return gpa;}
	public int getId() {return id;}
	public double getRate() {return rate;}
	
	public Student() {
		this.id = 0;
		this.tuition = 0;
		this.gpa = 0;
	}
	public Student(int id, int tuition, double gpa) {
		this.id = id;
		this.tuition = tuition;
		this.gpa = gpa;
	}
	public int calcScholarship() {
		return (int)(getTuition()*getRate());
	}
	@Override
	public String toString() {//public 없애보기
		String rslt = "";
		
		rslt += "학번: " + getId();
		rslt += ", 등록금: " + getTuition();
		rslt += ", 평균등급: " + String.format("%.2f",getGpa());
		rslt += ", 장학금: " + calcScholarship();
		
		return rslt;
	}
}
