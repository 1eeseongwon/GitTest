
public class Test04 {
	public static void main(String[] args) {
		// int(정수), double(실수)
		// char(한 글자), String(문자열)
		// 변수를 선언하는 규칙: 변수타입 네이밍(이름) ;
		// 메모리를 효율적으로 쓰기 위해 나누어져 있음
		int iNum;
		double dNum;
		char cChr;
		String sStr;
		// 변수에 값 저장 (할당)
		// :변수명 = 해당 타입에 맞는 값
		iNum = 242; // int는 정수만
		dNum = 7.32; // double은 실수도 가능
		cChr = 'A'; // 한 글자를 담을 때, ' < 사용
		sStr = "이성원"; // 두 글자 이상 문자열 " < 사용
		int iNum2 = 10; // 선언과 동시에 값 할당 > 초기화
		// 나열: 같은 타입의 변수를 여러 개 만들 때 사용함
		int subject1, subject2, subject3;
		subject1 = 1;
		subject2 = 2;
		subject3 = 3;
		System.out.println(subject1);
	}

}
