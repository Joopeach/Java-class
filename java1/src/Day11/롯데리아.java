package Day11;

public class 롯데리아 implements 키오스크 {

	@Override
	public  void 메뉴() {
		System.out.println("-----> 롯데리아 메뉴");
	}
	
	@Override
	public void 장바구니() {
		System.out.println("-----> 현재 구매 상품");
	}
	
	@Override
	public void 결제() {
		System.out.println("-----> 결제 예정 상품");
	}
	
	
}
