package pack02_trycatch;

public class Ex02_TryCatchFinally {
	public static void main(String[] args) {
		//요리: 가스불on, 요리 시작, 요리  끝, 가스불off, 먹기(종료)
		try {
			System.out.println("가스불 on");
			System.out.println("요리 시작");
			//int errorInt = 10/0; //요리할 때 갑자기 일 생김(예외)
//			System.out.println("요리 끝");
//			System.out.println("가스불 OFF");
//			System.out.println("종료");
		}catch(Exception e){
			System.out.println("예외 발생");
		}finally {
			//반드시 실행되어야 하는 로직(코드)이 있다면 넣어 주는 부분
			System.out.println("요리 끝");
			System.out.println("가스불 OFF");
			System.out.println("종료");
		}
		
		
	}//main

}
