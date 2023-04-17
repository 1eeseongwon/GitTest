package pack01_base;

public class Ex04_Car {
	//해당하는 Car 클래스는 속성(변수) gas를 가진다
	//gas는 숫자형태로 속성이 관리가 된다
	//(Ex04_car는 gas를 무ㅈ호건 입력 받아야
	
	int gas;

	public Ex04_Car(int gas) {
		super();
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("가스가 없습니다.");
			return false; //리턴 결과(한줄씩실행된다)
		} else {
			System.out.println("가스가 있습니다.");
		}
		return true;//어디에있든상관ㄴ
	}
	//is,has로 끝나는 것 < boolean타입을 리턴하는 메소드 확률 98%
	//isLeftGas라는 메소드 구현
	//해당하는 메소드는 true 또는 false
	//판단은 가스가 0인 경우 
	//fasle와 가스없다 출력 아니면 반대
	
	//Ex04_CarMain을 만들고 모든 멤버 접근 호출 사용
	

}
