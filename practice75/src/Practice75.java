//컴퓨터학과_20220740_가유빈
import java.util.Scanner;

public class Practice75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		BodyData bt1 = new BodyData();
		BodyData bt2 = new BodyData();
		
		System.out.print("내 키를 입력하세요: ");
		bt1.setHeight(sc.nextInt());
		System.out.print("내 몸무게를 입력하세요: ");
		bt1.setWeight(sc.nextInt());
		
		System.out.print("당신의 키를 입력하세요: ");
		bt2.setHeight(sc.nextInt());
		System.out.print("당신의 몸무게를 입력하세요: ");
		bt2.setWeight(sc.nextInt());

		if(bt1.isTallerThan(bt2))
			System.out.print("\n키는 내가더 큽니다.");
		else
			System.out.print("\n키는 당신이 더 큽니다.");
		
		if(bt1.needDiet())
			System.out.println("\n나는 다이어트가 필요합니다.");
		else
			System.out.println("\n나는 다이어트가 필요하지 않습니다.");
		
		if(bt2.needDiet())
			System.out.println("당신은 다이어트가 필요합니다.");
		else
			System.out.println("당신은 다이어트가 필요하지 않습니다.");
	}

}
