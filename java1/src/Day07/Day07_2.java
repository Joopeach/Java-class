package Day07;

import java.util.Scanner;

public class Day07_2 {
	
	public static void main(String[] args) {
		
		//ȸ���� ���α׷� [ȸ������, �α���]
		//1. 2���� �迭 [�ִ�100��]
		//2. �޴� [���ѷ���]
			//1. ȸ������
				//1. ���̵�� ��й�ȣ �Է¹޾� �迭�� ����
			//2. �α���
				//1. ���̵�� ��й�ȣ �Է¹޾� �迭�� �����ϸ� �α��� ����
			//3. ����
				//�ݺ��� ����
		
		Scanner scan = new Scanner(System.in);
		//�Է°��� ���� => ���� => ������ ���� ���� => �迭
		String[][] ȸ����� = new String[100][2];
		
		while(true) {
			
			System.out.println("===ȸ���� ���α׷�===");
			System.out.println("1. ȸ������ 2. �α��� 3. ����"); int ���� = scan.nextInt();
			if (���� == 1) {
				System.out.println("--->ȸ������ ����");
				System.out.println("���̵� : "); String ���̵� = scan.next();
				System.out.println("��й�ȣ : "); String ��й�ȣ = scan.next();
				
				int ����ġ = 0;
				// �̹� �����ϴ� ���̵� ������ �ߺ�����
				for ( int i =0; i<ȸ�����.length;i++ ) {
					
					if(ȸ�����[i][0].equals(���̵�)) {
						System.out.println("--> �̹� �����ϴ� ���̵� �Դϴ�.");
						����ġ =1;
						break;
					}
				}

				if(����ġ == 1) {
				//�Է¹��� ���� ���� => �迭�� ���[null]�� ����
					for (int i =0; i <ȸ�����.length;i++) {
				
						if(ȸ�����[i][0] == null) { //�ش� ���� null�̸�
							ȸ�����[i][0] = ���̵�; //ù��° ���� ���̵� �ֱ�
							ȸ�����[i][1] = ��й�ȣ; //�ι�° ���� ��й�ȣ �ֱ�
							System.out.println("---> ȸ������ �Ϸ�");
							break; // !!!! : ȸ������ ���������� for�� ����
						} //if ��
					} // for�� ��
					} // ū if�� ��
			}
			
			if ( ���� == 2) { // �α��� : �Է°��� ������[�迭]�� ��
				
			System.out.println("--->login ����");
			System.out.println("�α��� ���̵� : "); String ���̵� = scan.next();
			System.out.println("�α��� �н����� : "); String ��й�ȣ = scan.next();
			
			//�Է°��� �迭�� ��
			for (int i=0; i<ȸ�����.length;i++) {
				
				if (ȸ�����[i][0] !=null) { // �࿡ ȸ���� ������ ��쿡�� �˻�
				
				if (ȸ�����[i][0].equals(���̵�) && ȸ�����[i][1].equals(��й�ȣ)) {
					System.out.println("--->�α��� ����");
					
					//��� ȸ�� ���̵� /��й�ȣ ���
					System.out.println(" === ȸ����� === ");
					System.out.println(" ���̵� \t\t ��й�ȣ");
					for (int j = 0; i<ȸ�����.length; i++) {
						System.out.println(ȸ�����[i][0]+"\t\t"+ȸ�����[i][1]);
					}
					
					while(true) {
						System.out.println("1. ȸ��Ż�� 2.�α׾ƿ�"); int ����2 = scan.nextInt();
						if(����2==1) {
							
						//ȸ��Ż�� +> �迭���� �����͸� null�� ����
						ȸ�����[i][0]=null; // ���� �α��� �� ���� ���̵� = [i] [0]
						ȸ�����[i][1]=null; // ���� �α��� �� ���� ��й�ȣ = [i] [1]
						
						//Ż���� ȸ�� ���� ȸ���� ��ĭ�� ����
						for(int h = i; h<ȸ�����.length;h++) {
							
							if(ȸ�����[h+1][0] !=null) {//���� ȸ���� null�� �ƴϸ�
							   ȸ�����[h][0] = ȸ�����[h+1][0];
							   ȸ�����[h][1] = ȸ�����[h+1][0];
							 } else {
							   ȸ�����[h][0] = null; //������ ȸ�� �̵��� ������ ȸ�� null�� ����
							   ȸ�����[h][1] = null; //������ ȸ�� �̵��� ������ ȸ�� null�� ����
							   break;
							 }
						}
						System.out.println("--->ȸ�� Ż�� ����");
						break;
						}
						
						if(����2==2) {System.out.println("----> �α׾ƿ�"); break;
					}
					
					break;
					}
					}
				}
			
			if (���� == 3) {System.out.println("---> �̿����ּż� �����մϴ�"); break;
			}
			}

			
