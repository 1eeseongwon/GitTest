package pack03_for;

public class Ex04_ForFor {
	public static void main(String[] args) {
		//����� �����ϰ� ��ø�� �����ϴ� (����x)
		// 1~10���� �ݺ� for��
//		for (int i = 1; i<=10; i++) {
//			System.out.println("i" + i);
//			// for�� �־� ����
//			for (int j = 1; j <=10; j++) {
//				System.out.println("j"+j);
//			}
//		}
		
		// �������� ����� ���� 
		// print�� println ���ä����� ���
		// ex 2 X 1 = 2, ...
		// 3 X 1 = 3...
		for (int i = 2; i<=9; i++) {
			for (int j = 1; j<=9; j++) {
				System.out.print(i + "x" + j+ "=" + (i*j)+" ");
			} System.out.println( );
		}
		// ���� for���� �̿��ؼ� �����
		
		
	}//main

}
