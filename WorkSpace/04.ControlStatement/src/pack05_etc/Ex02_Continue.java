package pack05_etc;

public class Ex02_Continue {
	public static void main(String[] args) {
		// continue <=> break
		// break: ����� ��������
		// continue: �ݺ������� ������ �ؿ� �ڵ带 ���� X
		// �ݺ��� �κ����� �̵�
		// �ݺ��� {
		//    }
		// Ȧ���� ������
		// continue ���� ���� ������ �˰� ����
		for (int i = 1; i <=10; i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
		
		
	}

}