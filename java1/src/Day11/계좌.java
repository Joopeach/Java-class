package Day11;

public class ���� implements ATM {
	
	//�ʵ�
	String ���¹�ȣ; //�ĺ���
	String �ݾ�;
	public ����() {
		// TODO Auto-generated constructor stub
	}
	//������
	public ����(String ���¹�ȣ, String �ݾ�) {
		this.���¹�ȣ = ���¹�ȣ;
		this.�ݾ� = �ݾ�;
	}
	@Override
	public void �޴�() {
		
	}
	
	@Override
	public void ���µ��() {
		System.out.println("----> ���µ��");
		System.out.println("���¹�ȣ : ");
	}
	@Override
	public void ����() {
		System.out.println("----> ����");
		
		
		
	}
	@Override
	public void ���() {
		System.out.println("----> ���");
		int result = ����ã��(); //�޼ҵ� ��ȯ
		if(result == -1) return;
		else {
			System.out.println("-----> ��� �� �ݾ� : ");
			int �ݾ� = Day11_3.scan.nextInt();
			//���� : ���ݺ��� �� ū �ݾ��� ��� X
			if(Day11_3.���¸��.get(result).�ݾ�<�ݾ�) {
				System.out.println("---->���ݾ��� �����մϴ�");
				return i;
			}
			Day11_3.���¸��.get(result).�ݾ� -= �ݾ�;
			System.out.println("----> ��ݼ���");
		} // else��
	}
	@Override
	public void �ܰ�() {
		System.out.println("----> �ܰ�");
		int result = ����ã��(); // �޼ҵ� ��ȯ
		if(result == -1) return;
		else {
			System.out.println("---->���� �ܰ� :  " + Day11_3.���¸��.get(result).�ݾ�());
		}
	}

	}

	@Override
	public int ���¹�ȣ() {
		
		
		return 0;
	}
	@Override
	public int ����ã��() {
		System.out.println("���¹�ȣ : ");
		String ���¹�ȣ = Day11_3.scan.next();
		//forȰ��=> ����Ʈfor��
		for(int i = 0; i<Day11_3.���¸��.size();i++) {
			���� temp = Day11_3.���¸��.get(i);
			if (temp.���¹�ȣ.equals(���¹�ȣ) ) {
				return i; // ��ȯ���� 0 �̻��̸� ���¹�ȣ ã�� ����
			}
		}
		System.out.println("----> ������ ���¹�ȣ�� �����ϴ�");
		return -1; //��ȯ���� -1�̸� ã�� ����
	}
	

}
