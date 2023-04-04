package pack01_if;

public class TestIF {
	public static void main(String[] args) {
		// 1. int형 변수 code 만든다
		// 1,3 이면 남자, 2,4면 여자, 그 외는 오류
		int code = 1;
		
		if (code==1 || code==3) {
			System.out.println("남자");
		} else if (code==2 || code==4) {
			System.out.println("여자");
		} else {
			System.out.println("오류");
		}
		System.out.println("--------");
		
		// 2. int random = (int) (Math.random() * 6)+1 ;
		// 조건문을 이용해서 random의 숫자가 몇인지를 출력하기
		//ex random(1) : 1이 출력되었습니다... ~6까지
		int random = (int) (Math.random()*6)+1;
		int random2 = (int) (Math.random()*6)+1;
		// System.out.println(random);
		if (random==1) {
			System.out.println(random+"이 출력되었습니다.");
		} else if (random==2) {
			System.out.println(random+"이 출력되었습니다.");
		} else if (random==3) {
			System.out.println(random+"이 출력되었습니다.");
		} else if (random==4) {
			System.out.println(random+"이 출력되었습니다.");
		} else if (random==5) {
			System.out.println(random+"이 출력되었습니다.");
		} else {
			System.out.println(random+"이 출력되었습니다");
		}
		
				
		// 3. 주사위 게임 만들기
		// int random = (int) (Math.random() * 6)+1 ; 이용
		// 첫 번째는 사용자, 두 번째는 컴퓨터
		// 누구의 주사위 수가 더 큰지
		// 나: 1, 컴퓨터: 6 > 결과: 컴퓨터가 이겼습니다.
		System.out.println("==========");
		int me = random;
		int com = random2;
		System.out.println("나: "+random+ " 컴퓨터: " +random2);
		if (me > com) {
			System.out.println("결과: 당신이 이겼습니다.");
			} else if (me < com) {
				System.out.println("결과: 컴퓨터가 이겼습니다");
			} else {
				System.out.println("결과: 비겼습니다");
			}
	}
}
