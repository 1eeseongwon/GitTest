package pack03_for;

public class Ex04_ForFor {
	public static void main(String[] args) {
		//제어문은 무한하게 중첩이 가능하다 (순서x)
		// 1~10까지 반복 for문
//		for (int i = 1; i<=10; i++) {
//			System.out.println("i" + i);
//			// for문 넣어 보기
//			for (int j = 1; j <=10; j++) {
//				System.out.println("j"+j);
//			}
//		}
		
		// 구구단을 출력해 보기 
		// print와 println ㅈㅓㄱ절히 사용
		// ex 2 X 1 = 2, ...
		// 3 X 1 = 3...
		for (int i = 2; i<=9; i++) {
			for (int j = 1; j<=9; j++) {
				System.out.print(i + "x" + j+ "=" + (i*j)+" ");
			} System.out.println( );
		}
		// 다중 for문을 이용해서 별찍기
		
		
	}//main

}
