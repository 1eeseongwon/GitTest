package pack03_oop1;

public class ProductDAO {
	//기능만 있음
	//필요에 따라서는 필드에 변수 (DAO에 필요한 것) 만들기도 함
	
	void display(ProductDTO dto) {
		System.out.println("번호 " + dto.num);
		System.out.println("이름 " + dto.name);
	}
	
	void input() {
		System.out.println("상품 추가하기");
	}

}
