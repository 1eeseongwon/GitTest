
public class Test01 {
	public static void main(String[] args) {
		// int double String
		int num ; // ����
		num = 100; // �Ҵ� (���� �־� �� =���ͷ�)
		double dNum1 = 3.14; //�ʱ�ȭ
		double dNum2, dNum3; // ���� (�ʱ�ȭ�� ����)
		
		String str = "���ڿ�";
		String numStr = "123"; // ���ڿ� ���ڷ� �ٲٰ� +10 ��� ���
		System.out.println(numStr +10); // 12310
		int numInt = Integer.parseInt(numStr);//"123" > 123
		System.out.println(numInt + 10);
		String numStr2 = ""+numInt;
		System.out.println(numStr2);
		
	}

}
