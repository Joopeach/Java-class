package Day14;

import java.util.Scanner;

public class Day14_3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� ���� : "); int �˻����� = scanner.nextInt();
		System.out.println("���� �� : "); int �˻��� = scanner.nextInt();
		System.out.println("�� ���� : "); int ������ = scanner.nextInt();
		System.out.println("�� �� : "); int ���� = scanner.nextInt();
		
		int ���۴� = 1;
		int �������� = 12;
		
		
		if( �˻����� >������) System.out.println("�˻��Ұ�");
		else if( �˻��� == ����) {
			if (�˻���>����) System.out.println("�˻��Ұ�");
		}
		
		for(int y = �˻�����; y<=������;y++) {
			//�˻����� ���� �� �������� ������ 1�� ����
			
//			//���࿡ ���翬�� �� ������ ������ ���
//			if(������ == y) ���۴�=���ۿ�;
//			
//			if(���ۿ���==y) ���۴�=���ۿ�;
//			else ���۴� = 1;
			
			//Y�� �˻����� ���� �� �������� ������ 1�� ����
			
			//Y�� �������� �������� �ش翬���� ���������� ���
			if(������ == y) ��������=����;
			
			//Y�� ���ۿ����� ������ ��� ���۴� ���� ���
			if(�˻�����==y)���۴�= �˻���;
			else ���۴� = 1;
			
			
			for(int m= ���۴�; m<=��������;m++) {
				
				Day14_2.�޷°˻�(y,m); //�޼ҵ� ȣ��
			}
		}
	}

}
