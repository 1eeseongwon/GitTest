
public class Ex07_Oper {
	public static void main(String[] args) {
		// = (대입, 값 할당)
		// 비교 연산자 ( ==, <, >, <=, >=)
		// 초과, 미만: 0 < 4 : 1, 2, 3
		// 조건식에 포함된 숫자를 뺀다 > 1~3
		// 이상, 이하: 0 <= 4: 0, 1, 2, 3, 4
		// 조건식에 포함된 숫자를 포함 
		
		int num = 8;
		String result = num == 10 ? "맞다" : "틀리다" ;
		
		int resultInt = num == 10 ? 1 : 2 ;
		System.out.println(result + resultInt);
		
		// num에 있는 수가 9 이하면 true 아니면 false
		boolean resultInt2 = num <= 9 ? true : false;
		System.out.println(resultInt2);
		System.out.println(!resultInt2); // !: 결과를 반대로
		
		
		
	}

}
