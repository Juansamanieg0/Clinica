import java.util.Scanner;

public class Doctors {
	String name;
	String id;
	String phone_number;
	int fees;
	public Doctors(String name, String id, String phone_number, int fees) {
		super();
		this.name = name;
		this.id = id;
		this.phone_number = phone_number;
		this.fees = fees;
	}
	public Doctors() {
		
	}
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name of doctor");
		name=sc.nextLine();
		System.out.println("Enter id of doctor");
		id=sc.nextLine();
		System.out.println("Enter phone number of doctor");
		phone_number=sc.nextLine();
		System.out.println("Enter fees of doctor");
		fees=sc.nextInt();
		sc.nextLine();
		
		System.out.print("Doctor registered successfully\n");
		
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
	/**
	 * @return the fees
	 */
	public int getFees() {
		return fees;
	}
	/**
	 * @param fees the fees to set
	 */
	public void setFees(int fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Doctors [name=" + name + ", id=" + id + ", phone_number=" + phone_number + ", fees=" + fees + "]";
	}
	
	
}
