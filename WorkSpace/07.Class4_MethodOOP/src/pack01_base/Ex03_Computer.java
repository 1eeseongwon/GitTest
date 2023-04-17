package pack01_base;

public class Ex03_Computer {
	//Ex03_Computer에 메소드를 구현해 보기
	//sum1이라는 메소드를 만든다
	//해당하는 메소드는 숫자형을 묶어 놓은 배열을 입력받아
	//배열의 총합을 구하는 메소드이다
	//총합을 구하고 나서 결과를 메소드 호출부로 반환하는 기능 구현
	//Ex03_ComputerMain에서 호출
	
	int sum1 (int[] arr) {
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum += arr[i];
		}
		return sum; 
	}
	
	//많이 안 쓰는 형태의 메소드 파라메터
	int sum2(int ... values) {
		int sum=0;
		for (int i=0; i < values.length; i++) {
			sum += i;
		}
		return sum;
	}

}
