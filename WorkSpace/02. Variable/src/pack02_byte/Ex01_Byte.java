package pack02_byte;

public class Ex01_Byte {
	public static void main(String[] args) {
		// {} <- main 지역
		// byte 타입의 변수 선언
		// 변수타입 변수명 ; <- 선언
		// 선언된 변수 = 값 ; <- 할당
		byte var1;
		var1 = 0;
		byte var2 = 10; 
		// byte는 관련된 8개의 비트로 구성됨
		// bit 0 또는 1 두 가지 정보를 표현할 수 있는
		// 최소한의 정보 표현 단위
		// -128~ 127 표현 가능
		// ※ 변수는 표현 범위가 있기 때문에 범위 내에서 사용
		var1 = -128;
		var2 = 127;
		System.out.println(var1);
		System.out.println(var2);
		
		
		
	}

}
