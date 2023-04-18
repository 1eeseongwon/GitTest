package pack01_base;

public class Ex06_MethodMain {
	public static void main(String[] args) {
		Ex06_Method em = new Ex06_Method();
		em.method1();//void
		em.method2("testData");//void
		em.method3();//boolean
		em.isMethod4(10);//boolean
		//메소드에 리턴타입이 주어지면 해당하는 타입의 변수라고 봐도 됨
		//메소드에 리턴타입이 없으면 아무 타입도 아님(실행후없어지는코드블럭)
		boolean isMethod=em.method3();
		System.out.println(isMethod);
		
		//System.out.println(em.method1());//void
		System.out.println(em.method3());//boolean
		
		//조건식 핵심: true or false일 것
		boolean isBoolean = 1 < 2;
		if(em.method3()) { //메소드 결과가 true일 때 또는 false일 때 따라서 if와 else블럭 실행 여부가 바뀜
			
		} else {
			
		}
		
		System.out.println(em.dMethod());
		System.out.println(em.aMethod()[0]);
		//0번 인덱스에 있는 0을 출력하고 싶으면
		System.out.println(em.sMethod());
		em.scanMethod().nextLine();
		
		em.method2("아아ㅏㅏ");
	}

}
