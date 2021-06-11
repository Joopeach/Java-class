package Day15;

import java.util.ArrayList;
import java.util.List;

public class Day15_2 {

	public static void main(String[] args) {
		
		//컬렉션 프레임워크 ㅣ 메모리 관리 클래스 집합
			//컬렉션 : 수집
			//프레임워크 : 미리 만들어진 프로그램
		//1.List 컬렉션
			//1. ArrayList, 2. Vector , 3. LinkedList
				//1. 배열과 차이점 : 배열[고정메모리] / list[가변메모리]
					// 배열 : int[] 배열명 = new int[0]
				//2. 인덱스 사용 : 저장되는 순서 [0번부터 시작]
				//3. 추가, 삭제시 : 인덱스 자동 변경
				//4. 자주 사용되는 메소드
					//1. 리스트명.add("객체명")
					//2. 리스트명.get(인덱스번호)
					//3. 리스트명.remove(인덱스번호)
					//4. 리스트명.size()
					//5. 리스트명.clear
				//5. ArrayList vs Vector : 
			
		// ex1) ArrayList 클래스
			//1. 선언
			List<String> list = new ArrayList<>();
			ArrayList <String> list = new ArrayList<>();
			//인터페이스/클래스명 <리스트에 들어가는 클래스명> 리스트명 = new ArrayList<생략가능>();
			
		//2. 메소드
			list.add("java"); //리스트에 객체 넣기
			list.add("123"); //add하고싶은 클래스를 넣는다  //리스트에 선언된 클래스만 넣기 가능
			list.add("python");
			list.add("database");
			list.add("c++");  //list에 추가할때는 add를 사용한다. - 쌤왈
			
			
			//2. 리스트에 객체 호출하기
			System.out.println(list.get(0));
			
			//3. 리스트 삭제하기
			list.remove(0);
			System.out.println(list.get(0));
			
			//4. 리스트내 객체수
			System.out.println(list.size());
			
			//5. 반복문 활용1
			for(int i = 0; i<list.size();i++) {
				System.err.println(list.get(i));
			}
			
			//6. 반복문 활용2
			for(String temp : list) {
				System.out.println(temp);
			}
			
			//7. 객체 모두 삭제
			list.clear(); //모두가 삭제가 됨.
			
		
		
		//2. Set 컬렉션
		//3. Map
		
	}
}
