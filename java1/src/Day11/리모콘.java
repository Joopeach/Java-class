package Day11;

public interface ������ {
	
	//�ʵ�
	int �ִ���� = 10;
	int �ּҼ��� = 0;
	
	//�߻�޼ҵ� : ����
	public void ����();
	public void ����();
	public void ��������();
	
	//����Ʈ�޼ҵ� : ���� ���� O
	public default void ä�κ���() {
		System.out.println("ä�κ���");
	}
	public void ��������(int i);

}
