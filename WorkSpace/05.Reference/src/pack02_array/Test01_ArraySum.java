package pack02_array;

public class Test01_ArraySum {
	public static void main(String[] args) {
		//10개의 크기를 가진 String형 배열 sArr 있다
		//sArr 내부에는 문자열 1부터 인덱스에는 10까지 할당
		//sArr 내부에 있는 문자열을 숫자로 바꿔서 누적합을 구하고 출력해 보기
		
		String[] sArr = new String[10];
//		sArr[0] = "1";
//		sArr[1] = "2";
//		sArr[2] = "3";
//		sArr[3] = "4";
//		sArr[4] = "5";
//		sArr[5] = "6";
//		sArr[6] = "7";
//		sArr[7] = "8";
//		sArr[8] = "9";
//		sArr[9] = "10";
		
		for(int i = 0; i < 10; i++) {
			sArr[i] = i+1+"";
		}
		
		int sum = 0;
		for (int i = 0; i<10; i++) {
			sum += Integer.parseInt(sArr[i]);
		} System.out.println("누적합: " + sum);
	}

}
