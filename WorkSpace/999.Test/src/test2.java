import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String inputData = sc.nextLine();
		double sum = Double.parseDouble(inputData);
		System.out.println( (int) sum);
	}
}
