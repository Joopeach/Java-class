package Day17;

public class Day17_4 {
	
	public static void main(String[] args) {
		
		// ����ó�� : ����(����)�߻� ������ ó�� �ڵ�
			// * �ڵ�� ������ ������ ����ó��
				// if : ���� [����Ǵ� ����] ����
			// 1. ������� �ʴ� ������ ó��
			// 2. ����� ���� ���� ���� ó�� => �ٸ��ڵ� ��ü
			// 3. try {������ �߻��� �� ���� �ڵ�} cathc () {��ü�ڵ�}
			// 4. ���� �߻��ϸ� => ���α׷� ���� /// ���� �߻������� => ����ó�� => ���α׷� ����ȭ

		
		//ex1)
		String[] �迭 = new String[3]; // �迭ũ�� = 3
		try {
			�迭[0] = "java";
			�迭[1] = "java";
			�迭[2] = "java";
			�迭[3] = "java";
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���ܹ߻� : " + e);
		}
		//ex2)
		try {
		String ����1 = "100"; // ����
		String ����2 = "a100"; //����
		
		System.out.println("���ڿ� -> ���ڿ� ��ȯ : " + Integer.parseInt(����1));
		System.out.println("���ڿ� -> ���ڿ� ��ȯ : " + Integer.parseInt(����2));
		}
		catch (Exception e) {
			// TODO: handle exception 
			(NumberFormatException e) {
			System.out.println("���ܹ߻� : " + e);
		}
			
		//ex3)
		try {
			String ����3 = null;
			System.out.println("����3�̤� ���� " + ����3.toString() );
		} catch
		
	}

}
