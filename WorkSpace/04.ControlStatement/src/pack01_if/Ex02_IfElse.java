package pack01_if;

public class Ex02_IfElse {
	public static void main(String[] args) {
		//if��: �ܼ�if (���ǽ��� �ְ� �ش��ϴ� ���ǽ���
		//true�� ��� ��ŷ ���� �ڵ����
		
		//if-else��: �ܼ� if���� ���ǽ��� true�� ���� O
		//if�� ���ǽ��� true�� �ƴ� false��� else��� 
		//Ű���带 if�� �ڿ� �ٿ� false ����θ� ����� ��
		
		int score = 85;
		if(score % 2 == 0) {
			System.out.println("¦��");
				} else { //if�� �ڿ��� ��� ����
					System.out.println("Ȧ��");
				}
		System.out.println("----");
		// int�� ���� num1�� num2�� ���� ���ؼ� �ʱ�ȭ
		int num1 = 42, num2 = 50;
		
		// if-else ���� �� �� ���ϰ� � ���� ū��
		if (num1 > num2) {
			System.out.println("ū ���� "+num1);
		} else {
			System.out.println("ū ���� "+num2);
		}
		
//		if(score % 2 == 1) {
//			System.out.println("Ȧ��");
//		}
	}//main

}//class
