//Nwafor_Chimnadindu_Kingsley 3017499
package OOD_Assignment_2;

import java.util.Scanner;

import OOD_Assignment_2.Student;
public class Lab2 {

	public static void main(String[] args) {

		// Student class object that uses a default
		Student student = new Student(null, null, 0, 0);

		// create scanner input
		Scanner input = new Scanner(System.in);

		// prompt the user to enter first name
		System.out.println("Enter Your First name");
		String firstname = input.nextLine();
		student.setFirstName(firstname);

		// prompt the user to enter last name
		System.out.println("Enter Your Last name");
		String lastname = input.nextLine();
		student.setLastName(lastname);

		// prompt user to enter gender
		System.out.println("Enter Your Gender");
		String gender = input.nextLine();
		student.setGender(gender);

		// prompt user to enter age
		System.out.println("Enter Your Age");
		int age = input.nextInt();
		student.setAge(age);

		// using the display method, display objects
		student.display();
	}

}
