
public class Ex02_Operator {
	public static void main(String[] args) {
		// 복습. 증감, 가감
		// ++, -- 
		// 현실에서 사용 X
		// ++ 현재 수 +1
		int num1 = 1, num2 = 1;
		System.out.println(num1++); //후행연산 (뒤에)
		System.out.println(++num2); //선행연산 (앞에)
		
		System.out.println("증감식 후: " + num1);
		System.out.println("증감식 후: " + num2);
		
		System.out.println(num1--);//2
		// 출력 후 2-1=1
		System.out.println(--num2);//1
		// 2-1 =1 연산 후 출력

	}
}
