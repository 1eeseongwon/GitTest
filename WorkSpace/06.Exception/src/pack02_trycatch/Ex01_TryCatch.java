package pack02_trycatch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Ex01_TryCatch {
	public static void main(String[] args) {
		//try {
		//예외(오류)가 발생할 가능성이 있는 코드 (코드 자체는 정상)
		//a < (코드가 비정상)
		//Integer.parseInt(sc.nextLine()); < 사용자의 입력을 숫자로 바꾸는 기능
		//catch(Exception e) {
		//예외가 발생할 시 처리할 코드(대안코드)
		//선택 finally {
		//무조건 한 번 실행되어야 하는 코드가 있다면 넣어 줌
		//데이터베이스의 연결을 해제하거나 세션을 끊는다(큐넷)
		
		//정상코드이지만 실행했을 때 오류가 발생하게 코딩해 보기
//		int[] arr = new int[2];
//		System.out.println(arr[3]);
		try{
			System.out.println(10/0);
		} catch(Exception e) {
			System.out.println("오류가 발생함");
		} System.out.println("실행이 되나요");
		
		
		//에러의 종류
		//1. 하드웨어적 에러: 치명적인 에러 > 프로그램 실행이 안 됨(그래픽카드, 메모리 등 물리적)
		//2. 소프웨어적 에러: 가벼운 에러 > 예외(Exception)
		//	-Oracle회사에서는 모든 예외들을 클래스로 만들어서 제공함
		//	-예)NullPointerException: null 상태에서 기능 사용
		
		//예외의 종류
		//1. 미확인 예외(실행 예외)
		//	프로그램을 실행해 봐야만 예외가 발생하는지 알 수 있음
		//	프로그래머의 실수, 경험에 의해서 발생: 디버깅(오류 수정) 작업 현실 어려움
		
		//2. 확인 예외(일반 예외) < 추후
		//	프로그램 작성 중에 반드시 예외처리를 해 줘야만 사용이 가능한 것들이 있음(파일o)
		//	try {} catch {} 해 주면 해결됨 
		
		try {
			FileInputStream fis = new FileInputStream("abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
