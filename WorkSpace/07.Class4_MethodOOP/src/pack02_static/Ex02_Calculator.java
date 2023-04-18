package pack02_static;

public class Ex02_Calculator {
	//
	
	static int plus(int num1, int num2) {
		return num1+num2;
	}
	static int minus(int num1, int num2) {
		return num1-num2;
	}
	static int mul(int num1, int num2) {
		return num1*num2;
	}
	static int div(int num1, int num2) {
		return num1/num2;
	}
	
	//인스턴스멤버: 인스턴스화한 객체에 . 찍으면 나옴
	//스태틱 멤버: 클래스에 . 찍으면 나옴
	
	public static void main(String[] args) {
		System.out.println(Ex02_Calculator.plus(4, 4));
		System.out.println(Ex02_Calculator.minus(4, 4));
		System.out.println(Ex02_Calculator.mul(4, 4));
		System.out.println(Ex02_Calculator.div(4, 4));
		
	}

}
