package pack01_if;

public class Ex03_ifif {
	public static void main(String[] args) {
		// 블럭킹: {} (지역)
		// int num1 = 10; 
		// (변수를 초기화 시키면 메모리 부분에 값이 저장)
		// 변수는 언제까지 메모리에 저장되어 있을까
		int num1 = 10;
		System.out.println(num1);
		if (num1==10) {
			// int num1 = 10;
			//오류 이유: 메인 지역에서 이미 선언을 
			// 했기 때문에
			
			
			int num2 = 10; //언제까지 
			System.out.println(num2);
		}
		{	// 지역이 달라서 초기화 가능
			// 데이터가 빠져나가서
			int num2 = 10;
		}
		
		int num2 = 10; 
		// 지역이 달라서 초기화 가능
		// 데이터가 빠져나가서
	}

}
