import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		// ���׿����� �Ǵ� ���׿����ڸ� �̿��ؼ� ���� Ǯ���
		// Scanner 
		Scanner sc = new Scanner(System.in); // ��ĳ�� �غ�
		String inputData = sc.nextLine(); //���� ġ�� �� ������ ������
		String inputData2 = sc.nextLine();
		
		// �ܼ�â�� ���ؼ� �Է¹޾ƿ� String�����͸� int�� �ٲ� �� �ش� ���ڰ�
		// ¦������ �Ǵ� Ȧ������ �Ǵ��Ͽ� �ܼ�â�� ���
		
		int num1 = Integer.parseInt(inputData);
		int num2 = Integer.parseInt(inputData2);
		String result = (num1 % 2) == 0 ? "¦��" : "Ȧ��"; 
		System.out.println(result);
		System.out.println((num1 + num2));
		System.out.println((num1 - num2));
		System.out.println((num1 * num2));
		System.out.println((num1 / num2));
		
		int result2 = num1 > num2 ? num1 : num2;
		System.out.println(result2);
	
		
		
		// �ܼ�â�� ���ؼ� String �����͸� (����) �� �� �Է¹޴´�
		// ������ ���ڴ� num1�� num2�� �����Ѵ�
		// �� ������ ���ϱ�, ����, ���ϱ�, ������ �� ����� ����ϱ�
		
		// �� ���� �� �� ū ���ڰ� � �������� ǥ���ϱ�
	}

}
