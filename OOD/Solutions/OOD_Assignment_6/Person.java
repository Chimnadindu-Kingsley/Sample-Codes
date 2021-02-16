//Nwafor Chimnadindu Kingsley 3017499
package Assignment_6_OOD;


public class Person {

	// Declaring attributes
	private String name;
	private String phone_number;

	// A constructor that that takes in 2 attribute
	public Person(String name, String phone_number) {
		this.name = name;
		this.phone_number = phone_number;

	}

	// Getter to get the name
	public String getName() {
		return name;
	}

	// Setter to set the name
	public void setName(String name) {
		this.name = name;
	}

	// Getter to get the number
	public String getPhone_number() {
		return phone_number;
	}

	// Setter to set the number
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	// Override
	@Override

	// Create a toString method to print details of the object
	public String toString() {
		String To_String = "Name   :" + getName() + "\nNumber :" + getPhone_number();
		return To_String;
	}

	// Override
	@Override

	// Create an equals method to compare 2 objects
	public boolean equals(Object person) {

		// when the 2 compared objects are not the same
		if (!(person instanceof Person))
			return false;

		// comparing the object to itself
		Person object = (Person) person;
		// if the name and phone number are both equal, return true, else false
		if (object.getName().equals(getName()) && object.getPhone_number().equals(getPhone_number())) {
			return true;
		} else
			return false;
	}

}
