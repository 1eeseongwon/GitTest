package pack09_scanner;

import java.util.Scanner;

public class Ex01_Scanner {
	public static void main(String[] args) {
		// Scanner(입력) -> 자바(출력) -> 콘솔창
		Scanner sc = new Scanner(System.in);
		// 외부에서 들어오는 데이터를 사용해 보기 위해 외워서 사용
		System.out.println("대기할거냐");
		String inputData = sc.nextLine();

		System.out.println("여기까지 왔니");
		
		int Num1 = Integer.parseInt(inputData) + 10;
		System.out.println(Num1);
		// 외부에서 입력한 숫자는 String 형태로 inputData 변수에 들어옴
		// 데이터에 +10을 한 결과 출력해 보자
		
		
	}

}
