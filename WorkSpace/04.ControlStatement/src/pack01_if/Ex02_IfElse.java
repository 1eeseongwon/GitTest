package pack01_if;

public class Ex02_IfElse {
	public static void main(String[] args) {
		//if문: 단순if (조건식을 주고 해당하는 조건식이
		//true인 경우 블럭킹 만들어서 코드실행
		
		//if-else문: 단순 if문은 조건식이 true일 때만 O
		//if의 조건식이 true가 아닌 false라면 else라는 
		//키워드를 if문 뒤에 붙여 false 실행부를 만드는 것
		
		int score = 85;
		if(score % 2 == 0) {
			System.out.println("짝수");
				} else { //if문 뒤에만 사용 가능
					System.out.println("홀수");
				}
		System.out.println("----");
		// int형 변수 num1과 num2를 나열 통해서 초기화
		int num1 = 42, num2 = 50;
		
		// if-else 통해 두 수 비교하고 어떤 수가 큰지
		if (num1 > num2) {
			System.out.println("큰 수는 "+num1);
		} else {
			System.out.println("큰 수는 "+num2);
		}
		
//		if(score % 2 == 1) {
//			System.out.println("홀수");
//		}
	}//main

}//class
