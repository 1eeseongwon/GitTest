package pack01_if;

public class TestIF {
	public static void main(String[] args) {
		// 1. int�� ���� code �����
		// 1,3 �̸� ����, 2,4�� ����, �� �ܴ� ����
		int code = 1;
		
		if (code==1 || code==3) {
			System.out.println("����");
		} else if (code==2 || code==4) {
			System.out.println("����");
		} else {
			System.out.println("����");
		}
		System.out.println("--------");
		
		// 2. int random = (int) (Math.random() * 6)+1 ;
		// ���ǹ��� �̿��ؼ� random�� ���ڰ� �������� ����ϱ�
		//ex random(1) : 1�� ��µǾ����ϴ�... ~6����
		int random = (int) (Math.random()*6)+1;
		int random2 = (int) (Math.random()*6)+1;
		// System.out.println(random);
		if (random==1) {
			System.out.println(random+"�� ��µǾ����ϴ�.");
		} else if (random==2) {
			System.out.println(random+"�� ��µǾ����ϴ�.");
		} else if (random==3) {
			System.out.println(random+"�� ��µǾ����ϴ�.");
		} else if (random==4) {
			System.out.println(random+"�� ��µǾ����ϴ�.");
		} else if (random==5) {
			System.out.println(random+"�� ��µǾ����ϴ�.");
		} else {
			System.out.println(random+"�� ��µǾ����ϴ�");
		}
		
				
		// 3. �ֻ��� ���� �����
		// int random = (int) (Math.random() * 6)+1 ; �̿�
		// ù ��°�� �����, �� ��°�� ��ǻ��
		// ������ �ֻ��� ���� �� ū��
		// ��: 1, ��ǻ��: 6 > ���: ��ǻ�Ͱ� �̰���ϴ�.
		System.out.println("==========");
		int me = random;
		int com = random2;
		System.out.println("��: "+random+ " ��ǻ��: " +random2);
		if (me > com) {
			System.out.println("���: ����� �̰���ϴ�.");
			} else if (me < com) {
				System.out.println("���: ��ǻ�Ͱ� �̰���ϴ�");
			} else {
				System.out.println("���: �����ϴ�");
			}
	}
}
