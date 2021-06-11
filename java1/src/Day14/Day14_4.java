package Day14;

import java.util.Properties;

public class Day14_4 {
	
	public static void main(String[] args) {
		
		//이메일 api : 
			// 메일 보내기 프로토콜 [규약] : SMTP
		
		// java에서 메일 보내기 [네이버]
		
		String host = "smtp.naver.com"; //메일 회사 호스트명
		String use = "jinntlove_u"; //본인 아이디 
		String password = "190305hk@cj"; // 본인 비번
		
		Properties properties = new Properties();
		
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", 587); //port:메일회사 smtpport
		properties.put("mail.smtp.auth", "true"); //인증검사
		
		//인증확인
		Session session = Session.getDefaultInstance(properties, new Authenticator() {
			//java mail
			proteced PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication (user,password);
			}
		});
		try {
			//메일 작성
			MimeMessage message = new MimeMassage (session);
			message.setFrom(new InternetAddress(user)); //보내는 사람
			message.addRecipient(Message.RecipientType.TO,new InternetAddress("받는사람 이메일")); //받는사람
			message.setSubject("java에서 메일 보내기"); //메일제목
			message.setText("안녕하세요"); //메일 내용
			
			Transport.send(message); //메일전송
		}
		
		
	}

}
