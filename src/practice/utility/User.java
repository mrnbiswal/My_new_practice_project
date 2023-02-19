package practice.utility;

public class User {
	private int id;
	private String name;
	private String address;
	private String worklocation;
	private String email;
	private String doc;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getWorklocation() {
		return worklocation;
	}

	public void setWorklocation(String worklocation) {
		this.worklocation = worklocation;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDoc() {
		return doc;
	} 

	public void setDoc(String doc) {
		this.doc = doc;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", worklocation=" + worklocation
				+ ", email=" + email + ", doc=" + doc + "]";
	}

}

