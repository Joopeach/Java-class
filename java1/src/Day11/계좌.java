package Day11;

public class 계좌 implements ATM {
	
	//필드
	String 계좌번호; //식별용
	String 금액;
	public 계좌() {
		// TODO Auto-generated constructor stub
	}
	//생성자
	public 계좌(String 계좌번호, String 금액) {
		this.계좌번호 = 계좌번호;
		this.금액 = 금액;
	}
	@Override
	public void 메뉴() {
		
	}
	
	@Override
	public void 계좌등록() {
		System.out.println("----> 계좌등록");
		System.out.println("계좌번호 : ");
	}
	@Override
	public void 예금() {
		System.out.println("----> 예금");
		
		
		
	}
	@Override
	public void 출금() {
		System.out.println("----> 출금");
		int result = 계좌찾기(); //메소드 반환
		if(result == -1) return;
		else {
			System.out.println("-----> 출금 할 금액 : ");
			int 금액 = Day11_3.scan.nextInt();
			//조건 : 예금보다 더 큰 금액을 출금 X
			if(Day11_3.계좌목록.get(result).금액<금액) {
				System.out.println("---->예금액이 부족합니다");
				return i;
			}
			Day11_3.계좌목록.get(result).금액 -= 금액;
			System.out.println("----> 출금성공");
		} // else끝
	}
	@Override
	public void 잔고() {
		System.out.println("----> 잔고");
		int result = 계좌찾기(); // 메소드 반환
		if(result == -1) return;
		else {
			System.out.println("---->현재 잔고 :  " + Day11_3.계좌목록.get(result).금액());
		}
	}

	}

	@Override
	public int 계좌번호() {
		
		
		return 0;
	}
	@Override
	public int 계좌찾기() {
		System.out.println("계좌번호 : ");
		String 계좌번호 = Day11_3.scan.next();
		//for활용=> 리스트for문
		for(int i = 0; i<Day11_3.계좌목록.size();i++) {
			계좌 temp = Day11_3.계좌목록.get(i);
			if (temp.계좌번호.equals(계좌번호) ) {
				return i; // 반환값이 0 이상이면 계좌번호 찾기 성공
			}
		}
		System.out.println("----> 동일한 계좌번호가 없습니다");
		return -1; //반환값이 -1이면 찾기 실패
	}
	

}
