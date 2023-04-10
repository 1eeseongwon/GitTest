package pack02_array;

import java.util.Scanner;

public class Ex03_Array {
	public static void main(String[] args) {
		//arguments(인수, 파라미터): main메소드 실행 전 필요한 것
		//ex) 버전 정보
		//args[0]을 출력하면 오류 발생
		
		//0. String배열을 만드는데 String[0]만 사용 가능한 배열 만들어 보기
//		String[] sArr = new String[1];
//		System.out.println(sArr[0]);
//		System.out.println(sArr[1]);
//		//1. 내가 만든 배열로 똑같은 오류를 만들어보기
//		String[] sArr = new String[0];
//		System.out.println(sArr[0]);
		
//		args = new String[1]; //코드로 푸는 방법
		//System.out.println(args[0]);
		
		
		//데이터타입[] 배열이름 = new 데이터타입[크기];
		//내가 알고 있는 모든 것들 < 
		//String타입을 가지는 배열 크기는 10
		//String[] array = new String[10];
		
		//int[0]에는 초기값: 0 숫자 형태는 전부 0
		//String[0] > null (참조형 변수들의 초기값)
		//String[] animals = new String[3];
		
		String[] animals = { "강아지", "고양이", "비둘기" } ; 
		//출력
		System.out.println(animals[0]);
		System.out.println(animals[1]);
		System.out.println(animals[2]);
		
		int[] intArray = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 } ;
		// 이 방법은 많이 사용이 안 되는 이유는? 가독성 떨어짐
		
		
	}

}
