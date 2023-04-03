
public class Ex08_Oper {
	public static void main(String[] args) {
		//비교연산자: 조건문에 많이 사용됨
		//조건: 어떤 식이 참인지 또는 거짓인지 판단하는 것
		//ID와 PW가 DB 값과 일치하는지
		//"로그인": "아이디 또는 비밀번호를 확인하세요?"
		//★ 조건은 반드시 true와 false의 답을 얻을 수 있어야 함
		int num1 = 10, num2 = 10;
		// 조건식을 사용하고나서는 결과가 반드시 true, false 나옴
		// ( ==, != <=, >=, <, >)
		// 같다 같지X 이상 이하 초과 미만
		boolean result1 = num1 == num2; //true
		boolean result2 = num1 != num2; //false
		boolean result3 = num1 <= num2; //true
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);
		System.out.println(num1 <= num2);
		System.out.println(num1 >= num2);
		System.out.println(num1 < num2);
		System.out.println(num1 > num2);
		
		// 식을 연결 ★
		// 논리 연산자 (여러 개의 조건을 판단)
		// 최종적인 결과 TRUE, FALSE 결과만 나온다
		// 조건식A && 조건식B : 
		// 조건식A가 참이고 조건식B도 참일 경우 > TRUE 그 외는 FALSE
		// && (AND, *, 논리곱): 1*1=1, 1*0=0 
		// A이면서 B이고
		
		// 조건식A || 조건식B :
		// 조건식A가 참이면 조건식B와 상관없이 > TRUE
		// || (OR, +, 논리합): 1+?=0, 0+0=0 
		// A이거나, B또는
		System.out.println("and구분");
		System.out.println(10 > 5 && 20 > 5); //1*1 true
		System.out.println(10 > 5 && 20 < 5); //1*0 false
		System.out.println(5 > 10 && 20 > 5); // 앞이 틀려서 노란색 오류
		System.out.println(5 > 10 && 5 > 20); //false
		
		System.out.println("--or구분");
		// 하나의 true가 발생하는 순간, 뒤에 조건은 비교하지 않음 
		System.out.println(10 > 5 || 20 > 5); //true
		System.out.println(10 > 5 || 20 < 5); //true
		System.out.println(5 > 10 || 20 > 5); //true
		System.out.println(5 > 10 || 5 > 20); //false
		
		// 조건식 연결은 &&, || 이용해서 몇 개든 가능
		System.out.println(10 > 5 && 20 > 5 || 5 > 10);
		
	}
	

}
