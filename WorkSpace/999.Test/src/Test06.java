
public class Test06 {
	public static void main(String[] args) {
		int korScore, mathScore, engScroe, sciScore, peScore;
		korScore = 90;
		mathScore = 90;
		engScroe = 90;
		sciScore = 90;
		peScore = 90;
		// ���ַ̹�: Class ������ �빮�ڷ� ����
		// ������ �ҹ��ڷ� �����ϰ�, �ǹ� �ִ� �ܾ� �����ؼ� ����
		System.out.println(korScore);
		
		// �� ��ȯ(Casting)
		// ���� �ٸ� Ÿ���� ������ ��ȯ���� �����
		// ex) int <-> double, String <-> int
		// int < double
		int iValue = 10;
		double dValue = iValue + 0.5; // �ڵ� �� ��ȯ
		System.out.println("iValue �� : " + iValue);
		System.out.println("dValue �� : " + dValue);
		
		// �� ū ������ Ÿ���� ���� Ÿ�Կ� ���� �� ���� �߻�
		// � Ÿ������ �ٲ� ���� ��ø� �� �༭ ������ �ٲ�
		// ���� �� ��ȯ
		iValue = (int) dValue; // �Ҽ��� ����
		System.out.println("iValue �� : " + iValue);
		System.out.println("dValue �� : " + dValue);
		
		String str = "1234" + 12; // ��: 123412
		// ���ڿ��� � ���� ���ϴ� �� > ���� (������ ��ħ)
		int iData = 1234 + 12; // ��: 1246
		// ������ ������ ���� > �Ϲ����� �� (���ϱ�)
		System.out.println(iData);
		System.out.println(str);
		// str���� ���� 123412��� ���ڿ��� ����Ǿ� ����
		// ���ڷ� �ٲٷ��� ���
		int sum1 = Integer.parseInt(str)+1;
		System.out.println(sum1);
		
		// boolean -> true, false�� ���� ����
		
		String sum2 = ""+1234+5678+"�����ٶ�";
		
	}
}
