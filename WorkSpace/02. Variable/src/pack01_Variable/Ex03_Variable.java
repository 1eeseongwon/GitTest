package pack01_Variable;

public class Ex03_Variable { 
	public static void main(String[] args) {
		
		int value = 0 ; // 변수 선언하기
		int result = value + 10; 
		
//		int value = 10;
//		int result = value + 10;
		// 숫자형 변수들은 사칙연산이 가능하다
		// 재할당 (값을 다시 줘서 바꿈)
		result = 25/5;
		System.out.println(result);
		result = 2*5;
		System.out.println(result);
		result = 5-2;
		System.out.println(result);
		
		result = value; // 같은 타입의 변수는 값을 담을 수 있다
		
	}

}
