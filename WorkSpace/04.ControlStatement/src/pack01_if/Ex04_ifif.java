package pack01_if;

public class Ex04_ifif {
	public static void main(String[] args) {
		// ��ŷ�� �⺻ ����: { < �޸𸮿� �ø� } < ����
		// ȿ�������� ���� ���� �ø��� ������ ������ ������
		// ��ŷ(����)�� ����ؼ� ��ø�� ����
		
		//����� 3�� �̻� ��ø�Ǵ� ��쿡��
		//���� �ڵ带 �°� ®���� �ǽ��� ����
		
		int score = 15;
		//if���� ��ø���Ѽ� score�� ¦���̸� ¦�� ���
		//score�� 10�� 10�̶�� ���ڿ� ���
		//11���� ������ 11���� �����̶� ���ڿ��� ���
	
		if(score%2==0) {
			System.out.println("¦��");
			if(score==10) {
				System.out.println("10");
				if(score<11) {
					System.out.println("11���� ����");
				} else {
					System.out.println("11���� ŭ");
				}
			} else {
				System.out.println("10 �ƴ�");
			}
		} else {
			System.out.println("Ȧ��");
		}
		// ���İ�Ƽ �ڵ�: �̻��ϰ� ���Ƽ� ¥���� (���� ����)
		

	}

}
