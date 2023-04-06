package pack04_while;

public class Ex02_While {
	public static void main(String[] args) {
		//1~10까지의 누적합을 while문을 통해 구하고 출력
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			sum += i;
			i++;
		} System.out.println(sum);
		
	} //main

}
