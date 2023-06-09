package pack03_array2;

public class Ex03_Array {
	public static void main(String[] args) {
		//2차원 배열을 두 가지 방법으로 두 개 만들어 보기
		//1. 2차원 배열을 초기화할 때 행과 열의 크기를 주고 만들기
		int[][] array = new int [2][3];
		
		//2. 2차원 배열을 초기화할 때 값이 있는 1차원 배열을 바로 넣고 만들기
		int[] arr = new int[3];
		int[][] array2 = {
				arr, {7,8,9}, {10}
		};
		
		//3. 2차원 배열은 1차원 배열을 요소로 가진다
		//(1차원 배열을 여러 개 그룹화해 놓은 것)
		//1차원배열의 개수만 정확하게 주어졌을 때 사용하는 방법
		int[][] array3 = new int[5][];
		array3[0] = new int[3]; //int[] arr = { 1,2 }; 중괄호 초기화식은 최초 한 번만 가능
		System.out.println(array3[0].length);
	}//main

}
