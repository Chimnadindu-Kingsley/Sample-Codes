//Nwafor Chimnadindu Kingsley 3017499
package Assignment_6_OOD;

import java.math.BigInteger;

public class Employee extends Person {
	
	// declaring attributes
	private String pps_number;

	// A constructor that takes in 3 attributes
	public Employee(String name, String phone_number, String pps_number) {
		// inheriting the "person" class attributes
		super(name, phone_number);
		this.pps_number = pps_number;
	}

	// Getter to get the name
	public String getpps_number() {
		return pps_number;
	}

	// Setter to set the name
	public void setpps_number(String pps_number) {
		this.pps_number = pps_number;
	}

	// Override
	@Override

	// Create a toString method to print details of the object
	public String toString() {
		String To_String = "Name   :" + getName() + "\nNumber :" + getPhone_number() + "\nPPS    :" + this.pps_number;
		return To_String;
	}

	// Override
	@Override

	// Create an equals method to compare 2 objects
	public boolean equals(Object employee) {

		// when the 2 compared objects are not the same
		if (!(employee instanceof Employee))
			return false;

		// comparing the object to itself
		Employee Employee = (Employee) employee;
		if (Employee.pps_number.equals(pps_number)) {
			return true;
		} else
			return false;
	}

}
