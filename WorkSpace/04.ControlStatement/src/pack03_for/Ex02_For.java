package pack03_for;

public class Ex02_For {
	public static void main(String[] args) {
		// ����� �����ϰ� ��ø�� ������
		// 0~9���� �� �� �ݺ��ϴ� �ݺ��� �� ����
		// 1~10����
		
		// 1���� 10������ �������� ���Ͻÿ�.
		int sum = 0;
		for (int i = 1; i<=10; i++) {
			sum += i;
			// ¦��, Ȧ��
//			if (i%2 == 0) {
//				System.out.println("¦��" + i);
//			} else {
//				System.out.println("Ȧ��" + i);
//			}
		} System.out.println(sum);
		
		
	} //main

}
