package pack03_constructor;

public class Ex02_KoreanMain {
	public static void main(String[] args) {
		Ex02_Korean kore = new Ex02_Korean("김한국","123564-4821");
		//강제로 데이터의 정합성: 이름, 주민등록번호가 없는 데이터(객체)하나는 실제 하면 안 됨
		System.out.println(kore.nation);
		System.out.println(kore.name);
		System.out.println(kore.ssn);
	}

}
