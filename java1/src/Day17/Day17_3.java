package Day17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Day17_3 {
	
	
	public static Queue< String > ������ = new LinkedList<String>();
	public static Queue< String > ��꿪 = new LinkedList<String>();
	public static Queue< String > ���￪ = new LinkedList<String>();
	public static Queue< String > ���ο� = new LinkedList<String>();
	
	public static ArrayList<Queue<String>> ��ö��Ȳ = new ArrayList<>();

	
	//main �ۿ��� �����ϸ� main���� ��� ��밡��
	
	
	public static void main(String[] args) {
		
		// Queue
			// 1. ��ö �о��
			// 2. �� : ������ -> ��� -> ���� -> ����
			// 3. ������ : ��ö 3���� ��ü
			// 4. 3�ʸ��� �ϳ��� �� �̵�
		
		��ö��Ȳ.add(������); ��ö��Ȳ.add(��꿪); ��ö��Ȳ.add(���￪); ��ö��Ȳ.add(���ο�);
		
		��ö��Ȳ.get(0).offer("��ö1");
		��ö��Ȳ.get(0).offer("��ö2");
		��ö��Ȳ.get(0).offer("��ö3");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("=======���� ��ö�� ��Ȳ=======");
			��ö����Ȳ();
			System.out.println("��ö ��� ��ȣ: 1. ������ 2.��꿪 3.���￪ 4.���ο�");
			int ���� = Scanner.nextInt;
		}

//		Queue< String > ������ = new LinkedList<String>();
//		Queue< String > ��꿪 = new LinkedList<String>();
//		Queue< String > ���￪ = new LinkedList<String>();
//		Queue< String > ���ο� = new LinkedList<String>();
//		
//		ArrayList<Queue<String>> ��ö��Ȳ = new ArrayList<>();
		
		��ö��Ȳ.get(0).offer("��ö1");
		��ö��Ȳ.get(0).offer("��ö2");
		��ö��Ȳ.get(0).offer("��ö3");
		
		System.out.println("���� �������� ��ö ��: " + ��ö��Ȳ.get(0));
		
		
		public static void ���������()
		try {
			System.out.println(" 3�� �� ~~~~~~");
			Thread.sleep(3000); // �и��� �ð� ����
				��ö��Ȳ.get(1).offer(��ö��Ȳ.get(0).poll());
				String temp = ��ö��Ȳ.get(0).poll();
				��ö��Ȳ.get(1).offer(temp);
				
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("���� �������� ��ö �� : ");
		System.out.println("���� ��꿪 ��ö ��: ");
				
	} // ���� �޼ҵ� ��

	//��ö�� ��Ȳ �޼ҵ�
		public static void ��ö����Ȳ() {
			try {
			System.out.println("���� �������� ��ö �� : ");
			Thread.sleep(3000); // �и��� �ð� ����
				String temp = ��ö��Ȳ.get(3).poll();
				��ö��Ȳ.get(0).offer(temp);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	
}

	
