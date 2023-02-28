package quest1;

public class User {
	private String userName;
	private String id;
	private String pw;
	

	public User(String userName, String id, String pw) {
		this.userName = userName;
		this.id = id;
		this.pw = pw;
	}
	String getUserName() {
		return userName;
	}
	String getId() {
		return id;
	}
	String getPw() {
		return pw;
	}
	void info() {
		System.out.println("이름: "+userName);
		System.out.println("id: "+id);
		System.out.println("pw: "+pw);
	}
}
