package Day17;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day17_1 {
	
	public static void main(String[] args) {
		
			// �÷��� �����ӿ�ũ : �ڷᱸ�� [������ ���� ����]  STack,�� Queue ������ �� �Ȥ���.
			// Stack Ŭ����
				//ex) : ctrl + z �ǵ�����
				//�Ա�/�ⱸ ���� => ���� ���߿� ���� ���޸𸮰� ���� ���� ����
				// .push( ��ü ) == add(��ü)

			// Queue Ŭ����
				//ex) : �ټ����
				//�Ա�/�ⱸ ���� => ���� ���� ���� �޸𸮰� ���� ���� ����
		
			Stack < ���� > �������� = new Stack<>();
				// <  > : ���׸�
			��������.add( new ����(100) );
			��������.add( new ����(200) );
			��������.add( new ����(300) );
			System.out.println("���������� ������ : " + ��������.size());
			
			
			for( ���� temp : ��������) {
				System.out.println("���� �ݾ� : "+temp.����);
			}
			
			while( ��������.isEmpty()) { // ! isEmpty ��������� ���� ����
				���� temp = ��������.pop();  //stack���� ������ pop
				System.out.println(" ���� ���� : " + temp.����);
			}
			
			Queue<����> ��������2 = new LinkedList<>();  //�������̽��� ȥ�� �Ұ��� Ŭ�������
			
			��������2.offer( new ����(100));
			��������2.offer( new ����(200));
			��������2.offer( new ����(300));
			
			System.out.println("�������� : " + ��������2.size());
			
			for(���� temp : ��������2) {
				System.out.println("���� �ݾ� : "+temp.����);
			}
			
			while( ! ��������2.isEmpty()) {
				���� temp = ��������2.poll(); //queue���� ������ poll
				System.out.println("���� �ݾ� : "+ temp.����);
			}
			
				
	}

}
