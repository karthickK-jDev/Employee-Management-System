package Employee;

public class users {
	private int id;
	private String name;
	private String mail;
	private String contact;
	private String bdate;
	private String gender;
	private String password;
	public users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public users(int id, String name, String mail, String contact, String bdate, String gender, String password) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.contact = contact;
		this.bdate = bdate;
		this.gender = gender;
		this.password = password;
	}
	public users(String name, String mail, String contact, String bdate, String gender, String password) {
		super();
		this.name = name;
		this.mail = mail;
		this.contact = contact;
		this.bdate = bdate;
		this.gender = gender;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
