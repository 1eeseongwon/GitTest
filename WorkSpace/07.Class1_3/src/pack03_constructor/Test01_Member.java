package pack03_constructor;

public class Test01_Member {
	String id, pw, name;
	int age;
	
	public Test01_Member(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Test01_Member member = new Test01_Member("dsd","sdada","dsad",24);
		member.id ="dsd43";
		member.pw ="fdsfk";
		member.name = "이성원";
		member.age=44;
		System.out.println(member.id);
		System.out.println(member.pw);
		System.out.println(member.name);
		System.out.println(member.age);
				
	}
	
}