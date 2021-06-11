package Day10;

public class 학생 extends 사람 {
	
	//생성자
	public 학생(String 이름,int 나이) {
		super (이름, 나이); //상속을 준 클래스의 생성자
	}
	//메소드 재정의
	@Override
	public void 학생정보() {
		System.out.println("학생의 이름은 :" + this.);
	}
}
