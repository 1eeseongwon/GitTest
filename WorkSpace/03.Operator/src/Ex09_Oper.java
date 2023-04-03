
public class Ex09_Oper {
	public static void main(String[] args) {
		//변수타입 변수명 = 값 비교식 ? "반환값1" : "반환값2"
		// int result = num < 10 ? 1 : 식2 ? 식3... : 
		//score 변수 값이 90보다 크다면 A, 80보다 크다면 B...
		int score = 75;
		// 70보다 크다면 C등급
		// 60보다 크다면 D등급이 나오게 조건 추가해 보기
		String grade = score > 90 ? "A" : score > 80 ? "B" : score > 70 ? "C" : score > 60 ? "D" :"E";
		System.out.println(grade);
		
	}

}
