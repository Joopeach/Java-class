package Day14;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;

public class Day14_1 {
	
	public static void main(String[] args) {
		
	// 여러가지 API 클래스
		// API : 미리 작성된 프로그램[클래스]
	
	// 날짜 관련 클래스
		// 1. date 클래스 : 시스템날짜 / 시간
		// 2. SimpleDateFormat 클래스 : 날짜형식[모양] 클래스
		// 3.
	
	// ex 1) 현재 날짜
		Date date = new date(); // 날짜 객체
		System.out.println("날짜 객체 : " + date);
		System.out.println("날짜 객체 정보 : " +date.toString());
		
		
	// ex 3) 달력
		Calendar calendar = Calendar.getInstance(); //현재 달력
		System.out.println(calendar);
		
		System.out.println("연도 : "+ calendar.get(calendar.YEAR));
		System.out.println("월 : "+ calendar.get(calendar.MONTH)+1); //1월 : 0 2월:1 3월:2
		System.out.println("일[연단위] : "+ calendar.get(calendar.DAY_OF_YEAR)+1); //연단위 일수
		System.out.println("일[주단위] : "+ calendar.get(calendar.DAY_OF_WEEK)+1); //연단위 일수
		System.out.println("일[월단위] : "+ calendar.get(calendar.DAY_OF_MONTH)+1); //연단위 일수
	
		//요일 : 숫자 => 한글
		int 요일 = calendar.get(calendar.DAY_OF_WEEK);
		if(요일 == 1) System.out.println("일요일");
		if(요일 == 2) System.out.println("월요일");
		if(요일 == 3) System.out.println("화요일");
		if(요일 == 4) System.out.println("수요일");
		if(요일 == 5) System.out.println("목요일");
		if(요일 == 6) System.out.println("금요일");
		if(요일 == 7) System.out.println("토요일");
		
		//시간
		System.out.println("오전[0]/오후[1]: " + calendar.get(calendar.AM_PM));
		
		int ampm = calendar.get(calendar.AM_PM);
		if (ampm == 1) System.out.println("현재 오후");
		else System.out.println("현재 오전");
		
		System.out.println("현재 시 : "+ calendar.get(calendar.HOUR));
		System.out.println("현재 분 : "+ calendar.get(calendar.));
		
	// ex 5)
		LocalDate 현재날짜 = LocalDate.now();
			System.out.println("현재날짜 : " + 현재날짜);
		LocalDate 사용자날짜 = LocalDate.of(2024, 6, 7)	;
				
		LocalTime 현재시간 = LocalTime.now();
			System.out.println("현재 시간 : " +현재시간);
		LocalTime 사용자시간 = LocalTime.of(6, 30, 58);
			System.out.println("사용자 시간 : "+사용자시간);
			
		LocalDateTime 현재날짜시간 = LocalDateTime.now();
			System.out.println("현재날짜시간 : " + 현재날짜시간);
		LocalDateTime 사용자날짜시간 = LocalDateTime.of(2021, 1,1,9,30,30);
			System.out.println("사용자 날짜 시간 : "+사용자날짜시간);
			
	// ex 6)
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
			System.out.println("협정세계 시 : " + zonedDateTime);
		ZonedDateTime newyork = zonedDateTime.now(ZoneId.of("America/New_York"));
			System.out.println("뉴욕시간 : "+newyork);
			
			
		 

}
	
}
