package pack01_base;

public class Ex02_CalculatorMain {
	public static void main(String[] args) {
	//멤버: 클래스를 인스턴스화하고 . 찍으면 나오는 모든 것들
		Ex02_Calculator ex = new Ex02_Calculator();
		ex.powerOn(0);
		//ex.powerOff();
		int result = ex.test()+10; //int타입을 무조건 return > int형 변수랑 같이 취급
		System.out.println(result);
		//String inputData = sc.nextLine();
		//nextLine()== String을 return하는 메소드
		result = ex.plus(5, 12);
		System.out.println(result);
		result =ex.plus3(1, 1, 1);
		System.out.println(result);
		result = (ex.plus3(1, 1, 1)/3);
		System.out.println(result);
	}

}
