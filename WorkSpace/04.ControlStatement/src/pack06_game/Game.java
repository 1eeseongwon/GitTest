package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		int random=new Random().nextInt(100)+1;
		Scanner sc = new Scanner(System.in); 
		
		
		while(true) {
			System.out.println("1���� 100 ������ ������ �Է��ϼ���");
			int user = Integer.parseInt(sc.nextLine());
			int count = 0;
			count++;
			if (random>user) {
				System.out.println("�� ū ���� �Է��ϼ���");
				
			} else if (random<user) {
				System.out.println("�� ���� ���� �Է��ϼ���");
				
			} else if (random==user) {
				
				System.out.println("������ �������ϴ�");
				// System.out.println("�õ� Ƚ���� :" +count+ "�� �Դϴ�.");
				break;
			}
		
				
			
		}
	} //main

}
