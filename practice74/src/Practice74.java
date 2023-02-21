//컴퓨터학과_20220740_가유빈
import java.util.Scanner;

public class Practice74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Box box;
		MaterialBox box1;
		MaterialBox box2;
		
		System.out.print("box1의 정보를 입력하세요.\n");
		System.out.print("가로: ");
		int x = sc.nextInt();
		System.out.print("세로: ");
		int y = sc.nextInt();
		System.out.print("높이: ");
		int z = sc.nextInt();
		box = new Box(x,y,z);
		
		System.out.print("box2의 정보를 입력하세요.\n");
		System.out.print("가로: ");
		int x2 = sc.nextInt();
		System.out.print("세로: ");
		int y2 = sc.nextInt();
		System.out.print("높이: ");
		int z2 = sc.nextInt();
		System.out.print("재질: ");
		String a2 = sc.next();
		box1 = new MaterialBox(x2,y2,z2,a2);
		
		System.out.print("box3의 정보를 입력하세요.\n");
		System.out.print("가로: ");
		int x3 = sc.nextInt();
		System.out.print("세로: ");
		int y3 = sc.nextInt();
		System.out.print("높이: ");
		int z3 = sc.nextInt();
		System.out.print("재질: ");
		String a3 = sc.next();
		box2 = new MaterialBox(x3,y3,z3,a3);
		
		System.out.print("box1의 정보입니다.\n");
		System.out.print(box.toString());
		
		System.out.print("\nbox2의 정보입니다.\n");
		System.out.print(box1.toString());
		
		System.out.print("\nbox3의 정보입니다.\n");
		System.out.print(box2.toString());
		
	}

}
