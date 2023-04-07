package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		int random = new Random().nextInt(100) + 1;
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while (true) {

			count++;

			System.out.print("1부터 100사이의 정수를 입력하세요 ▶");
			int userNum = Integer.parseInt(sc.nextLine());

			if (random == userNum) {
				System.out.println("숫자를 맞혔습니다!");
				System.out.println("시도 횟수는 " + count + "번입니다");
				break;

			} else if (random < userNum) {
				System.out.println("더 작은 수를 입력하세요");
			} else {
				System.out.println("더 큰 수를 입력하세요");
			}

		}
	} //main 

}
