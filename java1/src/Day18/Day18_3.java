package Day18;

import java.awt.Toolkit;

public class Day18_3 {
	
	public static void main(String[] args) {
		
		
		// ��Ʈ [0,1] ====> �ڵ�[java,c��] => ���α׷�
		// ������ : �ڵ带 �о��ִ� ��Ȱ
			//main�޼ҵ忡 : main ������ ����
		// ��Ƽ������ : ���� �ڵ���� ���� ó��
			// �ڵ� ����ó��
				// ��ǻ�� ���� => ����ó�� X => ������� ó��
		
			// 1. implements Runnable => run�޼ҵ� @Override
			// 2. extends Thread -> run �޼ҵ� @Override
			// 3. new Thread(new Runnable() { run �޼ҵ� @Override }
			
		// ��Ƽ ������ ����
		// 1. �������.start() : start() => �ش� ������ run
		
		
		// ����1) ���� ������  (���±��� ���͵� ��� ���Ͻ�����)
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for (int i = 0; i<5; i++) {
			
			toolkit.beep(); //������ �Ҹ� 
		} try {
			Thread.sleep(1000); //������ �Ͻ�����
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	
	for (int i = 0; i<5; i++ ) {
		System.out.println("��");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
		// ���� 2) ��Ƽ ������
		Runnable �Ҹ� = new �Ҹ�������();
		Thread ��Ƽ������1 = new Thread(�Ҹ�);
		
		��Ƽ������1.start(); // => �ش� ������ run �޼ҵ� ȣ��
		
		for (int i = 0; i<5; i++) {
			System.out.println("��");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		} 
		
		// ����3)
		Thread ��Ƽ������2 = new Thread(new  Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i=0; i<5; i++) {
					
				}
				
			}
		});
		
		// ���� 4)
		Thread ��Ƽ������3 = new Thread( new Runnable() {
			
			@Override
			public void run() {
				
				
			}
		}  ); 
		
		
	}
}
