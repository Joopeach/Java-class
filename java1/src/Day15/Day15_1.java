package Day15;

import java.util.ArrayList;
import java.util.Scanner;

public class Day15_1 {
	
	
	//JRE SystemLibrary ���� jdk��ġ�� �� ��


		
		public static Scanner scanner = new Scanner(System.in);
		public static ArrayList<ȸ��> ȸ����� = new ArrayList<>();
		
		public static void main(String[] args) {
		
		while(true) {
			System.out.println("=====Login=====");
			System.out.println("1.ȸ������ 2.�α��� 3.��й�ȣã�� 4 .���̵�Ұ� ,����");
			System.out.println("3.��й�ȣã��[���̵�,email] 4. ���̵�Ұ�[name,email]");
			int ���� = scanner.nextInt();
			ȸ�� temp = new ȸ��();
			if(���� == 1) { temp.ȸ������();}
			if(���� == 2) {}
			if(���� == 3) {temp.�н�����ã��();}
			
		}
		

	
	}
}
