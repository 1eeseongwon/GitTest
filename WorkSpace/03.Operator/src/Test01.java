
public class Test01 {
	public static void main(String[] args) {
		// int double String
		int num ; // 선언
		num = 100; // 할당 (값을 넣어 줌 =리터럴)
		double dNum1 = 3.14; //초기화
		double dNum2, dNum3; // 나열 (초기화도 가능)
		
		String str = "문자열";
		String numStr = "123"; // 문자열 숫자로 바꾸고 +10 결과 얻기
		System.out.println(numStr +10); // 12310
		int numInt = Integer.parseInt(numStr);//"123" > 123
		System.out.println(numInt + 10);
		String numStr2 = ""+numInt;
		System.out.println(numStr2);
		
	}

}
