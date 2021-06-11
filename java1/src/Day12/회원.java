package Day12;

public class 회원 {
	
	private String 아이디;
	private String 비밀번호;
	private String 성명;
	
	//접근메소드 = > setter
	public void set아이디(String 아이디 ) {
		// 아이디를 인수로 받아 현재 클래스의 아이디 대입
		this.아이디 = 아이디;
	} public void set비밀번호(String 비밀번호)
	
	//접근메소드 = > getter [연수 X ,반환 O]
	public String get아이디() {
		return this.아이디;
	}
	public String get비밀번호() {
		return this.비밀번호;
	}
	public String get성명() {
		return this.성명;
	}
	
	//생성자, get메소드, set메소드 => 자동완성 기능
		// 마우스 오른쪽클릭 =>Source
	
	//로그인
	public static login (String 아이디, String 비밀번호) {
		
		if(아이디.equals("qwe")) {
			//예외 만들기
			System.out.println("아이디가 다릅니다");
		}
			// ! : 부정 연산자 : True => False
		if(비밀번호.equals("qwe")) {
			System.out.println("비밀번호가 다릅니다");
		}
		System.out.println("로그인 성공");
		}

}
