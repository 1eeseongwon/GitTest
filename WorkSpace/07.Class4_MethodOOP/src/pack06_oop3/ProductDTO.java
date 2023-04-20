package pack06_oop3;

public class ProductDTO {
//접근제한자: private(외부로부터 바로 접근을 제한한다)
//정보은닉(Information hiding), 캡슐화(encapsulation)
	private int num; //상품 고유번호
	private String name; //상품 이름
	private int price; //상품 가격
	private int cnt; //재고
	
	//가격과 재고가 현실에서는 -가 되면 안 된다
	
	//기본 생성자: JVM에서 제공하며 class의 이름 부분이 기본 생성자 메소드(new ClassName(); )
	public ProductDTO() {
	//생성자를 통해서 필드의 값을 초기화해야 할 경우, IDE기능을 이용해서 자동으로 만들기
	}

	public ProductDTO(int num, String name, int price, int cnt) {
		super();
		this.num = num;
		this.name = name;
		this.price = price;
		this.cnt = cnt;
	}

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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	
	}


