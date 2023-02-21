//컴퓨터학과_20220740_가유빈
public class Practice80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(4,5,10.0);
		Cylinder cy1 = new Cylinder();
		Cylinder cy2 = new Cylinder(10,20,5.0,3.0);
		
		System.out.println("Circle 객체에 대한 정보입니다.");
		System.out.print(c.toString());
		
		System.out.println("Cylinder 객체 1에 대한 정보입니다.");
		System.out.print(cy1.toString());
		
		System.out.println("Cylinder 객체 2에 대한 정보입니다.");
		System.out.print(cy2.toString());
	}

}
