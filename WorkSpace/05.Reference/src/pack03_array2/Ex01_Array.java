package pack03_array2;

public class Ex01_Array {
	public static void main(String[] args) {
	 //1차원 배열(Array): 변수는 하나의 정보만 담을 수 있음
	//ex String str="a")
	//연관이 있는 같은 데이터 타입을 하나로 묶어놓은 그룹이라고 생각
	//1차원 배열을 구성하는 요소 > 변수들(데이터들)
		
	//2차원 배열: 1차원 배열은 x축(가로) 또는 y축(세로)방향으로 행 또는 열 구조
	//2차원 배열은 1차원 배열을 요소로 가지기 때문에 x축 y축 동시에 가지고 있는 행열구조
	// [ [1][2][3]
	// [4][5]  ]
	//규칙: 차원수 == for문 개수를 맞춰주면 모든 index(주소)에 접근 가능
		int[] array = new int[3];
		//array 첫 번째 있는 숫자 출력해 보기
		System.out.println("array의 요소 첫 번째 변수: "+array[0]);
		
		int[][] array2 = new int[2][3]; //2행 3열 가지는 배열 초기화
	//배열의 크기 조회
		System.out.println("배열의 크기 조회: "+ array.length);
		System.out.println("2차원배열 내부 1차원 크기: " + array2[0].length);
		System.out.println("2차원배열 크기 조회: "+array2.length);
		//값을 주고 출력해 보기
		//2차원 배열이 가지고 있는 첫 번째 1차원 배열에 접근
		//2행 3열을 가진 2차원 배열은 총 2X3인 6개 데이터를 표현할 수 있음
		array2[0][0]=1;
		array2[0][1]=2;
		array2[0][2]=3;
		array2[1][0]=4;
		array2[1][1]=5;
		array2[1][2]=6;
		System.out.println("디버깅 포인트");
	//배열의 크기는 가변적으로 바뀔 수가 있음 (2차원배열부터)
	//1차원 배열이 모두 같은 크기를 가지는 건 아님
	
	//for문을 두 개 중첩하여 2차원 배열의 모든 내용이 출력되게 코딩
	//(배열의 크기는 일정X)
		for(int i = 0; i < array2.length; i++) {
			for(int j = 0; j < array2[i].length; j++) {
				System.out.println(array2[i][j]);
			}
		}
		
		
	}

}
