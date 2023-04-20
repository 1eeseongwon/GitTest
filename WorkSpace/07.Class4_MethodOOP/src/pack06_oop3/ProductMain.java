package pack06_oop3;

public class ProductMain {
	public static void main(String[] args) {
		String[] strArr = new String[5];
		// 0String, 1Sting, ...
		strArr[0] = "1";
		strArr[1] = "2";
		strArr[2] = "3";
		strArr[3] = "4";
		strArr[4] = "5";
		
		
		
		
		ProductDTO[] dtoArr = new ProductDTO[5];
		ProductDAO dao = new ProductDAO();
		//처음 보는 타입을 배열로 묶을 때 어려움이 있으면 해당하는 타입을 먼저 객체로 생성해 보기
		//생성한 객체를 배열의 임의의 인덱스에 넣어보기
		//객체 생성시 사용한 생성자 또는 값을 배열의 인덱스에 넣게 수정
		
		dtoArr[0] = new ProductDTO(1, "컴퓨터", 10000, 5);
		dtoArr[1] = new ProductDTO(2,"노트북", 20000, 4);
		dtoArr[2] = new ProductDTO(3,"라면", 1000, 10);
		dtoArr[3] = new ProductDTO(4,"커피", 2000, 5);
		dtoArr[4] = new ProductDTO(5,"마우스", 5000, 6);
		for(int i = 0; i < dtoArr.length; i++) {
			System.out.println(dtoArr[i].getNum());
			//dao.display(dtoArr[i]); 
			
		}
		dao.display(dtoArr);
		//dtoArr[0] =
		//dtoArr: 0~4번까지는 어떤 데이터가 들어있을까
		// - null 
		//dtoArr[0] = ? 값 대입을 뭘 해줘야 할까
		//해당하는 타입을 생성할 수 있는 값 (생성자 메소드, 값)
		//dtoArr를 이용해서 상품 번호 출력해보
		
		ProductDTO dto = new ProductDTO(1, "컴퓨터", 10000, 5);
		ProductDTO dto2 = new ProductDTO(2,"노트북", 20000, 4);
		ProductDTO dto3 = new ProductDTO(3,"라면", 1000, 10);
		ProductDTO dto4 = new ProductDTO(4,"커피", 2000, 5);
		ProductDTO dto5 = new ProductDTO(5,"마우스", 5000, 6);
		//System.out.println(dto.cnt); < 접근제한자로 변수의 접근을 막아놓음
		System.out.println(dto.getNum());
		//매번 dto의 내용을 하나씩 getter로 불러오는 게 아니라 display()라는 메소드를 DAO에 구현하고
		//해당하는 메소드 호출 시 dto의 내용을 보여 줄 수 있게 해 보기
		
		
		dao.display(dto);
		dao.display(dto2);
		dao.display(dto3);
		dao.display(dto4);
		dao.display(dto5);
	}

}
