package Day11;

public interface ATM {
	
	//추상메소드
	public void 메뉴();
	public void 계좌등록();
	public void 예금();
	public void 출금();
	public void 잔고();
	public int 계좌번호();
	
	//
	public default void 종료() {
		System.out.println("ATM 종료");
	}
	
	} // interface끝


