package pack03_constructor;

public class Ex03_CarMain {
	public static void main(String[] args) {
		Ex03_Car myCar = new Ex03_Car("현대","그랜져","검정");
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.color);
	}

}
