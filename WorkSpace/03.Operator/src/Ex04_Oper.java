
public class Ex04_Oper {
	public static void main(String[] args) {
		//사칙연산 + 나머지
		int value1 = 5, value2 = 2;
		// 두 변수의 사칙연산결과 출력
		// 연산 순서
		// 연산을 먼저 하는 구분자 ( )
		System.out.println("value1 + value2 = "+(value1 + value2));
		System.out.println("value1 + value2 = "+(value1 - value2) );
		// String-int 불가능하기 때문에 () 우선순위
		System.out.println("value1 + value2 = "+ (value1 * value2));
		System.out.println("value1 + value2 = " + (+value1 / value2));
		// 연산식과 String이 더해질 때는 따로 () 감싸주기
		System.out.println("나머지는 %로 구한다" + (value1 % value2));
		
	}
}
