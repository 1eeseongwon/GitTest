package pack06_game;

import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		int random=new Random().nextInt(100)+1;
		Scanner sc = new Scanner(System.in); 
		
		
		while(true) {
			System.out.println("1부터 100 사이의 정수를 입력하세요");
			int user = Integer.parseInt(sc.nextLine());
			int count = 0;
			count++;
			if (random>user) {
				System.out.println("더 큰 수를 입력하세요");
				
			} else if (random<user) {
				System.out.println("더 작은 수를 입력하세요");
				
			} else if (random==user) {
				
				System.out.println("정답을 맞혔습니다");
				// System.out.println("시도 횟수는 :" +count+ "번 입니다.");
				break;
			}
		
				
			
		}
	} //main

}
