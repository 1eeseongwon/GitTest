package pack08_casting;

public class Ex02_Casting {
	public static void main(String[] args) {
		// 문자열 = "12" + 34 = 1234
		// String + int = String
		// 문자열 + 어떤 값 = 문자열 규칙
		// 문자열 결합의 법칙 ↑
		// "1"(String) == 1(int, double) (다르다)
		
		String sum = "12" + 34;
		// 어떤 값을 String으로 바꾸는 것은 간단하다
		String sum2 = ""+1234+10; 
		System.out.println(sum2);
		
		// String sum, sum2 변수에 문자열로 숫자를 저장해 둠
		// 두 개의 합을 알고 싶다 "1234" + 1234 = 12341234
		// 숫자 1234 + 1234 = 2468의 결과를 얻어야 함
		// String -> int ?
		// int, double 등 보라색으로 글씨 바뀌는 것 > 기본 타입
		// 대문자로 시작하는 것들은 대부분 Class타입
		// 기본 데이터 타입은 Wrapper class라는 것을 가지고 있다
		// int = ★Integer★, double = Double
		// String을 해당하는 타입으로 바꿔 주는 행위를 하는 것
		// String에 있는 ""< 제거한다
		int num = Integer.parseInt(sum) + 1234;
		int num2 = Integer.parseInt( sum2 );
		System.out.println(num);
		
		String sAvg = "88.6";
		// + 10을 한 결과를 얻고 싶음 
		// sAvg를 double로
		double dAvg = Double.parseDouble(sAvg) + 10;
		System.out.println(dAvg);
		//WrapperClass.parseDataType(String) > DataType
		String str = "123";
		// 해당 데이터를 숫자로 바꿀 수 있나
		int num4 = Integer.parseInt(str);
		System.out.println(num4);
		// 콘솔창 확인하기 (빨간색은 오류) 마지막 줄 오류난 곳
		
		// Float.parseFloat(sAvg)
		// Long.parseLong(sAvg)
		// Byte.parseByte(sAvg)
		
	}
}
