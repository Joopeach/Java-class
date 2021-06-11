package Day12;

public class Day12_4 {
	
	public static void main(String[] args) throws Exceptionㅁ {
		
		//예외처리 : 오류 발생시에 처리 코드
			//1. 일반적인 오류는 코드에서 처리
			//2. 예상치 못한 오류 발생시 => 예외처리
				//1. 코드상 문제가 없는 경우
			//3. 형태
				//try{오류발생 예상코드}
				//catch(예외클래스 객체명) {오류발생시 대체 코드}
				//finally {무조건 실행되는 코드}
			//4.예외클래스
				//1.예외 이유를 알고 있는 경우 : 예외클래스 사용
				//NullPointerException
				//NumberFormatException
				//ArrayIndexOutOfBoundsException
				//등등
				//2.예외 이유를 다양하거나 모르는 경우 : Exception 클래스 사용
				//Exception : 모든 Exception 처리 할수 있음 [슈퍼클래스]
		
		//1. 변수가 null인 경우 출력시
		try { //오류 발생할것 같은 코드 => 오류발생시 catch로 이동
				//=> 오류가 없을경우 try 모두 실행
		String data = null;
		System.out.println(data.toString()); //toString : 객체 정보 반환
		}
		catch (NullPointerException e) { //try에서 오류 발생시 catch 문 처리
			System.out.println("예외발생 : " + e);
		}
		//2. 배열오류
		try {
		String[]문자배열 = new String[2]; // string 객체를 2개 저장할수있는 배열
		문자배열[0] = "강호동";
		문자배열[1] = "신동엽";
		문자배열[3] = "서장훈"; //오류 발생 : 배열의 크기가 부족
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외발생 : " + e);
		}	
		
		//3. 숫자 => 문자 변경 가능 //문자 => 숫자 변경 불가능
		try {
		String data1 = "100"; // 문자열
		String data2 = "a100"; //문자열
		
		//문자열 => 숫자열 반환 [Integer.parseInt(문자열)]
		System.out.println(Integer.parseInt(data1)); //"100"-> 100가능
		System.out.println(Integer.parseInt(data2)); //"a100"-> a100불가능
		}
		
		
		//4. 다중 예외처리
		try {
			//1.
			String data = null;
			System.out.println(data.toString()); //toString : 객체 정보 반환
			//2.
			String[]문자배열 = new String[2]; // string 객체를 2개 저장할수있는 배열
			문자배열[0] = "강호동";
			문자배열[1] = "신동엽";
			문자배열[3] = "서장훈"; //오류 발생 : 배열의 크기가 부족
			//3.
			String data1 = "100"; // 문자열
			String data2 = "a100"; //문자열
		}
//		catch (NullPointerException | ArrayIndexOutOfBoundsExceptoin e)
//		System.out.println("예외발생 : " + e);
//		}
		catch (Exception e2) {
			System.out.println("예외발생 : " + e2);
		}
		finally {
			System.out.println("코드 종료");
			
		//5.예외 떠넘기기	
			try {
			Day12_5.예외던지기();
			}
			catch (Exception e) {
				//TODO : handle exception
			}
				
			
			
		

}
}
