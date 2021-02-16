//Nwafor Chimnadindu Kingsley 3017499
package Assignment_6_OOD;

import java.util.ArrayList;

public class Lab6 {

	// Create a printArrayList method
	public static void printArrayList(ArrayList<Person> inputArray) {
		for (int i=0; i<inputArray.size(); i++) {
			System.out.print(inputArray.get(i) + "\n\n");
		}
	}

	// main method
	public static void main(String[] args) {

		// Array List to hold Person object
		ArrayList<Person> myArray = new ArrayList<Person>();

		// 2 Person objects stored in the array list
		myArray.add(new Person("Nwafor Kingsley", "0805185651"));
		myArray.add(new Person("Stephen Koleman", "0873325478"));

		// 2 employee objects stored in the array list
		myArray.add(new Employee("Nwafor Kingsley", "0852210956", "7865432UA"));
		myArray.add(new Employee("Nwafor Chimnadindu", "0869184988", "7865432UA"));

		// myArrayList passed to the printArrayList method
		printArrayList(myArray);

		// 2 employees with the same pps number, but with slightly different names
		Employee first_employee = new Employee("Nwafor Kingsley", "0852210956", "7865432UA");
		Employee second_employee = new Employee("Nwafor Chimnadindu", "0869184988", "7865432UA");

		// When the == operator is used
		System.out.println("When the == operator is used:  " + (first_employee == second_employee) + "\n");

		// When the equals() method is used
		System.out.println("When the equals() method is used:  " + first_employee.equals(second_employee));

	}

}
