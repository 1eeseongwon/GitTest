package pack04_while;

import java.util.Scanner;

public class Test02_While {
	public static void main(String[] args) {
		// �����
		int i = 1;
		while (i<=5) {
			int j = 0;
			while (j<i) {
				System.out.print("*");
				j++;
			} i++; System.out.println();
		}
		
		
		// ������ ���
		System.out.println("������ ���");
		System.out.println("���ڸ� �Է��� �ּ���");
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine();
		int userNum = Integer.parseInt(inputData);
		if (userNum < 2) {
			System.out.println("�����Դϴ�");
		} 
		
		
		
		
	}//main

}
