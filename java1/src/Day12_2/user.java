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
	
	
	//회원가입 메소드
	public void signup() throws Exception {
		System.out.println("----> 회원가입");
		System.out.println("회원 id : "); String id = Day12_2.scan.next();
		System.out.println("회원 pw : "); String password = Day12_2.scan.next();
		System.out.println("회원 name : "); String name = Day12_2.scan.next();
		
		user temp = new user(id, password, name);
		Day12_2.userlist.add(temp);
		//파일에 저장
		FileUtil.writefile("c:/java/","userlist.txt",Day12_2.userlist);
		System.out.println("----->회원가입 성공");
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
