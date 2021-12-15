package register;

public class Register {
	private String reg_name;
	private String reg_mail;
	private String reg_password;
	public String getReg_name() {
		return reg_name;
	}
	public void setReg_name(String reg_name) {
		this.reg_name = reg_name;
	}
	public String getReg_mail() {
		return reg_mail;
	}
	public void setReg_mail(String reg_mail) {
		this.reg_mail = reg_mail;
	}
	public String getReg_password() {
		return reg_password;
	}
	public void setReg_password(String reg_password) {
		this.reg_password = reg_password;
	}
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Register(String reg_name, String reg_mail, String reg_password) {
		super();
		this.reg_name = reg_name;
		this.reg_mail = reg_mail;
		this.reg_password = reg_password;
	}
	@Override
	public String toString() {
		return "Register [reg_name=" + reg_name + ", reg_mail=" + reg_mail + ", reg_password=" + reg_password + "]";
	}
	
	
	 

}
