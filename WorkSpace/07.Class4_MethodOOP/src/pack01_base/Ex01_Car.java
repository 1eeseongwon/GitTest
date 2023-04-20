package pack01_base;

public class Ex01_Car {
//클래스의 중괄호 사이 (블럭킹 내부)에 있는 모든 것들은 해당하는 이름의 클래스 멤버
//자동차의 속력, 최대속력, 색상, 제조사 등의 속성은 필드로 관리를 하고,
//자동차가 달리거나 멈추거나 하는 기능의 관리는 메소드로 한다
	int speed; //자동차의 속력 (기본값 0)
	
//멤버의 구분: 
	//1. 인스턴스 멤버(IM, Iv(인스턴스변수), im(인서턴스메소드...)
	//인스턴스화 과정을 거쳐야만 사용이 가능하다. (☆new class();
	//인스턴스 멤버끼리는 언제든지 접근이 가능하다.
	
	//2. 스태틱멤버(Sm,sv, sm.. : static
	//메모리 별도에 인스턴스화 과정없이 올라가기 때문에 언제든 사용 가능
	//단 메모리에 항상 먼저 올라가야 하기 때문에 인스턴스 멤버에 접근이 불가
	//인스턴스화 과정 후 사용 가능
	
	void run() {
		System.out.println(speed + "로 달린다.");
		
	}
	public static void main(String[] args) {
		Ex01_Car car = new Ex01_Car();
		car.run();
	}
}