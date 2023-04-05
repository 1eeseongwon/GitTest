package pack03_for;

import java.util.Scanner;

public class Ex03_DebugFor { 
	public static void main(String[] args) {
		//Bug: 알 수 없는 오류가 나오면서 정상 작동 안 할 때
		//Debug: 오류를 찾아서 바로 잡는 과정
		//디버깅은 매우 중요함
		//브레이킹 포인트 (중단점): 프로그램은 위에서 아래로 순차적 동작
		//특정 줄(스택)에 멈추고 해당하는 동작 전에 변수, 상황을
		//먼저 확인을 할 수 있는 점 (포인트)
		//1~10번째 줄까지 프로그램이 진행됨 ↑ 이용해서 특정줄(5)에서 멈춤
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine();
		int userNum = Integer.parseInt(inputData);
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		// 
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		
		
	} //main

}
