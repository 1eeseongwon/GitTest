package pack03_for;

import java.util.Scanner;

public class Test01_For {
	public static void main(String[] args) {
		//���� for���� �̿��ؼ�  �����
		// ��
		// �ڡ�
		// �ڡڡ�
		// �ڡڡڡ�
		// �ڡڡڡڡ�
		
		for (int i = 1; i<=5; i++) {
			for (int j = 0; j<i; j++) {
				System.out.print("*");
			} System.out.println();
				
		} System.out.println("======");
		
		//���빮�� Scanner�� �̿��ؼ� ���ڸ� �Է� �޴´�.
		//�Է� ���� ���ڱ����� �������� ����ϴ� for���� ������ 
		System.out.println("������ ���");
		System.out.println("2 �̸��� ���ڸ� �Է��ϸ� �������� ������� �ʽ��ϴ�");
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine();
		int multi = Integer.parseInt(inputData);
		if (multi<2) {
			System.out.println("�������� �����մϴ�");
		} else {
			
			}
					
		
		
		
		
	}// main

}
