package pack04_oop2;

public class StudentDTO {
	//메소드나 변수 앞에 접근제한자라는 것을 사용하면
	//외부에서 접근을 제한할 수 있다
	//public, protected, default, private
	//public(공공, 공개된), private(공개되지 않은, 사적인)
	private int num;
	//public: 같은 프로젝트 내에서 접근 가능
	//default: 같은 패키지 내에서 접근 가능
	//private: 같은 클래스 내부에서만 접근 가능
	private String name;
	//외부에서 접근해서 변경하면 데이터 신뢰가 없어짐
	
	//getter&setter
	//변수이름앞에 get 붙이고 뒤에 변수이름 첫번째 글자를 대문자로 바꾼형태로
	//외부에서의 접근이 막혀 있는 변수를 메소드를 통해서 접근 가능하게 만드는 구조
	//score1 > getScroe1()메소드 > 들어있는값을리턴해줌
	//			setScroe1(int score) >값을 변경해줌
	private int score1;
	private int score2, score3, sum;
	private double avg;
	
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getScore1() {
		return score1;
	}

	public void setScore1(int score1) {
		this.score1 = score1;
	}

	public int getScore2() {
		return score2;
	}

	public void setScore2(int score2) {
		this.score2 = score2;
	}


	public int getScore3() {
		return score3;
	}


	public void setScore3(int score3) {
		this.score3 = score3;
	}


	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}


	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}



	public StudentDTO(int num, String name, int score1, int score2, int score3) {
		super();
		this.num = num;
		this.name = name;
		this.score1 = score1;
		this.score2 = score2;
		this.score3 = score3;
		this.sum = this.score1+this.score2+this.score3;
		this.avg = (double)(this.score1+this.score2+this.score3)/3;
}
}
