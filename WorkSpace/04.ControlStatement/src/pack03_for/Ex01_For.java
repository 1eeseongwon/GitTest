package pack03_for;

public class Ex01_For {
	public static void main(String[] args) {
		// 반복문: for문 (loop문, looping, 순환)
		// 사용 이유: 기계는 사람보다 반복적인 작업을 잘함 (정확, 일정)
		// for(반복에 사용할 변수 초기화; 조건식; 증감식) {
		//  반복구간 }
		
		//for(① int i = 0; ② i<10; ③ i++)
		//i가 0에서 9까지 총 10번 동작하는 반복문
		
		for (int i = 0; i<10;) { //무한 루프: 잘못된 반복문
			System.out.println("for문 변수 i의 값 : " + i);
			break;
		}
		int result = 0;
		for (int i = 0; i<18951; i+=2) {
			System.out.println("for문 변수 i의 값 : " + i);
			result = i;
		}
		System.out.println("i의 최종값 : " + result);
		// 쓰고 싶은데 어떻게 할까
		
	} // main

}
