package pack09_scanner;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		// Scanner(�Է�) -> �ڹ�(���) -> �ܼ�â
		Scanner sc = new Scanner(System.in);
		// �ܺο��� ������ �����͸� ����� ���� ���� �ܿ��� ���
		System.out.println("����Ұų�");
		String inputData = sc.nextLine();

		System.out.println("������� �Դ�");
		
		int Num1 = Integer.parseInt(inputData) + 10;
		System.out.println(Num1);
		// �ܺο��� �Է��� ���ڴ� String ���·� inputData ������ ����
		// �����Ϳ� +10�� �� ��� ����� ����
		
		
	}

}