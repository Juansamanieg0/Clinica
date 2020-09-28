import java.util.Scanner;

public class Patient {
	String name;
	String id;
	String password;
	String address;
	String phone_number;
	String disease;
	String newentry;
	
	public Patient(String name, String id, String password, String address, String phone_number, String disease) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.address = address;
		this.phone_number = phone_number;
		this.disease = disease;
		this.newentry = newentry;
	}
	public Patient() {
		
	}
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of patient");
		name=sc.nextLine();
		System.out.println("Enter id of patient");
		id=sc.nextLine();
		System.out.println("Enter password of patient");
		password=sc.nextLine();
		System.out.println("Enter address of patient");
		address=sc.nextLine();
		System.out.println("Enter phone number of patient");
		phone_number=sc.nextLine();
		System.out.println("Enter disease of patient");
		disease=sc.nextLine();
		
		System.out.print("Patient registered successfully\n");
		
		
		
		
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the phone_number
	 */
	public String getPhone_number() {
		return phone_number;
	}
	/**
	 * @param phone_number the phone_number to set
	 */
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	/**
	 * @return the disease
	 */
	public String getDisease() {
		return disease;
	}
	/**
	 * @param disease the disease to set
	 */
	public void setDisease(String disease) {
		this.disease = disease;
	}
	@Override
	public String toString() {
		return "Patient [name=" + name + ", id=" + id + ", address=" + address + ", phone_number=" + phone_number
				+ ", disease=" + disease + "]";
	}
	
}
