package Day13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Day13_1 {
	
	public static void main(String[] args) throws Exception {
		
		//메모리 : 데이터 저장 [프로그램 종료시 초기화]
			// 영구 저장 : 파일, DB, 클라우드 등
		
		//2진수[0,1] : 1비트 => 8비트 => 1바이트 =>
		//스트림이란?
			//: 
		
		//file
			//1.파일생성
			FileOutputStream outputStream = new FileOutputStream("C:/java/ouput.txt");
			//파일출력클래스		객체클래스			new[메모리할당연산자] 생성자("경로명/파일명/확장자명 )
		
			//2.파일쓰기
			String 내용 = "java입니다";
			outputStream.write(null);
			//객체명.write(바이트단위)
				//String.getBytes() : 문자열 => 바이트단위 변ㄴ환
		
			//3.입력값 쓰기
			Scanner scan = new Scanner(System.in);
			System.out.println("파일 내용 입력 : "); String 내용2 = scan.next();
			outputStream.write(내용2.getBytes());
		
		
			//4. 파일 내용 추가 [기존 파일에 내용 추가 (true)]
			outputStream = new FileOutputStream("C:/java/output.txt",true);
			
			//3.다시 입력값 쓰기
			System.out.println("파일 내용 입력 : "); String 내용3 = scan.next();
			outputStream.write(내용3,getBytes());
				
			//5. file 읽어오기
				FileInputStream fileInputStream = new FileInputStream("C:/java/output.txt");
				byte[] 바이트배열 = new byte[1024]; //1kb
			
				fileInputStream.read(바이트배열); 
					//객체명.read(배열); 입력스트림에 있는 바이트 읽어와서 배열에 저장
				System.out.println();
			
			
	}

}
