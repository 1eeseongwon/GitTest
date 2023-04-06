package pack05_etc;

import java.util.Scanner;

public class Ex01_Break {
	public static void main(String[] args) {
		//break문은 제어문을 종료하고 빠져나가는 기능
		//무한루프하는 반복문 밑에 코드가 있으면 에러 (영원히 실행x)
		//무한루프 만들고 내가 종료를 원할 때만 종료하게
		//스캐너로 -1 입력하면 종료되게 만들어 보기
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("루프중");
			int num = Integer.parseInt(sc.nextLine());
			if(num==-1) {
				System.out.println("종료");
				break;
			} else if (num==1) {
				System.out.println("1번 메뉴에 대한 코딩");
			} else {
				System.out.println("잘못된 입력");
			}
		}
		
	
		
	
	}//main

}
