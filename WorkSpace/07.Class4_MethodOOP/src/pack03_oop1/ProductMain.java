package pack03_oop1;

public class ProductMain {
	public static void main(String[] args) {
		//상품 두 개를 생성하기
		//1. 컴퓨터 2. 노트북
		//display() 메소드를 이용해서 내용 출력해 보기
//		Product pm = new Product();
//		pm.num = 1;
//		pm.name = "컴퓨터";
//		pm.display();
//		
//		Product  pm2 = new Product();
//		pm2.num = 2;
//		pm2.name = "노트북";
//		pm2.display();
		
		ProductDTO dto = new ProductDTO();
		dto.num =1;
		dto.name="컴퓨터";
		ProductDTO dto2 = new ProductDTO();
		dto2.num =2;
		dto2.name="노트북";
		ProductDAO dao = new ProductDAO();
		dao.display(dto2);
		
		
		
		
		
	}

}
