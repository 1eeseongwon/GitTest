package pack04_while;

import java.util.Scanner;

public class Test02_While {
	public static void main(String[] args) {
		// 별찍기
		int i = 1;
		while (i<=5) {
			int j = 0;
			while (j<i) {
				System.out.print("*");
				j++;
			} i++; System.out.println();
		}
		
		
		// 구구단 출력
		System.out.println("구구단 출력");
		System.out.println("숫자를 입력해 주세요");
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine();
		int userNum = Integer.parseInt(inputData);
		if (userNum < 2) {
			System.out.println("오류입니다");
		} 
		
		
		
		
	}//main

}
