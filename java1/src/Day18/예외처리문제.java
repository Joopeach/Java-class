package Day18;

import java.util.Scanner;

public class ����ó������ {
	
	//�迭 ����
	public static int[] ����� = new int[10];
	
	public static void main(String[] args) {
		
		System.out.println("====���α׷� ����====");
		Start();
		System.out.println("====���α׷� ����====");
	}
		
//		int[] ����� = new int[10];
		
		
		public static void Start() {
		while(true) {
			Scanner scanner = new Scanner (System.in); //����ó�� :  scanner�� �ִ� ���ڸ� �ٽ�
			System.out.println("====�����====");
			
			// ����� ���
			for (int i =0; i<�����, i++) {
				if(�����[0] ==0 ) { System.out.println("----> ���� ����� �����ϴ�"); }
				else {
				}
			}
			
			System.out.print("1.����߰� 2.��ܻ���");
			System.out.print("���� ====");
			int ���� = 0;
			
			try {
				���� = scanner.nextInt(); //���ܹ߻� => ���� : scanner ���ڰ� �Է��������
			}
			catch (Exception e) {
				System.out.println("----> ���ڸ� �����մϴ� [�����ڿ��� ����");
			}
			
			if (���� == 1) { 
				for (int i = 0; i<10; i++) {
					if(�����[i] == 0) {
						System.out.println("�ο��� �Է� : ");
						�����[i] = scanner.nextInt();
						System.out.println("����ȣ : " + (i+1));
						break;
					} else {
						System.out.println("----> ����� ���� [��ٷ��ּ���]");
					}
				}
			}
			if (���� == 2) {
				for( int i = 0; i<10; i++) {
					
					//��ĭ�� ����
					�����[i] = �����[i+1];
				}
			}
			if (���� == 3 ) {
				
			}
			
			}
			
	} 	catch (Exception e) {
		System.out.println("----> [�����ڿ��� ����]");
	}

}
