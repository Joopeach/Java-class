package Day10;

import java.util.ArrayList;

public class Day10_2 {
//	회원 클래스로 상속받아 vip, 관리자 클래스 설계 하고
//	* 각 3개의 객체 생성 하기
//	
//	1.회원 클래스
//		1.아이디, 비밀번호
//		2. 생성자
//		3.회원정보 메소드
//	2. vip 클래스
//		1. 회원등급;
//		2. 생성자 : super 사용
//		3. 회원정보 메소드
//		
//	3. 관리자 클래스
//		1.관리자 직급;
//		2. 생성자 super 사용
//		3. 회원정보 메소드 @Override
	
	public static void main(String[] args) {
		
		회원 유저1 = new 회운1("qwe", "qwe");
		VIP회원 유저1 = new VIP회원("asd","asd" ,"골드");
		
		유저1.회원정보();
		유저2.회원정보();
		유저3.회원정보();
		
		//상속 받았을때 리스트
		ArrayList<회원> 회원목록 =new ArrayList<>();
		ArrayList<VIP회원> vip목록 = new ArrayList<>();
		ArrayList<관리자> 관리자목록 = new ArrayList<>();
		
		회원목록.add(유저1); // 슈퍼 클래스로 생성된 리스트는 하위 클래스의 객체를 담을수있다.
		회원목록.add(유저2);
		회원목록.add(유저3);
			회원목록.
		
		
	}
	

}

