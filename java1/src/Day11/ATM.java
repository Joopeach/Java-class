package Day11;

public interface ATM {
	
	//�߻�޼ҵ�
	public void �޴�();
	public void ���µ��();
	public void ����();
	public void ���();
	public void �ܰ�();
	public int ���¹�ȣ();
	
	//
	public default void ����() {
		System.out.println("ATM ����");
	}
	
	} // interface��


