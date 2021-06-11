package Day17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day17_3 {
	
	
	public static Queue< String > 종점역 = new LinkedList<String>();
	public static Queue< String > 용산역 = new LinkedList<String>();
	public static Queue< String > 서울역 = new LinkedList<String>();
	public static Queue< String > 구로역 = new LinkedList<String>();
	
	public static ArrayList<Queue<String>> 전철현황 = new ArrayList<>();

	
	//main 밖에서 선언하면 main포함 모두 사용가능
	
	
	public static void main(String[] args) {
		
		// Queue
			// 1. 전철 밀어내기
			// 2. 역 : 종점역 -> 용산 -> 서울 -> 구로
			// 3. 종점역 : 전철 3개의 객체
			// 4. 3초마다 하나씩 역 이동
		
		전철현황.add(종점역); 전철현황.add(용산역); 전철현황.add(서울역); 전철현황.add(구로역);
		
		전철현황.get(0).offer("전철1");
		전철현황.get(0).offer("전철2");
		전철현황.get(0).offer("전철3");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("=======현재 전철역 상황=======");
			전철역현황();
			System.out.println("전철 출발 신호: 1. 종점역 2.용산역 3.서울역 4.구로역");
			int 선택 = Scanner.nextInt;
		}

//		Queue< String > 종점역 = new LinkedList<String>();
//		Queue< String > 용산역 = new LinkedList<String>();
//		Queue< String > 서울역 = new LinkedList<String>();
//		Queue< String > 구로역 = new LinkedList<String>();
//		
//		ArrayList<Queue<String>> 전철현황 = new ArrayList<>();
		
		전철현황.get(0).offer("전철1");
		전철현황.get(0).offer("전철2");
		전철현황.get(0).offer("전철3");
		
		System.out.println("현재 종점역의 전철 수: " + 전철현황.get(0));
		
		
		public static void 종점역출발()
		try {
			System.out.println(" 3초 후 ~~~~~~");
			Thread.sleep(3000); // 밀리초 시간 지연
				전철현황.get(1).offer(전철현황.get(0).poll());
				String temp = 전철현황.get(0).poll();
				전철현황.get(1).offer(temp);
				
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("현재 종점역의 전철 수 : ");
		System.out.println("현재 용산역 전철 수: ");
				
	} // 메인 메소드 끝

	//전철역 현황 메소드
		public static void 전철역현황() {
			try {
			System.out.println("현재 종점역의 전철 수 : ");
			Thread.sleep(3000); // 밀리초 시간 지연
				String temp = 전철현황.get(3).poll();
				전철현황.get(0).offer(temp);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	
}

	
