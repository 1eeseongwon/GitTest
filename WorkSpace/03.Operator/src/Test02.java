
public class Test02 {
	public static void main(String[] args) {
		// 선행 후행 차이
		int x = 1;
		int y = 1;
		int result1 = ++x ;//2 먼저(연산 후 명령)
		int result2 = y++ ;//1 나중(명령 후 연산)
		System.out.println(result1);
		System.out.println(result2);
	}
}
