package main;

public class Customer {
	private String name;
	private String address; 
	private String phone;
	private String email;
	private int id; 
	
	public Customer(String name, int id, String address, String phone, String email) {
		this.name = name;
		this.id = id;
		this.address = address;
		this.phone = phone;
		this.email = email;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
