package pack01_if;

public class Ex01_If {
	public static void main(String[] args) { // < 프로그램 시작점
		//IF문: 제어문 중에 조건문이다
		//어떤 조건을 주고 해당 조건이 True일 때
		//지역{}을 만들고 그 지역의 코드를 실행한다
		//이항연산자 부분은 값만 결과로 사용 가능하지만
		//If문은 별도의 코딩 결과로써 사용 가능
		//if ( 조건식 ☆True,False 결과 얻을 수 있는 것만 ) {
		// 조건식이 true일 때 실행하는 부분 }
		
		int score = 80;//입력받은 ID,PW 비교할 때 사용
		if( score >=90 ) {
			// 조건식이 true일 때만 실행 가능
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A등급입니다.");
		}
		System.out.println("여기까지 왔나");
		// score 숫자가 홀수인지 짝수인지 if문으로 출력하기
		if ( score % 2 == 0 ) {
			System.out.println("score는 짝수");
					}
		if ( score % 2 == 1 ) {
			System.out.println("score는 홀수");
		}
	} // < 프로그램 끝점

}
