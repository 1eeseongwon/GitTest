package pack03_for;

public class Ex02_For {
	public static void main(String[] args) {
		// 제어문은 무한하게 중첩이 가능함
		// 0~9까지 열 번 반복하는 반복문 안 보고
		// 1~10까지
		
		// 1부터 10까지의 누적합을 구하시오.
		int sum = 0;
		for (int i = 1; i<=10; i++) {
			sum += i;
			// 짝수, 홀수
//			if (i%2 == 0) {
//				System.out.println("짝수" + i);
//			} else {
//				System.out.println("홀수" + i);
//			}
		} System.out.println(sum);
		
		
	} //main

}
