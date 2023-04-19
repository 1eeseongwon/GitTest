package pack04_oop2;

public class StudentMain {
	
	//private < > public
	public static void main(String[] args) {
		//Student stu1 = new Student(1, "김영문", 50, 100, 50);
		//stu1.display();
		//DTO상태정보
		//DAO 기능
		
		StudentDTO dto1 = new StudentDTO(1,"김영문",50,100,100);
		StudentDAO dao = new StudentDAO();
		dao.display(dto1);
		System.out.println("==");
		dto1.setScore1(80);
		dao.display(dto1);
	}

}
