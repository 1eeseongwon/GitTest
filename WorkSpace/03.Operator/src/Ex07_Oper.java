
public class Ex07_Oper {
	public static void main(String[] args) {
		// = (����, �� �Ҵ�)
		// �� ������ ( ==, <, >, <=, >=)
		// �ʰ�, �̸�: 0 < 4 : 1, 2, 3
		// ���ǽĿ� ���Ե� ���ڸ� ���� > 1~3
		// �̻�, ����: 0 <= 4: 0, 1, 2, 3, 4
		// ���ǽĿ� ���Ե� ���ڸ� ���� 
		
		int num = 8;
		String result = num == 10 ? "�´�" : "Ʋ����" ;
		
		int resultInt = num == 10 ? 1 : 2 ;
		System.out.println(result + resultInt);
		
		// num�� �ִ� ���� 9 ���ϸ� true �ƴϸ� false
		boolean resultInt2 = num <= 9 ? true : false;
		System.out.println(resultInt2);
		System.out.println(!resultInt2); // !: ����� �ݴ��
		
		
		
	}

}
