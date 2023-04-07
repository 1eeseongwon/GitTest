package pack06_game;

import java.util.Scanner;

public class Test02_ScorePg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor = -1, eng = -1, mat = -1; // -1이면 입력 X 상태
		System.out.println("국어 점수를 입력해 주세요.");
		while (kor == -1) {// 초기에 -1로 값을 초기화했기 때문에
							// 초기화만 된 상태에서 계속해서 반복
			kor = Integer.parseInt(sc.nextLine()); // 0~100까지만 입력
			if (kor > 0 && kor <= 100) {
				System.out.println("성적 입력 완료.");
			} else {
				System.out.println("잘못 입력하셨습니다 0~100까지만 가능");
				kor = -1;
			}

		} // while 
		System.out.println("영어 성적을 입력해 주세요");
		while (eng == -1) {// 초기에 -1로 값을 초기화했기 때문에
			// 초기화만 된 상태에서 계속해서 반복
			eng = Integer.parseInt(sc.nextLine()); // 0~100까지만 입력
			if (eng > 0 && eng <= 100) {
				System.out.println("성적 입력 완료.");
			} else {
				System.out.println("잘못 입력하셨습니다 0~100까지만 가능");
				kor = -1;
			}

		} // while 
		System.out.println("수학 성적을 입력해 주세요");
		while (mat == -1) {// 초기에 -1로 값을 초기화했기 때문에
			// 초기화만 된 상태에서 계속해서 반복
			mat = Integer.parseInt(sc.nextLine()); // 0~100까지만 입력
			if (mat > 0 && mat <= 100) {
				System.out.println("성적 입력 완료.");
			} else {
				System.out.println("잘못 입력하셨습니다 0~100까지만 가능");
				kor = -1;
			}

		} // while 
		System.out.println("국어 점수: " + kor);
		System.out.println("영어 점수: " + eng);
		System.out.println("수학 점수: " + mat);
		
		System.out.println("총점: " +(kor+eng+mat));
		System.out.println("평균: " +((double)(kor+eng+mat)/3));

	}// main

}
