package pack02_static;

import java.util.Scanner;

public class Test01_MethodMain {
	public static void main(String[] args) {
	//사용자로부터 콘솔창을 통해 id와 pw를 입력받는다
	//id와 pw를 Test01_Method의 login이라는 메소드에 전송하여
	//id가 master, pw가 master1234이면 true, 그 외에는 false를 리턴하게 만든다
	//해당 결과에 따라서 로그인되었습니다, 로그인 실패가 콘솔창에 나오게 한다
		
	//Scanner자체를 Test01_Method 내부에 메소드 구현을 통해서 생성받아 사용하게끔 처리
	Test01_Method ex = new Test01_Method();
		Scanner sc = new Scanner(System.in);
	String id = sc.nextLine();
	String pw = sc.nextLine();
	if (ex.login(id, pw)) {
        System.out.println("로그인되었습니다.");
    } else {
        System.out.println("로그인 실패");
    }
	
	
	//리턴타입이 잘 구분이 안 될 때 > void
	
	
	
	
	}

}
