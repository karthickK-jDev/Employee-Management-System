package Employee;

public class employee {
	private int id;
	private String name;
	private String email;
	private String contact;
	private String bdate;
	private String gender;
	private String qualification;
	private String address;
	
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public employee(int id, String name, String email, String contact, String bdate, String gender, String qualification,
			String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.bdate = bdate;
		this.gender = gender;
		this.qualification = qualification;
		this.address = address;
	}

	public employee(String name, String email, String contact, String bdate, String gender, String qualification,
			String address) {
		super();
		this.name = name;
		this.email = email;
		this.contact = contact;
		this.bdate = bdate;
		this.gender = gender;
		this.qualification = qualification;
		this.address = address;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
		
}
