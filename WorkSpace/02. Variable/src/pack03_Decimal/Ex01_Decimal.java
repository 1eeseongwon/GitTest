package pack03_Decimal;

public class Ex01_Decimal {
	public static void main(String[] args) {
		int i = 249495823;
		System.out.println(i);
		// int �̻��� ���� ���� �� �ִ� ������ Ÿ���� ������
		long l1;
		long l2 = 12345678901L; // ����+longŸ���̶�� ������
		System.out.println(l2);
		
		// �Ǽ��� ������ Ÿ��: float, double
		// �Ǽ����� �Ҽ��� �ִ� ���� ǥ���ϱ� ���� ����
		// float�� longó�� ������ F�� �ٿ� ��� ��
		// ���� ����, �Ҵ�, �ʱ�ȭ
		float f1; // ����
		f1 = 321.4F; // �Ҵ�
		float f2 = 3.15F; // �ʱ�ȭ
		double d1;
		d1 = 34.2;
		double d2 = 43.2;
		// �� ��ǥ��: int, double ��
		System.out.println(f1);
		System.out.println(d1);
		
	}

}
