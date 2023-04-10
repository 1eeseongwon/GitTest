package pack02_array;

public class Ex02_Array {
	public static void main(String[] args) {
		//1. 10의 크기를 가진 int형 배열을 만들고 값을 10~100 할당 출력
		int[] scoreArray = new int[10];
//		scoreArray[0] = 10;
//		scoreArray[1] = 20;
//		scoreArray[2] = 30;
//		scoreArray[3] = 40;
//		scoreArray[4] = 50;
//		scoreArray[5] = 60;
//		scoreArray[6] = 70;
//		scoreArray[7] = 80;
//		scoreArray[8] = 90; //alt+shif+a 블럭모드
//		scoreArray[9] = 100;
		
		for(int i = 0; i<10; i++) {
			// 값 할당도 for문으로 처리해 보기
			scoreArray[i] = (i+1)*10;
			System.out.println("scoreArray[" + i + "]: " +scoreArray[i]);
		}
		//현재 배열에는 10~100까지의 수가 담아져 있음
		//배열의 누적합을 구해 보기 10~100까지 더한 값
		int sum = 0;
		for(int i = 0; i < 10; i++) {
		    sum += scoreArray[i]; }
		System.out.println("누적합: " + sum);
		
		//평균 구하기
		double ave = (double) sum / 10;
		System.out.println("평균 :" +ave);
		
		
		
	}//main

}
