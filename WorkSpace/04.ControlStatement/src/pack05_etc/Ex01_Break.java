package pack05_etc;

import java.util.Scanner;

public class Ex01_Break {
	public static void main(String[] args) {
		//break���� ����� �����ϰ� ���������� ���
		//���ѷ����ϴ� �ݺ��� �ؿ� �ڵ尡 ������ ���� (������ ����x)
		//���ѷ��� ����� ���� ���Ḧ ���� ���� �����ϰ�
		//��ĳ�ʷ� -1 �Է��ϸ� ����ǰ� ����� ����
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("������");
			int num = Integer.parseInt(sc.nextLine());
			if(num==-1) {
				System.out.println("����");
				break;
			} else if (num==1) {
				System.out.println("1�� �޴��� ���� �ڵ�");
			} else {
				System.out.println("�߸��� �Է�");
			}
		}
		
	
		
	
	}//main

}
