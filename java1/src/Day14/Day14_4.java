package Day14;

import java.util.Properties;

public class Day14_4 {
	
	public static void main(String[] args) {
		
		//�̸��� api : 
			// ���� ������ �������� [�Ծ�] : SMTP
		
		// java���� ���� ������ [���̹�]
		
		String host = "smtp.naver.com"; //���� ȸ�� ȣ��Ʈ��
		String use = "jinntlove_u"; //���� ���̵� 
		String password = "190305hk@cj"; // ���� ���
		
		Properties properties = new Properties();
		
		properties.put("mail.smtp.host", host);
		properties.put("mail.smtp.port", 587); //port:����ȸ�� smtpport
		properties.put("mail.smtp.auth", "true"); //�����˻�
		
		//����Ȯ��
		Session session = Session.getDefaultInstance(properties, new Authenticator() {
			//java mail
			proteced PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication (user,password);
			}
		});
		try {
			//���� �ۼ�
			MimeMessage message = new MimeMassage (session);
			message.setFrom(new InternetAddress(user)); //������ ���
			message.addRecipient(Message.RecipientType.TO,new InternetAddress("�޴»�� �̸���")); //�޴»��
			message.setSubject("java���� ���� ������"); //��������
			message.setText("�ȳ��ϼ���"); //���� ����
			
			Transport.send(message); //��������
		}
		
		
	}

}
