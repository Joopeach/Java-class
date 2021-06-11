package Day14;

import java.util.Calendar;
import java.util.Scanner;

public class Day14_2 {
	
	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
		
		System.out.println("검색 연도 : "); int year = scanner.nextInt();
		System.out.println("검색 월 : "); int smonth = scanner.nextInt();
		달력검색(syear,smonth); //메소드 호출
		
		//현재 날짜의 달력
		Calendar calendar = Calendar.getInstance(); // 1.현재 달력 가져오기
		int today = calendar.get(calendar.DAY_OF_MONTH); // 2. 현재 날짜의 일수
		int year = calendar.get(calendar.YEAR); // 3. 현재 날짜의 연도
		int month = calendar.get(calendar.MONTH)+1; // 4. 현재 날짜의 월 +1 [1월:0~]
		
		calendar.set(year, month-1,1); // 5. 현재 날짜의 1일
		int sDay = calendar.get(Calendar.DAY_OF_WEEK); // 6. 시작 요일
		int eDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); // 7. 현재 날자
		
		
		
		// 달력 출력
		System.out.println("========== " + year +"년" + month + "월===================");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("=============================");
		
			int ssDay = sDay; //요일 구분 [토요일마다 줄바꿈]
			
		// 현 월의 1일의 위치 앞까지 공백 채우기
			for(int i=1;i<eDay;i++) {
				
				if (i == today) System.err.print(i+"\t");
				else System.out.print(i+"\t");
				
				//줄바꿈
				if(ssDay%7 == 0) System.out.println(); //줄바꿈
				ssDay++; //요일증가
				
		// 요일출력
			for(int i = 1; i<=eDay;i++);
				if(i == today) System.out.print("["+i+"]"+"\t");
				System.out.print(i+"\t");
				
				//줄바꿈
				System.out.println(); //줄바꿈
				
				
			}
		
	}

}
