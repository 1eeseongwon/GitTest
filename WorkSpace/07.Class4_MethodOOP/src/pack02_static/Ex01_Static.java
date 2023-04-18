package pack02_static;

public class Ex01_Static {
//static의 여부에 따라서 멤버를 구분한다
//static의 여부에 따라서 메모리에 올라가는 순서가 다름
	//멤버: 클래스의 멤버 > 클래스의 중괄호 사이에 있는 모든 것들
	
	static void sMethod() {
		System.out.println("스태틱 멤버입니다");
//		Ex01_Static es = new Ex01_Static();
//		es.iMethod();//접근 불가(인스턴스화 해 주면 가능)
	}
	
	void iMethode2() {
		iMethod();//접근ㅇ
		sMethod();//접근ㅇ
	}
	//static: 프로그램 시작 전에 먼저 메모리에 할당, 프로그램 종료시 소멸
	//instance: 인스턴스화 과정 후에 메모리에 할당, 프로그램 종료시 소멸
	
	//인스턴스 멤버
	void iMethod() {
		System.out.println("인스턴스 멤버입니다");
	}
	
	
	//static멤버
	public static void main(String[] args) {
		//메인 메소드에서 iMethod 호출해 보기
		
//		Ex01_Static em = new Ex01_Static();
//		em.iMethod();
		Ex01_Static.sMethod();
		if(true) {
			Ex01_Static es = new Ex01_Static();
			es.iMethod();
		}
	}
}
