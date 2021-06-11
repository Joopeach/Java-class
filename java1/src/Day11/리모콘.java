package Day11;

public interface 리모콘 {
	
	//필드
	int 최대소음 = 10;
	int 최소소음 = 0;
	
	//추상메소드 : 선언만
	public void 실행();
	public void 종료();
	public void 소음설정();
	
	//디폴트메소드 : 선언만 정의 O
	public default void 채널변경() {
		System.out.println("채널변경");
	}
	public void 소음설정(int i);

}
