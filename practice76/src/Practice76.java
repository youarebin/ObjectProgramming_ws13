//컴퓨터학과_20220740_가유빈
import java.util.Scanner;

public class Practice76 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사각형1의 가로를 입력: ");
		int w1 = sc.nextInt();
		System.out.print("사각형1의 세로를 입력: ");
		int h1 = sc.nextInt();
		
		Rectangle r1 = new Rectangle(w1,h1);
		
		System.out.print("사각형2의 가로를 입력: ");
		int w2 = sc.nextInt();
		System.out.print("사각형2의 세로를 입력: ");
		int h2 = sc.nextInt();
		
		Rectangle r2 = new Rectangle(w2,h2);
		
		if(r1.isSmallerThan(r2))
			System.out.print("사각형1의 넓이가 더 작습니다.");
		else if(r2.isSmallerThan(r1))
			System.out.print("사각형2의 넓이가 더 작습니다.");
		else
			System.out.print("두 사각형의 넓이는 같습니다.");
	}

}
