package pack01_if;

import java.util.Scanner;

public class Test_DiceGame {
	public static void main(String[] args) {
		// ex) ����ڰ� � ������ ���� �� ������ ����Ǵ� �� == ����
		// �� vs ��ǻ��
		System.out.println("�ֻ��� ������ �����մϴ�.");
		System.out.println("-1�� �Է��ϸ� �����մϴ�. �� �ܿ��� ����");
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine(); 
		//����ڰ� ����Ű�� ���� �� �ԷµǾ� �ִ� �� ����
		int num = Integer.parseInt(inputData);
		if (num==-1) {
			System.out.println("�����մϴ�.");
		} else {
			System.out.println("���� ����");
			System.out.println("����ڰ� �ֻ����� ���� �����Դϴ� (������ ENTER)");
			sc.nextLine(); //���� ���� ������ ��� (���⼭ ���� �����ʹ� ���� x)
			int userNum = (int) (Math.random()*6)+1; // 1~6���� ���� �������� ������ ���� �޼ҵ�
			System.out.println("������� ��: " + userNum);
			System.out.println("��ǻ�Ͱ� �ֻ����� ���� �����Դϴ� (������ ENTER)");
			sc.nextLine();
			int comNum = (int) (Math.random()*6)+1; // 1~6���� ���� �������� ������ ���� �޼ҵ�
			System.out.println("��ǻ���� ��: " + comNum);
			if (userNum > comNum) {
				System.out.println("������ �̰���ϴ�");
			} else if (userNum < comNum) {
				System.out.println("��ǻ�Ͱ� �̰���ϴ�");
			} else {
				System.out.println("�����ϴ�");
			} //���� �·��� 20% �����ؼ� ���
		} 
		
		
		
		
	}

}
