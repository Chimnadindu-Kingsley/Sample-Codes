//Nwafor Chimnadindu Kingsley 3017499
package workbook01;

import java.util.Scanner;
import workbook01.Tax;
public class TaxTest {

	// Main method
	public static void main(String[] args) {

		//Input Scanner declaration
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter the first income
		System.out.println("Enter the First Salary");
		double First_Salary = input.nextDouble();

		// Prompt the user to enter the second income
		System.out.println("Enter the Second Salary");
		double Second_Salary = input.nextDouble();

		// Creating an object from the Tax class
		Tax Kingsley = new Tax(First_Salary, Second_Salary);

		// Displaying the Tax for the object created.
		System.out.println("The combined Tax Bill is: " + Kingsley.calculate());

	}

}
