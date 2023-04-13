package pack02_trycatch;

import java.util.Scanner;

public class Ex03_TryCatchOrder {
	public static void main(String[] args) {
			int data2 = 1;
		try {
			int data1 = 10;
			int result = data1/data2; 
			Scanner sc = new Scanner(System.in); //오류 안 나게 하기
			sc.nextLine(); 
			args[10] = "1";
			//catch블럭 예외 종류 하나 더 연결하고 실행되게
		} catch (ArithmeticException e) {//연산 오류 0으로 어떤 수 나누기 하면 발생
			int data3 = 100;
			System.out.println("data1의 변수 (값: " +data2+ "때문에 오류"+ e.getMessage());
		} catch(NullPointerException e) {
			System.out.println("NullPointerException"+ e.getMessage());
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 오류 " + e.getMessage());
		}
		
		
	}//main

}
