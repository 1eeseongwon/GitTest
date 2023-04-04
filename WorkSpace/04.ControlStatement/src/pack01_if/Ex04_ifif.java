package pack01_if;

public class Ex04_ifif {
	public static void main(String[] args) {
		// 블럭킹의 기본 개념: { < 메모리에 올림 } < 내림
		// 효율적으로 쓰기 위해 올리고 내리는 과정이 존재함
		// 블럭킹(지역)은 계속해서 중첩이 가능
		
		//제어문이 3개 이상 중첩되는 경우에는
		//내가 코드를 맞게 짰는지 의심해 보자
		
		int score = 15;
		//if문을 중첩시켜서 score가 짝수이면 짝수 출력
		//score가 10이 10이라는 문자열 출력
		//11보다 작으면 11보다 작음이란 문자열을 출력
	
		if(score%2==0) {
			System.out.println("짝수");
			if(score==10) {
				System.out.println("10");
				if(score<11) {
					System.out.println("11보다 작음");
				} else {
					System.out.println("11보다 큼");
				}
			} else {
				System.out.println("10 아님");
			}
		} else {
			System.out.println("홀수");
		}
		// 스파게티 코드: 이상하게 꼬아서 짜놓음 (쓰지 말자)
		

	}

}
