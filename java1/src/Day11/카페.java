package Day11;

public class 카페 implements 키오스크 {
	
	@Override
	public  void 메뉴() {
		System.out.println("-----> 카페 메뉴");
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
