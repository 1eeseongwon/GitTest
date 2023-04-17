package pack01_base;

public class Ex02_Calculator {
//static 키워드가 있는지 없는지의 판단(멤버 구분의 매우 중요함)
//메소드의 구조
//생성자 메소드(Constuctor): 객체를 생성할 때 필요한 메소드

//void 
	//리턴타메소드이름 (파라메터부) {메소드 내용(코} < 메소드 구조
	//파라메터부: 어떤 것이든 메소드가 실행될 때 필요한 변수, 클래스 등
	//정보가 있다면 받아오게끔 처리하는 부분
	void powerOn(int power) { //숫자
		if(power < 1) {
			System.out.println("배터리 부족");
			powerOff();
		} else {
			System.out.println("전원을 켭니다.");
		}
		System.out.println("전원을 켭니다.");
	}//powerOff에서 main에 접근이 되는 이유
	//static멤버여서 메모리에 먼저 있기 때문
	
	//main에서 poweroff에 접근이 안 되는 이유
	//static이라 인스턴스화과정이 필요한데 그게 빠져 있어서
	//메모리에 없기 때문
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
		//main(null);
	}
	
	
	//void인지 void가 아닌지에 따라 리턴타입이 결정
	//내가 알고 있는 모든 타입 > 리턴타입으로 사용 가능
	//void<공허, 비어 있는: 리턴이 없는(작업 후 결과가 필요 없는)
	
	//return타입이 void가 아니게 주어지면 해당하는 타입을 반환하는
	//return키워드가 반드시 필요
	int test() {
		return 0;
	}
	
	int plus(int num1, int num2) {	//파라메터부에 숫자를 두 개 입력받게 만들기
		int sum = num1+num2;
		return sum;	//입력받은 파라메터 두 숫자의 합을 return
		//return num1+num2;			//main에서 호출
	
	}//return 밑에는 코드 넣지 말자
	
	//숫자세개입력받아서3개의합을구하는plus3메소드만들기
	
	int plus3(int num1, int num2, int num3) {
		return num1+num2+num3;
	}
	
	
	
	public static void main(String[] args) {
		//powerOff();
	}
}
