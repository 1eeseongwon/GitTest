package pack04_while;

public class Test01_While {
	public static void main(String[] args) {
		//구구단 출력하기
		
		
		int i = 2;
		
		while(i<=9) {
			int j = 1;
			while (j<=9) {
				System.out.print(i + "x" + j + "=" + (i*j)+ " ");
				j++; 
			} i++; System.out.println(" ");
		}
		
		
	}//main

}
