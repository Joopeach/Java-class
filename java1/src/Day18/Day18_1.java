package Day18;

import java.util.Scanner;

public class Day18_1 {
	
	
	
	
	public static void main(String[] args) throws Exception {  // main���� ������ object�� ��
		
	// ����ó��
		// try{ } catch (����Ŭ���� ��ü��{}
		// try { } : ���ܹ߻� ����� ��
		// catch( ) { } : ���ܹ߻��� �ڵ�
		// finally { } : ���� ������� ó���ڵ�
		
		
	try {
		Scanner scanner = new Scanner (System.in);
		int ���� = scanner.nextInt();
	}
	catch (Exception e) {
		System.out.println("���ڸ� �Է� ����");
	}
	
	//���� ������ throw�� �Ϸο�
		// ����޼ҵ��() throws ����Ŭ������ { }
	
	
	try {
		�޼ҵ�();
	} catch (Exception e) {
		System.out.println("�ش� Ŭ������ ã�� ���߽��ϴ�");
	} finally {
		//���� �� ���þ��� ������ ó��
		System.out.println("�޼ҵ� ������ ��� ");
	} // finally ��
		
	} // main ��
	
	//
	public static void �޼ҵ�() throws Exception {
		                    
		Class<?> Ŭ����ã�� = Class.forName("���ڿ�.class");
						// forname(ã�����ϴ� Ŭ������);
							// Ȥ�ó� Ŭ������ ���� ��쿡 ���� ����ó��
	}
	
	
	
	
	

}
