package Day13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Day13_1 {
	
	public static void main(String[] args) throws Exception {
		
		//�޸� : ������ ���� [���α׷� ����� �ʱ�ȭ]
			// ���� ���� : ����, DB, Ŭ���� ��
		
		//2����[0,1] : 1��Ʈ => 8��Ʈ => 1����Ʈ =>
		//��Ʈ���̶�?
			//: 
		
		//file
			//1.���ϻ���
			FileOutputStream outputStream = new FileOutputStream("C:/java/ouput.txt");
			//�������Ŭ����		��üŬ����			new[�޸��Ҵ翬����] ������("��θ�/���ϸ�/Ȯ���ڸ� )
		
			//2.���Ͼ���
			String ���� = "java�Դϴ�";
			outputStream.write(null);
			//��ü��.write(����Ʈ����)
				//String.getBytes() : ���ڿ� => ����Ʈ���� ����ȯ
		
			//3.�Է°� ����
			Scanner scan = new Scanner(System.in);
			System.out.println("���� ���� �Է� : "); String ����2 = scan.next();
			outputStream.write(����2.getBytes());
		
		
			//4. ���� ���� �߰� [���� ���Ͽ� ���� �߰� (true)]
			outputStream = new FileOutputStream("C:/java/output.txt",true);
			
			//3.�ٽ� �Է°� ����
			System.out.println("���� ���� �Է� : "); String ����3 = scan.next();
			outputStream.write(����3,getBytes());
				
			//5. file �о����
				FileInputStream fileInputStream = new FileInputStream("C:/java/output.txt");
				byte[] ����Ʈ�迭 = new byte[1024]; //1kb
			
				fileInputStream.read(����Ʈ�迭); 
					//��ü��.read(�迭); �Է½�Ʈ���� �ִ� ����Ʈ �о�ͼ� �迭�� ����
				System.out.println();
			
			
	}

}
