package pack04_while;

public class Ex01_While { 
	public static void main(String[] args) {
		// for(int = 1; (�����ʱ�ȭ) i<=10;(0���� 10����) 1++(�ݺ�))
		// �ݺ��� ����� ���� �ʱ�ȭ ��, ���ǽ�(true�� ��), �ݺ��� �ڵ�, �ݺ�
		
		// �� ���� �ʱ�ȭ��
		//while (�� ���ǽ� ) {
		//   �ݺ��ϴ� ����
		//	�� ������ �Ǵ� break�� �̿��� �ݺ��� ����	}
		
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		
		//while���� �̿��ؼ� Ȧ���� ����� ���� (1~50)
		//�ݺ� Ƚ���� ��Ȯ�ϰ� �� �� ���ǿ� ���ؼ� �ݺ���Ű�� ���
		//for: �ݺ� Ƚ���� ��Ȯ�ϰ� �� ��
		int j = 0;
		while (j < 50) {
			if(j%2==1) {
			System.out.println(j);
			
		} j++;
		}
		
		
	}//main

}
