package pack01_if;

public class Ex01_If {
	public static void main(String[] args) { // < ���α׷� ������
		//IF��: ��� �߿� ���ǹ��̴�
		//� ������ �ְ� �ش� ������ True�� ��
		//����{}�� ����� �� ������ �ڵ带 �����Ѵ�
		//���׿����� �κ��� ���� ����� ��� ����������
		//If���� ������ �ڵ� ����ν� ��� ����
		//if ( ���ǽ� ��True,False ��� ���� �� �ִ� �͸� ) {
		// ���ǽ��� true�� �� �����ϴ� �κ� }
		
		int score = 80;//�Է¹��� ID,PW ���� �� ���
		if( score >=90 ) {
			// ���ǽ��� true�� ���� ���� ����
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("����� A����Դϴ�.");
		}
		System.out.println("������� �Գ�");
		// score ���ڰ� Ȧ������ ¦������ if������ ����ϱ�
		if ( score % 2 == 0 ) {
			System.out.println("score�� ¦��");
					}
		if ( score % 2 == 1 ) {
			System.out.println("score�� Ȧ��");
		}
	} // < ���α׷� ����

}
