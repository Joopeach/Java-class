package Day11;

public class Day11_1 {

	public static void main(String[] args) {
		
		//상속 : 슈퍼클래스[상속을 주는 클래스]가 서브클래스 [상속을 받는 클래스]에게 메모리 주기
		//인터페이스 : 메소드사용하는데 추상자료형
				//  극단적으로 동일한 목적하에 동일한 기능을 수행하게끔 강제로 
			//추상 : 메소드를 선언하고 정의 하지 않음
			//예) 리모콘, 오락실 버튼 (정의하는건 티비)
				//1. 동작에 관련된 메소드 선언만 정의를 하지않음
				//2. 추상메소드는 관련된 클래스에서 정의 하기
			//사용목적 : 여러 클래스들이 동일한 목적하에 메소드를 사용하기 위해
		
		
		리모콘 리모콘; //인터페이스 객체 => 리모콘 생성
			//1.혼자서 할 수 있는게 없음 = > 정의X
		리모콘 = new 텔레비전(); //리모콘과 텔레비전 연결
			//2. 인터페이스에 클래스 메모리 할당
		리모콘.실행();
		리모콘.소음설정(6);
		리모콘.종료();
		
			//3. 리모콘에 작동 클래스 교체
		리모콘 = new 오디오(); //리모콘과 오디오 연결
		리모콘.실행();
		리모콘.소음설정();
		리모콘.종료();
	
	}
}
