package Day08;

import java.util.Scanner;

public class �Խ��� {
	Scanner scan = new Scanner(System.in);
	
	// �ʵ�
	int ��ȣ;
	String ����;
	String ����;
	String �ۼ���;
	int ��ȸ��;
	
	// ������ : �������� �̸��� Ŭ������� �����ϰ� ����
	// 1. �������
	public �Խ���() {
		// TODO Auto-generated constructor stub
	}
	
	// ��� �ʵ带 �޴� ������
	public �Խ���(int ��ȣ, String ����, String �ۼ���, int ��ȸ��) {
		this.��ȣ = ��ȣ; // �μ��� ���� ��ȣ�� ����Ŭ������ ��ȣ�� �־��ֱ�
		this.���� = ����;
		this.���� = ����;
		this.�ۼ��� = �ۼ���;
		this.��ȸ�� = ��ȸ��;
	}
	
	//�޼ҵ�
		//1. �Խù����
		public void �Խù����() {
			System.out.println("----> �Խù� ���");
			System.out.println("���� : "); String ���� = scan.next();
			System.out.println("���� : "); String ���� = scan.next();
			System.out.println("�ۼ��� : "); String �ۼ��� = scan.next();
			
			//��ü ���� : �Է°��� �������� �μ��� �־��ֱ�
				// �Խù� ��ȣ : ����Ʈ�� ����� ��ü���� +1
			�Խ��� temp = new �Խ��� ( 1, ����, ����, �ۼ���, 0);
			// ���� �Խù� �������ִ� ����Ʈ�� ����
			Day08_2.�Խù����.add(temp);
		}
		//2. �Խù����
		public void �Խù����() {
			System.out.println(this.��ȣ+"\t"+this.����+"\t"+this.��ȸ��);
		}
		//2. �Խù�����
		public void �Խù�����(int ��ȣ) { // int ���� ������ int�� �ޱ�
			
			System.out.println("----> ����");
		}
		//3. �Խù���ȸ�� ����
		public void �Խù���ȸ��() {
			this.��ȸ�� = 
			
		}
		
		//4. �ش� �Խù� �󼼺���
		public void �Խù�����(int ��ȣ) {
						//�μ��ޱ�
			
			System.out.println("----> �Խù� ��������");
			System.out.println(" ���� :" + temp.���� +"��ȸ�� : " + temp.��ȸ��);
			System.out.println("����" + temp.����);
		}
	
}
