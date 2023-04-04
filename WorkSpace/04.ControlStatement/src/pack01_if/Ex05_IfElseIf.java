package pack01_if;

public class Ex05_IfElseIf {
	public static void main(String[] args) {
		//if else문으로는 어떤 조건을 줄 때 true/false
		//if (조건식A) {
		// 조건식A가 True일 때 실행할 코드}
		// else if (조건식B) {
		// 조건식A가 true가 아니고 조건식B일 때 실행할 코드 }
		// else if (조건식C) {
		// 조건식A,B가 true가 아니고 조건식C일 때 실행할 코드 }
		// 	else { if와 elseif의 모든 조건이 아닐 때 실행
		// 조건식A가 True가 아닐 때 실행 코드 넣어 줌 (if 뒤에)}
		
		int score = 75; //기존방식으로 &&, ||
		// 90이상이면 A 80이상이면 B, 70 C, 그외는 D
		if (score>=90) {
			System.out.println("A");
					}
		if (score>=80 && score < 90) {
			System.out.println("B");
		}
		if (score>=70 && score < 80) {
			System.out.println("C");
		}
		if (score < 70) {
			System.out.println("D");
		}
		
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
}
}