package Day15;

import java.util.ArrayList;
import java.util.List;

public class Day15_2 {

	public static void main(String[] args) {
		
		//�÷��� �����ӿ�ũ �� �޸� ���� Ŭ���� ����
			//�÷��� : ����
			//�����ӿ�ũ : �̸� ������� ���α׷�
		//1.List �÷���
			//1. ArrayList, 2. Vector , 3. LinkedList
				//1. �迭�� ������ : �迭[�����޸�] / list[�����޸�]
					// �迭 : int[] �迭�� = new int[0]
				//2. �ε��� ��� : ����Ǵ� ���� [0������ ����]
				//3. �߰�, ������ : �ε��� �ڵ� ����
				//4. ���� ���Ǵ� �޼ҵ�
					//1. ����Ʈ��.add("��ü��")
					//2. ����Ʈ��.get(�ε�����ȣ)
					//3. ����Ʈ��.remove(�ε�����ȣ)
					//4. ����Ʈ��.size()
					//5. ����Ʈ��.clear
				//5. ArrayList vs Vector : 
			
		// ex1) ArrayList Ŭ����
			//1. ����
			List<String> list = new ArrayList<>();
			ArrayList <String> list = new ArrayList<>();
			//�������̽�/Ŭ������ <����Ʈ�� ���� Ŭ������> ����Ʈ�� = new ArrayList<��������>();
			
		//2. �޼ҵ�
			list.add("java"); //����Ʈ�� ��ü �ֱ�
			list.add("123"); //add�ϰ���� Ŭ������ �ִ´�  //����Ʈ�� ����� Ŭ������ �ֱ� ����
			list.add("python");
			list.add("database");
			list.add("c++");  //list�� �߰��Ҷ��� add�� ����Ѵ�. - �ܿ�
			
			
			//2. ����Ʈ�� ��ü ȣ���ϱ�
			System.out.println(list.get(0));
			
			//3. ����Ʈ �����ϱ�
			list.remove(0);
			System.out.println(list.get(0));
			
			//4. ����Ʈ�� ��ü��
			System.out.println(list.size());
			
			//5. �ݺ��� Ȱ��1
			for(int i = 0; i<list.size();i++) {
				System.err.println(list.get(i));
			}
			
			//6. �ݺ��� Ȱ��2
			for(String temp : list) {
				System.out.println(temp);
			}
			
			//7. ��ü ��� ����
			list.clear(); //��ΰ� ������ ��.
			
		
		
		//2. Set �÷���
		//3. Map
		
	}
}
