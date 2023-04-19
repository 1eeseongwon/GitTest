package pack04_oop2;


//Student Class: 학생의 성적 정보를 관리할 수 있게 만든 설계도

public class Student {
	//필드부 직접 구현하고 StudentMain에서 Student객체 생성, 내용 할당, 출력
	//멤버(필드): 학생의 번호, 이름 국어성적, 수학성적, 영어성적, 총점, 평균
	int num;
	String name;
	int score1, score2, score3, sum;
	double avg;
	
	
	
	public Student(int num, String name, int score1, int score2, int score3) {
		super();
		this.num = num;
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
		this.sum = this.score1+this.score2+this.score3;
		this.avg = (double)(this.score1+this.score2+this.score3)/3;
		
		
	}
	//DTO와 DAO로 나눠서 main에서 똑같은 동작이 되게 처리해보기
	void display() {
		System.out.println(num);
		System.out.println(name);
		System.out.println(score1);
		System.out.println(score2);
		System.out.println(score3);
		System.out.println(sum);
		System.out.println(avg);
	}
	
	
	

}
