
public class Ex08_Oper {
	public static void main(String[] args) {
		//�񱳿�����: ���ǹ��� ���� ����
		//����: � ���� ������ �Ǵ� �������� �Ǵ��ϴ� ��
		//ID�� PW�� DB ���� ��ġ�ϴ���
		//"�α���": "���̵� �Ǵ� ��й�ȣ�� Ȯ���ϼ���?"
		//�� ������ �ݵ�� true�� false�� ���� ���� �� �־�� ��
		int num1 = 10, num2 = 10;
		// ���ǽ��� ����ϰ����� ����� �ݵ�� true, false ����
		// ( ==, != <=, >=, <, >)
		// ���� ����X �̻� ���� �ʰ� �̸�
		boolean result1 = num1 == num2; //true
		boolean result2 = num1 != num2; //false
		boolean result3 = num1 <= num2; //true
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 < num2);
		System.out.println(num1 > num2);
		
		// ���� ���� ��
		// �� ������ (���� ���� ������ �Ǵ�)
		// �������� ��� TRUE, FALSE ����� ���´�
		// ���ǽ�A && ���ǽ�B : 
		// ���ǽ�A�� ���̰� ���ǽ�B�� ���� ��� > TRUE �� �ܴ� FALSE
		// && (AND, *, ����): 1*1=1, 1*0=0 
		// A�̸鼭 B�̰�
		
		// ���ǽ�A || ���ǽ�B :
		// ���ǽ�A�� ���̸� ���ǽ�B�� ������� > TRUE
		// || (OR, +, ����): 1+?=0, 0+0=0 
		// A�̰ų�, B�Ǵ�
		System.out.println("and����");
		System.out.println(10 > 5 && 20 > 5); //1*1 true
		System.out.println(10 > 5 && 20 < 5); //1*0 false
		System.out.println(5 > 10 && 20 > 5); // ���� Ʋ���� ����� ����
		System.out.println(5 > 10 && 5 > 20); //false
		
		System.out.println("--or����");
		// �ϳ��� true�� �߻��ϴ� ����, �ڿ� ������ ������ ���� 
		System.out.println(10 > 5 || 20 > 5); //true
		System.out.println(10 > 5 || 20 < 5); //true
		System.out.println(5 > 10 || 20 > 5); //true
		System.out.println(5 > 10 || 5 > 20); //false
		
		// ���ǽ� ������ &&, || �̿��ؼ� �� ���� ����
		System.out.println(10 > 5 && 20 > 5 || 5 > 10);
		
	}
	

}
