package Day08;

import java.util.ArrayList;
import java.util.Scanner;

public class Day08_2 {
	
	//List
	public static ArrayList< �Խ��� > �Խ��Ǹ�� = new ArrayList<>();
	
		//main �ۿ��� �����ϱ� => main �ۿ����� ����ϱ� ���ؼ�
	public static Scanner scan = new Scanner(System.in);
		// static : main �����尡 �ڵ� �о��ִµ� main �ۿ� ������ ������
			// => static : static ����� ������ ������ �ڵ� ����� ���� �޸� �Ҵ�
	
	public static void main(String[] args) {
		// �Խ��� Ŭ����
			// 1. �ʵ� : ����
				// 1. �Խù���ȣ, �Խù�����, �Խù�����, �Խù��ۼ���, ��ȸ�� ��
			// 2. ������[�ʼ�X]
				// 1. �������, Ư���ʵ常 �޴� ������, ����ʵ带 �޴� ������
			// 3. �޼ҵ� : �ൿ [�����ڵ�]
				// 1. �Խù����, �Խù�����, �Խù���ȸ������
	while(true) {
		System.out.println("==== �Խ��� Ŀ�´�Ƽ ====");
		
		// ��� �Խ��� ���
			System.out.println("��ȣ\t����\t�ۼ���\t��ȸ��");
			// �ݺ����� �̿��� ����Ʈ�� ��ü ��� ������
			for (int i = 0; i<�Խù����.size(); i++) {
				
			}
			
		System.out.println("1.���"); int ���� = scan.nextInt();
		if ( ���� = 1 ) {
			�Խ��� temp = new �Խ���();
			temp.�Խù����();
		}
		if ( ���� = 2) {
			System.out.println("--> �Խù���ȣ : "); int ��ȣ = s
			�Խ��� temp = new �Խ���();
			temp.�Խù�����(��ȣ);
		}
	}
		
	}

}


//itdanja@kakao.com
//����1 : ȸ���� �Խ���
//		1. ȸ�� Ŭ���� => ��ü => ȸ����� ����Ʈ
//			ȸ�� �ʵ� : ���̵�, ��й�ȣ, �̸�, ����ó
//			ȸ�� ������ : ����
//			ȸ�� �޼ҵ� : ȸ������, �α���, ȸ��Ź����, ȸ������
//		2. �Խ��� Ŭ���� => ��ü => �Խù���� ����Ʈ
//			�Խ��� �ʵ� : ��ȣ, ����, ����, �ۼ���[�α��εȾ��̵�], �ۼ���, ��ȸ��
//			�Խ��� ������ : ����
//			�Խ��� �޼ҵ� : �۾���, �����, �ۻ󼼺��� , �ۻ���, �ۼ���
//		3. ���α׷� Ŭ���� [main �޼ҵ�]
//				1. �޴� ����
//					1. ȸ������ [���̵� �ߺ�����]
//					2. �α���
//					3. ����
//				2. �α��� ������ �޴�	
//					- ��� �Խù��� Ŀ�´�Ƽ ���
//					1. ȸ�����
//					2. �۾���
//					3. �ۺ���
//				3. �ۺ��� ������
//					1. �α����� ���̵�� �� �ۼ��ڿ� ������ ��쿡�� �ۻ���, �ۼ���