//Nwafor Chimnadindu Kingsley 3017499
package Assignment_8_OOD;

public class Customer implements Comparable<Customer> {
	// Declaring variables
	public static int customerId;
	private int age;
	private String name;
	private int phone;
	private int id;

	// assigns the declared variables
	public Customer(String name, int age, int phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		// assigns the customerId and increments by 1
		this.id = ++customerId;
	}

	// gets the age
	public int getAge() {
		return age;
	}

	// sets the age
	public void setAge(int age) {
		this.age = age;
	}

	// gets the name
	public String getName() {
		return name;
	}

	// sets the name
	public void setName(String name) {
		this.name = name;
	}

	// gets the phoneNumber
	public int getPhone() {
		return phone;
	}

	// sets the phoneNumber
	public void setPhone(int phone) {
		this.phone = phone;
	}

	// Override the toString method
	@Override
	public String toString() {
		return (this.id + " " + getName() + "," + getPhone() + "," + getAge());
	}

	@Override
	// A method that compares the Ages
	public int compareTo(Customer C) {
		
		// takes in 2 ages and returns 1 if greater than, -1 if less than, 0 if the same
		return (this.age == C.getAge()) ? 0 : (this.age > C.getAge()) ? 1 : -1;

	}

}
