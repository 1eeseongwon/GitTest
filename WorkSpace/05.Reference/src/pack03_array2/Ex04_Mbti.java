package pack03_array2;

import java.util.Scanner;

public class Ex04_Mbti {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] mbtiResult = new int[4];
		String[][] mbtiWord = {
				{"E", "I"}, {"N", "S"}, {"F", "T"},{"J", "P"}
		};
		
		
		System.out.println("처음 보는 사람과 이야기를 잘 나눈다 1.o 2.x");
		mbtiResult[0] = Integer.parseInt(sc.nextLine());
		System.out.println("현실적이단 말을 자주 듣는다 1.o 2.x");
		mbtiResult[1] = Integer.parseInt(sc.nextLine());
		System.out.println("나는 공감을 잘한다 1.o 2.x");
		mbtiResult[2] = Integer.parseInt(sc.nextLine());
		System.out.println("여행을 갈 때 계획을 세워야 마음이 편하다 1.o 2.x");
		mbtiResult[3] = Integer.parseInt(sc.nextLine());
	

		String result = "";
		for (int i = 0; i < mbtiResult.length; i++) {
			result+=mbtiWord[i][mbtiResult[i]-1];
		}
		System.out.println("나는 " + result + "입니다.");
	}

}
