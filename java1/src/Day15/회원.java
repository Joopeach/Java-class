package Day15;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class ȸ�� {
	
	String id;
	String password;
	String name;
	String email;
	String phone;
	public ȸ��() {
		// TODO Auto-generated constructor stub
	}
	
	public ȸ��(String id, String password, String name, String email, String phone) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}
	//ȸ������ �޼ҵ�
	public void ȸ������() {
		
		System.out.println("===== ȸ������ =====");
		System.out.println("���̵� : "); String id = Day15_1.scanner.next();
		System.out.println("�н����� : "); String password = Day15_1.scanner.next();
		System.out.println("�̸� : "); String name = Day15_1.scanner.next();
		System.out.println("�̸��� : "); String email = Day15_1.scanner.next();
		System.out.println("����ó : "); String phone = Day15_1.scanner.next();
		
		//2.��ü �����
		ȸ�� temp = new ȸ��(id, password, name, email, phone);
		//3.��ü�� ����Ʈ�� �����ϱ�
		Day15_1.ȸ�����.add(temp);
		//4.ȸ�����Լ����� ������ ȸ������ ���� ������
		��������(email,"1");
	}
		//passwordã�� �޼ҵ�
	public void �н�����ã��() {
		//1.�Է¹ޱ�
		System.out.println("====== �н�����ã�� ======");
		System.out.println("�̸� : "); String id = Day15_1.scanner.next();
		System.out.println("�̸��� : "); String email = Day15_1.scanner.next();
		//2.�ش� ���̵�� �̸��� ã��
		for(ȸ�� temp : Day15_1.ȸ�����) {
			//for ����ƮȰ�� : ����Ʈ�� ��ü �� ��ŭ �ϳ��� temp ��ü ����
			if(temp.id.equals(id) && temp.email.equals(email)) {
				
				System.out.println("----> email�� �н����� �����߽��ϴ�.");
				return;
			}
		}
		System.out.println("----> ������ ȸ�������� �����ϴ�");
	}
		
	//���̵�ã�� �޼ҵ�
	public void ���̵�ã��() {
		//1. �Է¹ޱ�
		System.out.println("===== ���̵� ã�� =====");
		System.out.println("�̸� : "); String id = Day15_1.scanner.next();
		System.out.println("�̸��� : "); String email = Day15_1.scanner.next();
		//2. �̸��� �̸��� ������ ȸ�� ã�� [��� ȸ�� �˻�]
		for (ȸ�� temp : Day15_1.ȸ�����) {
			if (temp.name.equals(name) && temp.email.equals(email)) {
				
				��������(email, temp.id);
				System.out.println("----> email�� ���̵� �����߽��ϴ�.");
			}
		}
	}
	
	
	public void ��������(String email2) {

		//SMTP : ���� ���� ���� ��������[�Ծ�]
		
		//1. ����
		String host = "smtp.naver.com";   //Naver : smtp.naver.com //Google : smtp.gmail.com
		String user = "idid";
		String password = "pwpw";
		
		Properties properties = new Properties();
		//���� ũ����
		properties.put("mail.smtp.host", properties);
		// .put
		properties.put("mail.smtp.port", 587); //���̹� code : 587
		properties.put("mail.smtp.auth", "true");
		
		// 2. ���� Ȯ��
		Session  session = Session.getDefaultInstance(properties, new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, password);
			}
			
		
		}); 

		// 3. ���� �ۼ�
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(this.email)); // �޴»��]
			
			if( type.equals("1")) {
				message.setSubject(this.name+"�� ���� ȯ���մϴ�"); // ��������
				message.setText("�پ��� �̺�Ʈ ����"); // ���� ����	
			} else {
				message.setSubject("ȸ������ �н�����"); // �������� 
				message.setText("ȸ������ �н����� : "+ re); //���� ����
			}
			
			//���� ����
			Transport.send(message);
		}
		catch (Exception e) {}
			
		
		
	}

}
