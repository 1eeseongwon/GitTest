package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		int random = new Random().nextInt(100) + 1;
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while (true) {

			i++;

			System.out.print("1���� 100������ ������ �Է��ϼ��� ��");
			int userNum = Integer.parseInt(sc.nextLine());

			if (random == userNum) {
				System.out.println("���ڸ� �������ϴ�!");
				System.out.println("�õ� Ƚ���� " + i + "���Դϴ�");
				break;

			} else if (random < userNum) {
				System.out.println("�� ���� ���� �Է��ϼ���");
			} else {
				System.out.println("�� ū ���� �Է��ϼ���");
			}

		}
	} //main 

}
