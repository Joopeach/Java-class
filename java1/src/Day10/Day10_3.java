package Day10;

import java.util.ArrayList;

public class Day10_3 {
	/*
	 * ���� Ŭ�������� ��ӹ޾� 2���� ����Ŭ���� ����
	 * ��1���� ��ü�� �����ϱ�
	 * ��� ���¸� ���� �� �ִ� �ϳ��� ����Ʈ�� ��� ����
	 * 1.���� Ŭ����
	 * 		1.���¹�ȣ , �ݾ�
	 * 		2. ������
	 * 		3. �Ա�, ���
	 * 2.�������� Ŭ����
	 * 		1. �����ڵ�
	 * 		2. ������ super
	 * 		3. �Ա�, ��� [ @Override]
	 * 3.�������� Ŭ����
	 * 		1. �����ڵ�
	 * 		2.������ super
	 * 		3. �Ա�, ��� [ @Override]
	 * 
	 */

	ArrayList<����> ���¸�� = new ArrayList<>();
	
	//1. �Ϲ� ���� ��ü
	���� ����1 = new ����("123",1000);
	//2. �������� ���� ��ü
	�������� ����2 = new ��������("456",2000);
	//3. �������� ���� ��ü
	�������� ����3 = new ��������("789",3000);
	
	//4. �ϳ��� ����Ʈ ��� ��� : ����Ŭ������ ����Ʈ ����
	���¸��.add(����1);
	���¸��.add(����2);
	���¸��.add(����3);
	
	//5. �Ա� ���
	���¸��.get(0).�Ա�(500);
	���¸��.get(1).�Ա�(500);
	���¸��.get(2).�Ա�(500);
	
	���¸��.get(0).���(300);
	���¸��.get(1).���(300);
	���¸��.get(2).���(300);
	
	//6. �ݾ�Ȯ��
	system.out.println(���¸��.get(0).�ݾ�);
	}
	}

	}
	
}