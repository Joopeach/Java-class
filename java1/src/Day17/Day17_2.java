package Day17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Day17_2 {

	public static void main(String[] args) {
		
		//���Ǳ�� ��� Stack ���� �� �տ��Ű� ���ͼ�.
		
		//���Ǳ� : stack���� : 3�� ��ǰ
			// 1. �ݶ� ����[200] 2. ���̴ٽ���[300] 3.ȯŸ����[400]
			// 2. ���� [ scanner ] �Է¹ޱ�
			// 3. ��ǰ �����ؼ� ��ǰ ����ϰ� ��ǰ ����
			// 4. �ݾ׺����ϸ� ����X ��ǰ���� X
			// 5. �ܵ� ���
		
		Stack<String> �ݶ� = new Stack<>();
		Stack<String> ���̴� = new Stack<>();
		Stack<String> ȯŸ = new Stack<>();
		// Stack ��ü => List
		List<Stack<String>> ��ǰ��� = new ArrayList<>();
		��ǰ���.add(�ݶ�);
		��ǰ���.add(���̴�);
		��ǰ���.add(ȯŸ);
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i<10; i++) {
			��ǰ���.get(0).push("�ݶ�");
			��ǰ���.get(1).push("���̴�");
			��ǰ���.get(2).push("ȯŸ");
		}
		
		while(true) { //���Ǳ� �ݺ���
			System.out.println("�ݾ� : " ); int �ݾ� = scanner.nextInt();
			
			while(true) { //��ǰ���� �ݺ���
				
				System.out.println("���� ���� �ݾ� : " + �ݾ�);
				
				if(�ݶ�.isEmpty()) {
					System.out.println("1. �ݶ�[���� : 200 ��� : ����]");
				} else {
					System.out.println("1. �ݶ�[���� : 200 ��� : " + ��ǰ���.get(0).size()+"]");
				}
				
				int ���� = scanner.nextInt();
				if ( ���� == 1 ) {
					//�ݾ׺��� ����
					if(�ݾ� < 200) {System.out.println("�ݾ��� �����մϴ�.");}
					//������ ����
					else if(�ݶ�.isEmpty() ) {System.out.println("��� �����ϴ�.");}
					//������
					else { System.out.println("�ݶ� ��ȯ");
					�ݶ�.get(0).pop();
					�ݾ� -= 200;
					}
				}	
				
				if ( ���� == 2 ) {
					if(�ݾ� < 300) {System.out.println("�ݾ��� �����մϴ�.");}
					//������ ����
					else if(�ݶ�.isEmpty() ) {System.out.println("��� �����ϴ�.");}
					//������
					else { System.out.println("�ݶ� ��ȯ");
					�ݶ�.get(1).pop();
					�ݾ� -= 300;
					}
				}
				System.out.println("2. ���̴�[���� : 300 ��� :]");
				System.out.println("3. ȯŸ[���� : 400 ��� :]");
				System.out.println("4. �ݾ׹�ȯ");
				int ���� = scanner.nextInt();
				if ( ���� == 1 ) {
					System.out.println("�ݶ� ��ȯ");
					�ݶ�.pop();
					�ݾ� -= 200;
				}
				}

				if ( ���� == 3 ) {}
				if ( ���� == 4 ) {}
				
				
			}
		
		
	}
}
