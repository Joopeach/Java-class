package Day12;

public class ȸ�� {
	
	private String ���̵�;
	private String ��й�ȣ;
	private String ����;
	
	//���ٸ޼ҵ� = > setter
	public void set���̵�(String ���̵� ) {
		// ���̵� �μ��� �޾� ���� Ŭ������ ���̵� ����
		this.���̵� = ���̵�;
	} public void set��й�ȣ(String ��й�ȣ)
	
	//���ٸ޼ҵ� = > getter [���� X ,��ȯ O]
	public String get���̵�() {
		return this.���̵�;
	}
	public String get��й�ȣ() {
		return this.��й�ȣ;
	}
	public String get����() {
		return this.����;
	}
	
	//������, get�޼ҵ�, set�޼ҵ� => �ڵ��ϼ� ���
		// ���콺 ������Ŭ�� =>Source
	
	//�α���
	public static login (String ���̵�, String ��й�ȣ) {
		
		if(���̵�.equals("qwe")) {
			//���� �����
			System.out.println("���̵� �ٸ��ϴ�");
		}
			// ! : ���� ������ : True => False
		if(��й�ȣ.equals("qwe")) {
			System.out.println("��й�ȣ�� �ٸ��ϴ�");
		}
		System.out.println("�α��� ����");
		}

}
