package pack04_while;

public class Ex03_While {
	public static void main(String[] args) {
		//while���� �̿��ؼ� 1~100������ ������ �����
		//���ǹ��� �̿��ؼ� Ȧ���� ���� Ȧ��(����)
		//¦���� ���� ¦��(����)�� ��µǰ� 
		
		int i = 1;
		while(i <=100) {
			if (i %2 == 1) {
				System.out.println("Ȧ��("+i+")");
			} else {
				System.out.println("¦��("+i+")");
			}
			i++;
		}
		
		
	}//main

}
