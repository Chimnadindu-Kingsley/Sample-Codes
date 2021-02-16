//Nwafor_Chimnadindu_Kingsley 3017499
package OOD_Assignment_2;

public class Student {

	//These attributes can only be accessed by this class "Student".
	private String firstName;
	private String lastName;
	private int gender;
	private int age;

	//This is a four-argument constructor that holds four parameters
	public Student(String firstName, String lastName, int gender, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		//(this.) is used to call a private variable inside a class
	}

	//This is a three-argument constructor that holds three parameters
	public Student(String firstName, int gender, int age) {
		this.firstName = firstName;
		this.gender = gender;
		this.age = age;
		this.lastName = " ";
	}
	
	//To get the current age
	public int getAge() {
		return age;
	}
	
	//To set the current age
	public void setAge(int age) {
		//To set the conditions for the age
		if (age < 0 || age > 100) {
			this.age = -1;
			System.out.println("Error");
			//If the conditions are meet
		} else {
			this.age = age;
		}
	}

	//This is a method used to return the age group of a student
	public String AgeGroup() {

		//Declare variable
		int current_age = age;

		//Conditions for different age group using if-statement
		if (current_age < 12) {
			return "Child";
		} else if (current_age >= 13 && current_age <= 19) {
			return "Teenager";
		} else if (current_age >= 20 && current_age <= 25) {
			return "Young Adult";
		} else {
			return "Adult";
		}
	}
	
	//To get the first name 
	public String getFirstName() {
		return firstName;
	}
	
	//To set the first name
	public void setFirstName(String firstName) {
		String first = firstName.substring(0, 1).toUpperCase();
		String theRest = firstName.substring(1).toLowerCase();
		firstName = first + theRest;
		this.firstName = firstName;
	}
	
	//To get the last name
	public String getLastName() {
		return lastName;
	}
	
	//To set the last name
	public void setLastName(String lastName) {
		String LastName = lastName.substring(0, 1).toUpperCase();
		String RestOfLastName = lastName.substring(1).toLowerCase();
		lastName = LastName + RestOfLastName;
		this.lastName = lastName;
	}
	
	//To get the gender
		public int getGender() {
			return gender;
		}
		
		//To set the last name
		public void setGender(String Gender) {	
			if (Gender.substring(0, 1).equalsIgnoreCase("m")) {
				this.gender = 0;
			} else if (Gender.substring(0, 1).equalsIgnoreCase("f")) {
				this.gender = 1;
			}
		}
	
	
	//initiate method called display which will display student attributes
	public void display() {
		String firstName_of_Student = firstName;
		String lastName_of_Student = lastName;
		int gender_of_Student = gender;
		int studentAge = age;
		System.out.println(firstName_of_Student + " " + lastName_of_Student + " " + gender_of_Student + " " + studentAge
				+ " " + AgeGroup());
	}
}
