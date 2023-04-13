package pack02_trycatch;

import java.util.Random;
import java.util.Scanner;

public class Test01_TryCatch {
	public static void main(String[] args) {
		//배열의 랜덤한 공간에 숫자 숨기기 게임
		//기존로직은 그대로 사용하면 됨
		//단, 사용자의 입력은 자유로운데 잘못 입력 시 
		//"잘못된 입력입니다. 숫자 범위 ?-?까지만 입력해 주세요가 나오고
		//프로그램은 강제로 종료되는 경우가 없다 (게임  끝까지
		Scanner sc = new Scanner(System.in);
		System.out.println("난이도를 입력하세요 (1 이상)");
		int diff = 0;
		
		while(true) {
		try {
			diff = Integer.parseInt(sc.nextLine());
			if (diff<0) {
				throw new Exception("0 이상을 입력해 주세요");
			} break;
		} catch (Exception e) {
			System.out.println("1 이상을 입력하세요 (숫자 외 입력하지 마세요)");
		}
		}
		
		
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
			try {
				guess = Integer.parseInt(sc.nextLine());
				if (guess < 0) {
					throw new Exception("0부터 " +diff+ "까지만 입력하세요");
				} count++;
				if(guess == hidInd) {
					System.out.println("정답입니다! " + count + "번 만에 맞히셨습니다!");
					break;
				} else {
					System.out.println("오답입니다.");
				}
			} catch (Exception e) {
				System.out.println("0부터 " +diff+ "까지만 입력하세요");
			} 
			

			
		}
	}//

}
