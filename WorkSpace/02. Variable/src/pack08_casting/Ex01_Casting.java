package pack08_casting;

public class Ex01_Casting {
	public static void main(String[] args) {
		int iNum = 10; //������ ���� a�� �ʱ�ȭ�ϰ� 10�� ���� ����
		double dNum = iNum; //�� ū Ÿ�Կ� ���� Ÿ�Կ� ������
							// �ڵ����� ��ȯ�� (�ڵ� ����ȯ)
		System.out.println(iNum);
		System.out.println(dNum);
		//�ڵ� ����ȯ�� �߻� ���� int > ū double
		//������ ����ȯ, Upcasting
		double dNum2 = 30.5;
		// int iNum2 = dNum2; ū > ���� = ����
		int iNum2 = (int) dNum2;  
		// ������ ����ȯ, DownCasting, Casting�� �Ϲ����� �ǹ�
		System.out.println(dNum2);
		System.out.println(iNum2); 
		// DownCasting�� ������ �߻���
		// ǥ���� �� ���� �����͸� ���� ����
		// �������� �ŷڼ�, ���ռ��� ������ ���ɼ��� ũ�� ����
		
		// long > int, int > float
		// ���� ���ڸ� ǥ���ϴ� ������ Ÿ�Գ����� ������
		// byte(-128~127) < int
		// int ������ byte�� ��ƺ���
		// 1. DownCasting
		int i1 = 128; 
		byte b1 = (byte) i1;
		System.out.println(i1);
		System.out.println(b1);
	
	}

}