package Day17;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day17_1 {
	
	public static void main(String[] args) {
		
			// 컬렉션 프레임워크 : 자료구성 [데이터 관리 구성]  STack,과 Queue 데이터 ㄱ ㅘㄴ리.
			// Stack 클래스
				//ex) : ctrl + z 되돌리기
				//입구/출구 동일 => 가장 나중에 들어오 ㄴ메모리가 가장 먼저 나감
				// .push( 객체 ) == add(객체)

			// Queue 클래스
				//ex) : 줄세우기
				//입구/출구 별도 => 가장 먼저 들어온 메모리가 가장 먼저 나감
		
			Stack < 동전 > 동전상자 = new Stack<>();
				// <  > : 제네릭
			동전상자.add( new 동전(100) );
			동전상자.add( new 동전(200) );
			동전상자.add( new 동전(300) );
			System.out.println("동전상자의 동전수 : " + 동전상자.size());
			
			
			for( 동전 temp : 동전상자) {
				System.out.println("동전 금액 : "+temp.동전);
			}
			
			while( 동전상자.isEmpty()) { // ! isEmpty 비어있으면 실행 안함
				동전 temp = 동전상자.pop();  //stack에서 지우기는 pop
				System.out.println(" 꺼낸 동전 : " + temp.동전);
			}
			
			Queue<동전> 동전상자2 = new LinkedList<>();  //인터페이스는 혼자 불가능 클래스사용
			
			동전상자2.offer( new 동전(100));
			동전상자2.offer( new 동전(200));
			동전상자2.offer( new 동전(300));
			
			System.out.println("동전상자 : " + 동전상자2.size());
			
			for(동전 temp : 동전상자2) {
				System.out.println("동전 금액 : "+temp.동전);
			}
			
			while( ! 동전상자2.isEmpty()) {
				동전 temp = 동전상자2.poll(); //queue에서 지우기는 poll
				System.out.println("동전 금액 : "+ temp.동전);
			}
			
				
	}

}
