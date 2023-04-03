
public class Ex03_Bool {
	public static void main(String[] args) {
		// true 와 false 저장만 되는 변수타입
		// true (1), false (0)
		// AND 연산자는 논리곱
		// TRUE(1) * FALSE(0) = FALSE 
		// 논리곱은 모든 조건이 TRUE일 때만 TRUE
		// ex) 로그인
		
		// OR 연산자는 논리합
		// TRUE(1) + FALSE(0) = TRUE
		// 하나의 TRUE가 전체 조건식을 TRUE로 만든다
		// 한 가지 조건만 만족시키면 
		// 좋아하는 과일을 한 가지 이상 선택해 주세요
		// AND 연산자 &&, OR 연산자 |
		
		// ★ NOT -> !
		// 어떤 true, false(bool)앞에 붙이면 해당 결과 반전시킴
		
		boolean bTrue = true, bFalse = false;
		System.out.println(!bTrue);
		System.out.println(!bFalse);
		
	}
}
