package domain;

public class memberVO 
{
	private String id;
	private String pwd;
	private String email;
	private int age;
	private String regdate;
	private String last_login;
	
	public memberVO() {}
	//register,modify
	public memberVO(String id, String pwd, String email, int age) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.email = email;
		this.age = age;
	}
	//로그인
	public memberVO(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}
	
	

	//--------------------getter/setter------------------------
	





	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getLast_login() {
		return last_login;
	}

	public void setLast_login(String last_login) {
		this.last_login = last_login;
	}
	
	
	

}
