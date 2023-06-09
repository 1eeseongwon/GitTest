package pack03_array2;

import java.util.Random;
import java.util.Scanner;

public class Test01_Game {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("난이도를 입력하세요");
		int diff = Integer.parseInt(sc.nextLine());
		
		int [] gameArray = new int[diff];
		int hidInd = new Random().nextInt(diff);
		gameArray[hidInd] = 1;
		
		System.out.println("난이도는 "+diff+"입니다.");
		System.out.println("게임을 시작합니다.");
		System.out.println("숫자가 들어 있는 인덱스를 고르시면 정답입니다.");
		
		int guess;
		int count = 0;

		while(true) {
			System.out.print("인덱스를 고르세요. (0부터 " + diff + "까지): ");
			guess = Integer.parseInt(sc.nextLine());
			count++;

			if(guess == hidInd) {
				System.out.println("정답입니다! " + count + "번 만에 맞히셨습니다!");
				break;
			} else {
				System.out.println("오답입니다.");
			}
		}

	}//main

}
