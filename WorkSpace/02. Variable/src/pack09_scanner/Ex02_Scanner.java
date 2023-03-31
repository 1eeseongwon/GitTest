package pack09_scanner;

import java.util.Scanner;

public class Ex02_Scanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 외우자
		String inputData1 = sc.nextLine();
		String inputData2 = sc.nextLine();
		int sum = Integer.parseInt(inputData1)
				+ Integer.parseInt(inputData2);
		System.out.println(sum);
		
	// System.out.println(Integer.parseInt(inputData1)
	// + Integer.parseInt(inputData2)); > 이것도 됨
		

		
	}

}
