package Day10;

public class 사람 {
	
	//필드
	String 이름;
	int 나이;
	
	
	//생성자 = 반생성자, 1개월드생성자
	public 사람() {}
	public 사람(String 이름) {
		this.이름 = 이름;
	}
	public 사람(String 이름, int 나이) {
		this.이름 = 이름;
		this.나이 = 나이;
	}
	//메소드
	public void 점보() {
		System.out.println(this.이름);
	}

}
