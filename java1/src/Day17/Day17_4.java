package Day17;

public class Day17_4 {
	
	public static void main(String[] args) {
		
		// 예외처리 : 예외(오류)발생 했을때 처리 코드
			// * 코드상 오류를 제외한 예외처리
				// if : 오류 [예상되는 오류] 차단
			// 1. 예상되지 않는 오류를 처리
			// 2. 경우의 수가 많은 오류 처리 => 다른코드 대체
			// 3. try {오류가 발생할 것 같은 코드} cathc () {대체코드}
			// 4. 오류 발생하면 => 프로그램 종료 /// 오류 발생했을때 => 예외처리 => 프로그램 정상화

		
		//ex1)
		String[] 배열 = new String[3]; // 배열크기 = 3
		try {
			배열[0] = "java";
			배열[1] = "java";
			배열[2] = "java";
			배열[3] = "java";
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외발생 : " + e);
		}
		//ex2)
		try {
		String 문자1 = "100"; // 문자
		String 문자2 = "a100"; //문자
		
		System.out.println("문자열 -> 숫자열 변환 : " + Integer.parseInt(문자1));
		System.out.println("문자열 -> 숫자열 변환 : " + Integer.parseInt(문자2));
		}
		catch (Exception e) {
			// TODO: handle exception 
			(NumberFormatException e) {
			System.out.println("예외발생 : " + e);
		}
			
		//ex3)
		try {
			String 문자3 = null;
			System.out.println("문자3이ㅡ 정보 " + 문자3.toString() );
		} catch
		
	}

}
