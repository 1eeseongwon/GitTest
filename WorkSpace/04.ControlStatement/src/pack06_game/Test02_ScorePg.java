package pack06_game;

import java.util.Scanner;

public class Test02_ScorePg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = -1, eng = -1, mat = -1; // -1�̸� �Է� X ����
		System.out.println("���� ������ �Է��� �ּ���.");
		while (kor == -1) {// �ʱ⿡ -1�� ���� �ʱ�ȭ�߱� ������
							// �ʱ�ȭ�� �� ���¿��� ����ؼ� �ݺ�
			kor = Integer.parseInt(sc.nextLine()); // 0~100������ �Է�
			if (kor > 0 && kor <= 100) {
				System.out.println("���� �Է� �Ϸ�.");
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ� 0~100������ ����");
				kor = -1;
			}

		} // while 
		System.out.println("���� ������ �Է��� �ּ���");
		while (eng == -1) {// �ʱ⿡ -1�� ���� �ʱ�ȭ�߱� ������
			// �ʱ�ȭ�� �� ���¿��� ����ؼ� �ݺ�
			eng = Integer.parseInt(sc.nextLine()); // 0~100������ �Է�
			if (eng > 0 && eng <= 100) {
				System.out.println("���� �Է� �Ϸ�.");
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ� 0~100������ ����");
				kor = -1;
			}

		} // while 
		System.out.println("���� ������ �Է��� �ּ���");
		while (mat == -1) {// �ʱ⿡ -1�� ���� �ʱ�ȭ�߱� ������
			// �ʱ�ȭ�� �� ���¿��� ����ؼ� �ݺ�
			mat = Integer.parseInt(sc.nextLine()); // 0~100������ �Է�
			if (mat > 0 && mat <= 100) {
				System.out.println("���� �Է� �Ϸ�.");
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ� 0~100������ ����");
				kor = -1;
			}

		} // while 
		System.out.println("���� ����: " + kor);
		System.out.println("���� ����: " + eng);
		System.out.println("���� ����: " + mat);
		
		System.out.println("����: " +(kor+eng+mat));
		System.out.println("���: " +((double)(kor+eng+mat)/3));

	}// main

}
