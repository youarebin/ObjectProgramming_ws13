//컴퓨터학과_20220740_가유빈
import java.util.Scanner;

public class Practice73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Student s;
		Undergraduate ug;
		Graduate g;
		
		System.out.print("기본 장학금 비율: ");
		double rate = sc.nextDouble();
		
		System.out.print("첫번째 학생의 등록금: ");
		int sTuition=sc.nextInt();
		System.out.print("첫번째 학생의 평균등급: ");
		double sGpa = sc.nextDouble();
		s = new Student(1111,sTuition,sGpa);
		s.rate = rate;
		
		System.out.print("두번째 학생의 등록금: ");
		int ugTuition = sc.nextInt();
		System.out.print("두번째 학생의 평균등급: ");
		double ugGpa = sc.nextDouble();
		ug = new Undergraduate(2222,ugTuition,ugGpa,3);
		
		System.out.print("세번째 학생의 등록금: ");
		int gTuition = sc.nextInt();
		System.out.print("세번째 학생의 평균등급: ");
		double gGpa = sc.nextDouble();
		g = new Graduate(3333,gTuition,gGpa,"SE");
		
		System.out.println("입력된 학생들의 정보입니다.");
		System.out.println(s.toString());
		System.out.println(ug.toString());
		System.out.println(g.toString());
	}

}
