package pack01_Variable;

public class Ex02_Variable {
	public static void main(String[] args) {
		int a; // 오류 외에도 메모리 생각해서 불필요한 건 지우라고 추천함
		int b;
		b = 30;
		int c = 40;
		System.out.println(b);
		System.out.println(c);
		// a, b, c -> 문제점 
		// 무슨 의미가 담긴 건지 모름
		// 변수명 (식별자) 작성 규칙
		// 1. 반드시 알파벳 소문자로 시작
		// 2. 자바에서 쓰고 있는 예약어(static) 사용 불가능
		// 3. 띄어쓰기 X
		// 4. 글자수에 제한 없음
		// 5. 단어 연결 가능
		// 6. class(.java)를 만들 때는 대문자로 시작
		int num = 10;
	}
}
