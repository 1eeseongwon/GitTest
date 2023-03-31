package pack03_Decimal;

public class Ex01_Decimal {
	public static void main(String[] args) {
		int i = 249495823;
		System.out.println(i);
		// int 이상의 값을 담을 수 있는 정수형 타입이 존재함
		long l1;
		long l2 = 12345678901L; // 숫자+long타입이라는 구분자
		System.out.println(l2);
		
		// 실수형 데이터 타입: float, double
		// 실수형은 소숫점 있는 것을 표현하기 위해 존재
		// float는 long처럼 구분자 F를 붙여 줘야 함
		// 변수 선언, 할당, 초기화
		float f1; // 선언
		f1 = 321.4F; // 할당
		float f2 = 3.15F; // 초기화
		double d1;
		d1 = 34.2;
		double d2 = 43.2;
		// ★ 대표적: int, double ★
		System.out.println(f1);
		System.out.println(d1);
		
	}

}
