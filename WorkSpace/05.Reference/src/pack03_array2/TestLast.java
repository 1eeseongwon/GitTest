package pack03_array2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestLast {
	public static void main(String[] args) {
		//2차원 배열 
		//2차원 배열의 크기와 타입은 자유롭게 하면 됨
		//2차원 배열에 구구단 2~9단의 답을 저장하고
		//2차원배열을 통해 출력까지 해 보기
		// {{2,4,6,8...18 }
		// for문 이용해서 풀 것
		int[][] array = new int[10][10];
		for (int i = 2; i<array.length; i++) {
			for (int j = 1; j<array[i].length; j++) {
				System.out.print(i + "x" + j+ "=" + (i*j)+" ");
			} System.out.println( );
		}
		
		//1차원 배열이 2개가 있음
		//arrA = { 1,2,3,4 }
		//arrB = { 4,5,6,8 }
		// arrA에 들어 있는 내용과 arrB에 들어 있는 내용을 바꾸세요
		// 변경 후
		// arrB = { 1,2,3,4 }
		// arrA = { 4,5,6,8 }
		int arrA[] = { 1,2,3,4 };
		int arrB[] = { 4,5,6,8 };
		int[] temp = arrA;
		arrA = arrB;
		arrB = temp;
		System.out.print("arrA: ");
		for (int i = 0; i < arrA.length; i++) {
		    System.out.print(arrA[i] + " ");
		}
		System.out.println();
		
		System.out.print("arrB: ");
		for (int i = 0; i < arrB.length; i++) {
		    System.out.print(arrB[i] + " ");
		}
		
		//심화) int[] arr = {3,4,6,7,8,9,1,2,5 }
		//해당 내용을 오름차순 또는 내림차순으로 정렬해서 보여 주기
		//작업후 > arr = { 1,2,~ } , { 9,8 }
		//Arrays.sort(arrSort); <이거한줄이면되는데..오름차순
		//Arrays.sort(arrSort, Collections.reverseOrder()); 내림차순
		int[] arrSort = { 3 , 4 , 6 , 7 , 8 , 9 , 1 , 2 , 5 };
		for(int i = 0 ; i < arrSort.length; i ++) {
			for(int j = i+1; j < arrSort.length; j++) {
				if(arrSort[i] > arrSort[j]) {//arrSort[i]3 > arrSort[j]1
					int temp1 = arrSort[i];//3
					arrSort[i] = arrSort[j];
					arrSort[j] = temp1;
				}
			}
			System.out.println(Arrays.toString(arrSort));
		}
	
		
	

		
	
	}

}
