package pack08_casting;

public class Ex02_Casting {
	public static void main(String[] args) {
		// ���ڿ� = "12" + 34 = 1234
		// String + int = String
		// ���ڿ� + � �� = ���ڿ� ��Ģ
		// ���ڿ� ������ ��Ģ ��
		// "1"(String) == 1(int, double) (�ٸ���)
		
		String sum = "12" + 34;
		// � ���� String���� �ٲٴ� ���� �����ϴ�
		String sum2 = ""+1234+10; 
		System.out.println(sum2);
		
		// String sum, sum2 ������ ���ڿ��� ���ڸ� ������ ��
		// �� ���� ���� �˰� �ʹ� "1234" + 1234 = 12341234
		// ���� 1234 + 1234 = 2468�� ����� ���� ��
		// String -> int ?
		// int, double �� ��������� �۾� �ٲ�� �� > �⺻ Ÿ��
		// �빮�ڷ� �����ϴ� �͵��� ��κ� ClassŸ��
		// �⺻ ������ Ÿ���� Wrapper class��� ���� ������ �ִ�
		// int = ��Integer��, double = Double
		// String�� �ش��ϴ� Ÿ������ �ٲ� �ִ� ������ �ϴ� ��
		// String�� �ִ� ""< �����Ѵ�
		int num = Integer.parseInt(sum) + 1234;
		int num2 = Integer.parseInt( sum2 );
		System.out.println(num);
		
		String sAvg = "88.6";
		// + 10�� �� ����� ��� ���� 
		// sAvg�� double��
		double dAvg = Double.parseDouble(sAvg) + 10;
		System.out.println(dAvg);
		//WrapperClass.parseDataType(String) > DataType
		String str = "123";
		// �ش� �����͸� ���ڷ� �ٲ� �� �ֳ�
		int num4 = Integer.parseInt(str);
		System.out.println(num4);
		// �ܼ�â Ȯ���ϱ� (�������� ����) ������ �� ������ ��
		
		// Float.parseFloat(sAvg)
		// Long.parseLong(sAvg)
		// Byte.parseByte(sAvg)
		
	}
}