package pack01_base;

public class Ex07_OverLoading {
	//메소드 오버로딩: 메소드의 이름이 같고 타입과 파라메터의 개수를 다르게 해서 선택해서 사용할 수 있게 한 것
	void method() {
		
	}
	void method(int param1) {
		
	}
	
	public static void main(String[] args) {
		Ex07_OverLoading eo = new Ex07_OverLoading();
		eo.method();
		eo.method(1);
		//System.out.println(); < 대표적인 ex
		//어떤 타입을 넣어도 일단 출력이 되게끔 만들어 둠
		
		
	}
}
