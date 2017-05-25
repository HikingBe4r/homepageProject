package bean;

public class MemberVO {
	private int no;
	private String email;
	private String pwd;
	private String name;
	private String joinday;
	private int authority;
	public MemberVO() {
		super();
	}
	public MemberVO(int no, String email, String pwd, String name, String joinday, int authority) {
		super();
		this.no = no;
		this.email = email;
		this.pwd = pwd;
		this.name = name;
		this.joinday = joinday;
		this.authority = authority;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJoinday() {
		return joinday;
	}
	public void setJoinday(String joinday) {
		this.joinday = joinday;
	}
	public int getAuthority() {
		return authority;
	}
	public void setAuthority(int authority) {
		this.authority = authority;
	}
	@Override
	public String toString() {
		return "MemberVO [no=" + no + ", email=" + email + ", pwd=" + pwd + ", name=" + name + ", joinday=" + joinday
				+ ", authority=" + authority + "]";
	}
	
	
}
