package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class Test01_HighLow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//��ĳ��
		int random = new Random().nextInt(100)+1;//��������
		
		//for�� �̿��ؼ� 
//		for(int i = 0; i < 5; i++) {
//			i = 0; //ù ��° ��� i�� �����ص� �ٽ� 0���� 
//		}
//		for(int i = 0; i < 1; i--) {
//			//i�� ������Ű�� ���� 
//		}
		System.out.println("HighLow������ �����մϴ�.");
		int count = 0;
		for(;;) {
			//== while(true)
			System.out.println(random);
			
			System.out.println("���ڸ� �Է��ؼ� ������ ���� �ּ���");
			int userNum = Integer.parseInt(sc.nextLine());
			count++;
			if(userNum == random) {
				System.out.println("�����Դϴ�.");
				System.out.println(count + " ȸ �õ� �����Դϴ�.");
				break;
			} else if (userNum < random) {
				System.out.println("�� ū ���� �Է��� �ּ���.");
			} else {
				System.out.println("�� ���� ���� �Է��� �ּ���");
			}
		}
		
		
		
		
	}//main

}
