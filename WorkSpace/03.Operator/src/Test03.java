import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		// 다항연산자 또는 이항연산자를 이용해서 문제 풀어보기
		// Scanner 
		Scanner sc = new Scanner(System.in); // 스캐너 준비
		String inputData = sc.nextLine(); //엔터 치기 전 데이터 가져옴
		String inputData2 = sc.nextLine();
		
		// 콘솔창을 통해서 입력받아온 String데이터를 int로 바꾼 후 해당 숫자가
		// 짝수인지 또는 홀수인지 판단하여 콘솔창에 출력
		
		int num1 = Integer.parseInt(inputData);
		int num2 = Integer.parseInt(inputData2);
		String result = (num1 % 2) == 0 ? "짝수" : "홀수"; 
		System.out.println(result);
		System.out.println((num1 + num2));
		System.out.println((num1 - num2));
		System.out.println((num1 * num2));
		System.out.println((num1 / num2));
		
		int result2 = num1 > num2 ? num1 : num2;
		System.out.println(result2);
	
		
		
		// 콘솔창을 통해서 String 데이터를 (숫자) 두 개 입력받는다
		// 각각의 숫자는 num1과 num2로 구분한다
		// 두 숫자의 더하기, 빼기, 곱하기, 나누기 한 결과를 출력하기
		
		// 두 숫자 중 더 큰 숫자가 어떤 숫자인지 표시하기
	}

}
