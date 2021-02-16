//Nwafor Chimnadindu Kingsley 3017499
package workbook01;

import java.util.Scanner;
public class Initials {
	
	public Initials() {
	}

	Scanner input = new Scanner(System.in);
	public void initials() {

		//The first and second input variables will be declared as Strings
		String First_Initial;
		String Second_Initial;

		//The user will be Prompted to enter the first letter
		System.out.println("Enter the First initial: ");
		First_Initial = input.nextLine();

		//Prompt to enter the second letter
		System.out.println("Enter the Second initial: ");
		Second_Initial = input.nextLine();

		//Converting the Strings to uppercase and Character
		char first = First_Initial.toUpperCase().charAt(0);
		char second = Second_Initial.toUpperCase().charAt(0);

		//If statement to compare the converted stings
		if (first < second) {
			System.out.println("The FIRST initial falls alphabetically before the SECOND");
		} else if (first > second) {
			System.out.println("The SECOND initial falls alphabetically before the FIRST");
		} else {
			System.out.println("The initials are The same");
		}
	}

}
