package Day18;

import java.util.Scanner;

public class 예외처리문제 {
	
	//배열 선언
	public static int[] 대기명단 = new int[10];
	
	public static void main(String[] args) {
		
		System.out.println("====프로그램 실행====");
		Start();
		System.out.println("====프로그램 종료====");
	}
		
//		int[] 대기명단 = new int[10];
		
		
		public static void Start() {
		while(true) {
			Scanner scanner = new Scanner (System.in); //오류처리 :  scanner에 있는 문자를 다시
			System.out.println("====대기명단====");
			
			// 대기명단 출력
			for (int i =0; i<대기명수, i++) {
				if(대기명단[0] ==0 ) { System.out.println("----> 현재 대기명단 없습니다"); }
				else {
				}
			}
			
			System.out.print("1.명단추가 2.명단삭제");
			System.out.print("선택 ====");
			int 선택 = 0;
			
			try {
				선택 = scanner.nextInt(); //예외발생 => 이유 : scanner 문자가 입력했을경우
			}
			catch (Exception e) {
				System.out.println("----> 숫자만 가능합니다 [관리자에게 문의");
			}
			
			if (선택 == 1) { 
				for (int i = 0; i<10; i++) {
					if(대기명단[i] == 0) {
						System.out.println("인원수 입력 : ");
						대기명단[i] = scanner.nextInt();
						System.out.println("대기번호 : " + (i+1));
						break;
					} else {
						System.out.println("----> 대기줄 부족 [기다려주세요]");
					}
				}
			}
			if (선택 == 2) {
				for( int i = 0; i<10; i++) {
					
					//한칸씩 당기기
					대기명단[i] = 대기명단[i+1];
				}
			}
			if (선택 == 3 ) {
				
			}
			
			}
			
	} 	catch (Exception e) {
		System.out.println("----> [관리자에게 문의]");
	}

}
