package Day12_2;

public class user {
	
	private String id;
	private String password;
	private String name;
	
	public user() {}
	
	public user(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
	
	//ȸ������ �޼ҵ�
	public void signup() throws Exception {
		System.out.println("----> ȸ������");
		System.out.println("ȸ�� id : "); String id = Day12_2.scan.next();
		System.out.println("ȸ�� pw : "); String password = Day12_2.scan.next();
		System.out.println("ȸ�� name : "); String name = Day12_2.scan.next();
		
		user temp = new user(id, password, name);
		Day12_2.userlist.add(temp);
		//���Ͽ� ����
		FileUtil.writefile("c:/java/","userlist.txt",Day12_2.userlist);
		System.out.println("----->ȸ������ ����");
	}
	
	public String getid() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
