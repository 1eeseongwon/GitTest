package pack01_string;

import java.util.Scanner;

public class Ex01_String {
	public static void main(String[] args) {
		//String: 기본형 변수 X, 참조형 변수 O
		//참조형 변수는 스택이라는 메모리 공간에 힙 영역의 주소만 저장하고
		//실제 값은 힙 영역에 있는 형태 (기본형 변수는 힙 영역 사용 안 함)
		String strVar1 = "LSW"; //메모리주소 1
		String strVar2 = "LSW"; //메모리주소 1
		//두 개를 비교했을 때 결과가 true 냐 false 냐
		//답: 다를 것 같다 > True
		//if문으로 비교해 보기
		if (strVar1 == strVar2) {
			System.out.println("같다");
		} else {
			System.out.println("다름");
		}
		// new: 힙 영역에 공간을 만들다 (인스턴스 과정)
		String strVar3 = new String("LSW");
		String strVar4 = new String("LSw");
		
		Scanner sc = new Scanner(System.in);
		String strVar5 = sc.nextLine(); // 이니셜을 대문자로 입력하기
		if (strVar1 == strVar5) {
			System.out.println("strVar1 == strVar5");
		} else if (strVar3 == strVar5) {
			System.out.println("strVar3 == strVar5");
		} else {
			System.out.println("strVar1, strVar3, strVar5 다름");
		}
		
		if (strVar3 == strVar4) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
		
	}//main

}
