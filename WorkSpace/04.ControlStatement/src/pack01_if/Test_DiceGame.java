package pack01_if;

import java.util.Scanner;

public class Test_DiceGame {
	public static void main(String[] args) {
		// ex) 사용자가 어떤 동작을 했을 때 게임이 진행되는 것 == 조작
		// 나 vs 컴퓨터
		System.out.println("주사위 게임을 시작합니다.");
		System.out.println("-1을 입력하면 종료합니다. 그 외에는 시작");
		Scanner sc = new Scanner(System.in);
		String inputData = sc.nextLine(); 
		//사용자가 엔터키를 누를 때 입력되어 있는 걸 전달
		int num = Integer.parseInt(inputData);
		if (num==-1) {
			System.out.println("종료합니다.");
		} else {
			System.out.println("게임 시작");
			System.out.println("사용자가 주사위를 굴릴 차례입니다 (굴리기 ENTER)");
			sc.nextLine(); //엔터 누를 때까지 대기 (여기서 나온 데이터는 쓸모 x)
			int userNum = (int) (Math.random()*6)+1; // 1~6까지 수를 랜덤으로 가지고 오는 메소드
			System.out.println("사용자의 수: " + userNum);
			System.out.println("컴퓨터가 주사위를 굴릴 차례입니다 (굴리기 ENTER)");
			sc.nextLine();
			int comNum = (int) (Math.random()*6)+1; // 1~6까지 수를 랜덤으로 가지고 오는 메소드
			System.out.println("컴퓨터의 수: " + comNum);
			if (userNum > comNum) {
				System.out.println("유저가 이겼습니다");
			} else if (userNum < comNum) {
				System.out.println("컴퓨터가 이겼습니다");
			} else {
				System.out.println("비겼습니다");
			} //나의 승률을 20% 조작해서 상승
		} 
		
		
		
		
	}

}
