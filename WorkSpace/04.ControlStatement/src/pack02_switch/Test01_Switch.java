package pack02_switch;

public class Test01_Switch {
	public static void main(String[] args) {
		int score = 80;
		//switch문을 이용해서 풀어보자
		// 90 이상 A학점
		// 80 이상 B학점
		// 70 이상 C학점
		// 그 외는 D학점
		
	switch (score / 10) {
	case 10:
		System.out.println("A");
		break;
	case 9:
		System.out.println("A");
		break;
	case 8:
		System.out.println("B");
		break;
	case 7:
		System.out.println("C");
		break;
	case 6:
		System.out.println("D");
		break;
	default:
		System.out.println("E");
		break;
	}
	} //main
}
