package Day15;

import java.util.ArrayList;
import java.util.Scanner;

public class Day15_1 {
	
	
	//JRE SystemLibrary 보면 jdk설치시 다 깔림


		
		public static Scanner scanner = new Scanner(System.in);
		public static ArrayList<회원> 회원목록 = new ArrayList<>();
		
		public static void main(String[] args) {
		
		while(true) {
			System.out.println("=====Login=====");
			System.out.println("1.회원가입 2.로그인 3.비밀번호찾기 4 .아이디불가 ,종료");
			System.out.println("3.비밀번호찾기[아이디,email] 4. 아이디불가[name,email]");
			int 선택 = scanner.nextInt();
			회원 temp = new 회원();
			if(선택 == 1) { temp.회원가입();}
			if(선택 == 2) {}
			if(선택 == 3) {temp.패스워드찾기();}
			
		}
		

	
	}
}
