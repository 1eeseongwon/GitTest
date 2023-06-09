package pack08_casting;

public class Ex01_Casting {
	public static void main(String[] args) {
		int iNum = 10; //정수형 변수 a를 초기화하고 10을 담은 상태
		double dNum = iNum; //더 큰 타입에 작은 타입에 담으면
							// 자동으로 변환함 (자동 형변환)
		System.out.println(iNum);
		System.out.println(dNum);
		//자동 형변환이 발생 작은 int > 큰 double
		//묵시적 형변환, Upcasting
		double dNum2 = 30.5;
		// int iNum2 = dNum2; 큰 > 작은 = 오류
		int iNum2 = (int) dNum2;  
		// 명시적 형변환, DownCasting, Casting의 일반적인 의미
		System.out.println(dNum2);
		System.out.println(iNum2); 
		// DownCasting은 문제가 발생함
		// 표현할 수 없는 데이터를 버려 버림
		// 데이터의 신뢰성, 정합성이 떨어질 가능성이 크니 주의
		
		// long > int, int > float
		// 같은 숫자를 표현하는 데이터 타입끼리는 가능함
		// byte(-128~127) < int
		// int 변수를 byte에 담아보기
		// 1. DownCasting
		int i1 = 128; 
		byte b1 = (byte) i1;
		System.out.println(i1);
		System.out.println(b1);
	
	}

}
