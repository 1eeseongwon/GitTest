package pack03_for;

import java.util.Scanner;

public class Ex03_DebugFor { 
	public static void main(String[] args) {
		//Bug: �� �� ���� ������ �����鼭 ���� �۵� �� �� ��
		//Debug: ������ ã�Ƽ� �ٷ� ��� ����
		//������� �ſ� �߿���
		//�극��ŷ ����Ʈ (�ߴ���): ���α׷��� ������ �Ʒ��� ������ ����
		//Ư�� ��(����)�� ���߰� �ش��ϴ� ���� ���� ����, ��Ȳ��
		//���� Ȯ���� �� �� �ִ� �� (����Ʈ)
		//1~10��° �ٱ��� ���α׷��� ����� �� �̿��ؼ� Ư����(5)���� ����
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
