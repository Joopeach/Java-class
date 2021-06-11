package Day08;

import java.util.ArrayList;
import java.util.Scanner;

public class Day08_2 {
	
	//List
	public static ArrayList< 게시판 > 게시판목록 = new ArrayList<>();
	
		//main 밖에서 생성하기 => main 밖에서도 사용하기 위해서
	public static Scanner scan = new Scanner(System.in);
		// static : main 스레드가 코드 읽어주는데 main 밖에 있으면 못읽음
			// => static : static 선언시 스레드 별개로 코드 실행시 먼저 메모리 할당
	
	public static void main(String[] args) {
		// 게시판 클래스
			// 1. 필드 : 상태
				// 1. 게시물번호, 게시물제목, 게시물내용, 게시물작성자, 조회수 등
			// 2. 생성자[필수X]
				// 1. 빈생성자, 특정필드만 받는 생성자, 모든필드를 받는 생성자
			// 3. 메소드 : 행동 [실행코드]
				// 1. 게시물등록, 게시물삭제, 게시물조회수증가
	while(true) {
		System.out.println("==== 게시판 커뮤니티 ====");
		
		// 모든 게시판 출력
			System.out.println("번호\t제목\t작성자\t조회수");
			// 반복문을 이용한 리스트에 객체 모두 꺼내기
			for (int i = 0; i<게시물목록.size(); i++) {
				
			}
			
		System.out.println("1.등록"); int 선택 = scan.nextInt();
		if ( 선택 = 1 ) {
			게시판 temp = new 게시판();
			temp.게시물등록();
		}
		if ( 선택 = 2) {
			System.out.println("--> 게시물번호 : "); int 번호 = s
			게시판 temp = new 게시판();
			temp.게시물삭제(번호);
		}
	}
		
	}

}


//itdanja@kakao.com
//과제1 : 회원제 게시판
//		1. 회원 클래스 => 객체 => 회원목록 리스트
//			회원 필드 : 아이디, 비밀번호, 이름, 연락처
//			회원 생성자 : 선택
//			회원 메소드 : 회원가입, 로그인, 회원탁ㄹ퇴, 회원수정
//		2. 게시판 클래스 => 객체 => 게시물목록 리스트
//			게시판 필드 : 번호, 제목, 내용, 작성자[로그인된아이디], 작성일, 조회수
//			게시판 생성자 : 선택
//			게시판 메소드 : 글쓰기, 글출력, 글상세보기 , 글삭제, 글수정
//		3. 프로그램 클래스 [main 메소드]
//				1. 메뉴 생성
//					1. 회원가입 [아이디 중복제거]
//					2. 로그인
//					3. 종료
//				2. 로그인 성공시 메뉴	
//					- 모든 게시물의 커뮤니티 출력
//					1. 회원목록
//					2. 글쓰기
//					3. 글보기
//				3. 글보기 했을때
//					1. 로그인한 아이디와 글 작성자와 동일한 경우에만 글삭제, 글수정
