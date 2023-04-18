package pack01_base;

import java.util.Scanner;

public class Ex06_Method {
//return이 없는 메소드 2개(파라메터가 있음, 없음)
//return이 있는 메소드 2개 
	
	void method1 () {
		System.out.println("method1");
	}
	
	void method2 (String data) {
		if(data == null) {
			return; //메소드를 중지시키고 블럭킹 끝으로 이동
		}
		System.out.println("method2" + data);
	}
	
	boolean method3() {
		System.out.println("method3");
		return true;
	}
	
	boolean isMethod4(int data) {
		System.out.println("method4");
		return false;
	}
	
	String sMethod() {
		return "아";
	}
	
	double dMethod() {
		return 0.0;
	}
	
	int[] aMethod() {
		return new int[1];
	}
	Scanner scanMethod() {
		return new Scanner(System.in);
		//null 쓰면 NullPointerException 발생
	}
	
	
}
