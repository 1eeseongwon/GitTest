package pack04_while;

public class Ex01_While { 
	public static void main(String[] args) {
		// for(int = 1; (변수초기화) i<=10;(0부터 10까지) 1++(반복))
		// 반복에 사용할 변수 초기화 식, 조건식(true일 때), 반복할 코드, 반복
		
		// ① 변수 초기화식
		//while (② 조건식 ) {
		//   반복하는 구간
		//	③ 증감식 또는 break를 이용한 반복문 종료	}
		
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		
		//while문을 이용해서 홀수만 출력해 보기 (1~50)
		//반복 횟수를 정확하게 모를 때 조건에 의해서 반복시키는 경우
		//for: 반복 횟수를 정확하게 알 때
		int j = 0;
		while (j < 50) {
			if(j%2==1) {
			System.out.println(j);
			
		} j++;
		}
		
		
	}//main

}
