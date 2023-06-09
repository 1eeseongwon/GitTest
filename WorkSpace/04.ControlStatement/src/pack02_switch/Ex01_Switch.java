package pack02_switch;

public class Ex01_Switch {
	public static void main(String[] args) {
		//제어문: 선택문(조건문 종류, 값) 
		//switch문: 다중 if문을 간략하게 표현한 것
		//기준값, 비교값을 두고 해당하는 값과 일치할 때 
		//실행할 case라는 블럭을 만들고 사용
		// switch(기준값 ex. score) {
		//    case 값 90 (score==90):
		//		실행 
		//		break; < ★ 제어문을 종료하고 블럭킹 지역을 빠져나감}
		int num = 2; // < 비교에 사용될 기준값이 되는 변수
		switch (num-1) { //
			case 1: // if(num==1)
				System.out.println("숫자 1");
				break; //★ 
			case 2: // else if(num==2)
				System.out.println("숫자 2");
				break;
			default:
				System.out.println("1과 2가 아님 else와 같다");
				break;
		}
		
		
	}//main

}
