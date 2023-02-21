//컴퓨터학과_20220740_가유빈
public class Student {
	private int id, tuition;
	private double gpa;
	protected static double rate;
	private String name, major;
	
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
	public Student(int id, String name, String major) {
		this.id = id;
		this.name = name;
		this.major = major;
	}
	public int calcScholarship() {
		return (int)(getTuition()*getRate());
	}
	public boolean isTheSame(Student s) {
		if(id == s.id)
			return true;
		else
			return false;
	}
	@Override
	public String toString() {//public 없애보기
		String rslt = "";
		
		rslt += id + "/";
		rslt += name + "/";
		rslt += major + "/\n";
		
		return rslt;
	}
}
