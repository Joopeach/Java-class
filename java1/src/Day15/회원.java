package Day15;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class 회원 {
	
	String id;
	String password;
	String name;
	String email;
	String phone;
	public 회원() {
		// TODO Auto-generated constructor stub
	}
	
	public 회원(String id, String password, String name, String email, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	//회원가입 메소드
	public void 회원가입() {
		
		System.out.println("===== 회원가입 =====");
		System.out.println("아이디 : "); String id = Day15_1.scanner.next();
		System.out.println("패스워드 : "); String password = Day15_1.scanner.next();
		System.out.println("이름 : "); String name = Day15_1.scanner.next();
		System.out.println("이메일 : "); String email = Day15_1.scanner.next();
		System.out.println("연락처 : "); String phone = Day15_1.scanner.next();
		
		//2.객체 만들기
		회원 temp = new 회원(id, password, name, email, phone);
		//3.객체를 리스트에 저장하기
		Day15_1.회원목록.add(temp);
		//4.회원가입성공시 성공한 회원에게 메일 보내기
		메일전송(email,"1");
	}
		//password찾기 메소드
	public void 패스워드찾기() {
		//1.입력받기
		System.out.println("====== 패스워드찾기 ======");
		System.out.println("이름 : "); String id = Day15_1.scanner.next();
		System.out.println("이메일 : "); String email = Day15_1.scanner.next();
		//2.해당 아이디와 이메일 찾기
		for(회원 temp : Day15_1.회원목록) {
			//for 리스트활용 : 리스트내 객체 수 만큼 하나씩 temp 객체 대입
			if(temp.id.equals(id) && temp.email.equals(email)) {
				
				System.out.println("----> email로 패스워드 전송했습니다.");
				return;
			}
		}
		System.out.println("----> 동일한 회원정보가 없습니다");
	}
		
	//아이디찾기 메소드
	public void 아이디찾기() {
		//1. 입력받기
		System.out.println("===== 아이디 찾기 =====");
		System.out.println("이름 : "); String id = Day15_1.scanner.next();
		System.out.println("이메일 : "); String email = Day15_1.scanner.next();
		//2. 이름과 이메일 동일한 회원 찾기 [모든 회원 검사]
		for (회원 temp : Day15_1.회원목록) {
			if (temp.name.equals(name) && temp.email.equals(email)) {
				
				메일전송(email, temp.id);
				System.out.println("----> email로 아이디 전송했습니다.");
			}
		}
	}
	
	
	public void 메일전송(String email2) {

		//SMTP : 간이 우편 전송 프로토콜[규약]
		
		//1. 설정
		String host = "smtp.naver.com";   //Naver : smtp.naver.com //Google : smtp.gmail.com
		String user = "idid";
		String password = "pwpw";
		
		Properties properties = new Properties();
		//설정 크래스
		properties.put("mail.smtp.host", properties);
		// .put
		properties.put("mail.smtp.port", 587); //네이버 code : 587
		properties.put("mail.smtp.auth", "true");
		
		// 2. 인증 확인
		Session  session = Session.getDefaultInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
			}
			
		
		}); 

		// 3. 메일 작성
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(this.email)); // 받는사람]
			
			if( type.equals("1")) {
				message.setSubject(this.name+"님 가입 환영합니다"); // 메일제목
				message.setText("다양한 이벤트 제공"); // 메일 내용	
			} else {
				message.setSubject("회원님의 패스워드"); // 메일제목 
				message.setText("회원님의 패스워드 : "+ re); //메일 내용
			}
			
			//메일 전송
			Transport.send(message);
		}
		catch (Exception e) {}
			
		
		
	}

}
