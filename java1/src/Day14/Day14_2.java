package Day14;

import java.util.Calendar;
import java.util.Scanner;

public class Day14_2 {
	
	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�˻� ���� : "); int year = scanner.nextInt();
		System.out.println("�˻� �� : "); int smonth = scanner.nextInt();
		�޷°˻�(syear,smonth); //�޼ҵ� ȣ��
		
		//���� ��¥�� �޷�
		Calendar calendar = Calendar.getInstance(); // 1.���� �޷� ��������
		int today = calendar.get(calendar.DAY_OF_MONTH); // 2. ���� ��¥�� �ϼ�
		int year = calendar.get(calendar.YEAR); // 3. ���� ��¥�� ����
		int month = calendar.get(calendar.MONTH)+1; // 4. ���� ��¥�� �� +1 [1��:0~]
		
		calendar.set(year, month-1,1); // 5. ���� ��¥�� 1��
		int sDay = calendar.get(Calendar.DAY_OF_WEEK); // 6. ���� ����
		int eDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); // 7. ���� ����
		
		
		
		// �޷� ���
		System.out.println("========== " + year +"��" + month + "��===================");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		System.out.println("=============================");
		
			int ssDay = sDay; //���� ���� [����ϸ��� �ٹٲ�]
			
		// �� ���� 1���� ��ġ �ձ��� ���� ä���
			for(int i=1;i<eDay;i++) {
				
				if (i == today) System.err.print(i+"\t");
				else System.out.print(i+"\t");
				
				//�ٹٲ�
				if(ssDay%7 == 0) System.out.println(); //�ٹٲ�
				ssDay++; //��������
				
		// �������
			for(int i = 1; i<=eDay;i++);
				if(i == today) System.out.print("["+i+"]"+"\t");
				System.out.print(i+"\t");
				
				//�ٹٲ�
				System.out.println(); //�ٹٲ�
				
				
			}
		
	}

}
