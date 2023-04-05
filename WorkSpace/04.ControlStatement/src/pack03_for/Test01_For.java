package pack03_for;

import java.util.Scanner;

public class Test01_For {
	public static void main(String[] args) {
		//다중 for문을 이용해서  별찍기
		// ★
		// ★★
		// ★★★
		// ★★★★
		// ★★★★★
		
		for (int i = 1; i<=5; i++) {
			for (int j = 0; j<i; j++) {
				System.out.print("*");
			} System.out.println();
				
		} System.out.println("======");
		
		//응용문제 Scanner를 이용해서 숫자를 입력 받는다.
		//입력 받은 숫자까지의 구구단을 출력하는 for문을 만들어보기 
		System.out.println("구구단 출력");
		System.out.println("2 미만의 숫자를 입력하면 구구단을 출력하지 않습니다");
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine();
		int multi = Integer.parseInt(inputData);
		if (multi<2) {
			System.out.println("구구단을 종료합니다");
		} else {
			System.out.println("출력할 구구단의 숫자를 입력하세요");
			new Scanner(System.in);
			String inputData2 = sc.nextLine();
			int user = Integer.parseInt(inputData2);
			for(int i=1; i<=9; i++) {
				System.out.println(user + "x" + i + "=" +user*i);
			}
			
			}
					
		
		
		
		
	}// main

}
