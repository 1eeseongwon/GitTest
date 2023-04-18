package pack02_static;

public class Ex03_String {
	//String Class: 문자열을 조작하기 위한 기능을 담고 있는 클래스
	//java.lang<패키지.String.class(.java)
	//String 역시 Class파일이기 때문에 멤버를 가지고 있다
	//다른 사람(자바, 오라클)이 만든 클래스의 기능(메소드) 활용해 보자
	//변수는 소괄호X 메소드는 소괄호O
	public static void main(String[] args) {
		String str1 = "apple"; //apple문자열을 str1이라는 변수에 할당
		String str2 = new String("APPLE");//인스턴스화 과정을 거쳐서 str2라는 변수에 APPLE할당
		
		System.out.println("str1" + str1);
		System.out.println("str2" + str2);
		
		//length()메소드: 문자열의 길이를 알 수 있음
		System.out.println("length(): " + str1.length());
		
		//toUpperCase(), toLowerCase()
		//대문자, 소문자 변경
		System.out.println("toUpperCase(): " + str1.toUpperCase());
		System.out.println("toLowerCase(): " + str2.toLowerCase());
		
		//subString(): 특정 문자 추출 (index)
		//subString메소드를 코드 자동완성(ctrl+space)해 보고 호출
		System.out.println(str1.substring(4));
		//내가 준 index0부터 문자열 끝까지 출력
		System.out.println(str1.substring(1, 3));
		//index1부터 3의 앞까지 추출 3-1=2(출력)
		
		//charAt(): 문자열에서 특정 문자 한 글자만 추출
		System.out.println(str1.charAt(4));
		System.out.println(str1.substring(4));
	
		//indexOf(): 문자열에서 특정 문자의 존재여부 > 존재: index 반환, 실패 > -1
		System.out.println(str1.indexOf(0));
		
		//split(): 문자열의 분리 > split()메소드를 이용해서 split()메소드가 리턴하는 타입의 데이터에 담아보기
			String[] temp = str1.split("");
			System.out.println(temp.length);
			String str3 = "ab cd ef";
			String[] tempArr = str3.split(" ");
			System.out.println(tempArr.length);
			
		//replaceAll(): 문자열 치환(특정 문자를 바꿔서 원하는 문자로 바꾸는 것)
		//A > X
		//pp라는 글자를 찾아서 @@로 바꾸기
		System.out.println(str1.replaceAll("pp", "@@"));
		//return타입? String?
		
		//trim(): 좌우 공백 제거
		String trimStr1 = "   adc  def    ";
		System.out.println(trimStr1.trim().replaceAll(" ", "").length());
		
		String eqStr1 = "A";
		String eqStr2 = new String("A");
		if (eqStr1.equals(eqStr2)) {
			System.out.println("같음");
		} else {
			System.out.println("다름");
		}
	}

}
