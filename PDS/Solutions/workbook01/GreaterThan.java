//Nwafor Chimnadindu Kingsley 3017499
package workbook01;

import java.util.Scanner;
public class GreaterThan {

	public static void main(String[] args) {
	//Create a scanner to take in 2 input
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the First number: ");
	//Takes in the 1st input
	int First = input.nextInt();
	System.out.println("Enter the Second number: ");
	//Takes in the 2nd input
	int Second = input.nextInt();
	
	//Calls on the method greaterThan and passes the 1st and 2nd inputs
	System.out.println(greaterThan(First, Second));
	}
	
	//A method that checks the 2 input and returns 1, 0, or null if the number are the same
	public static Object greaterThan(int First, int Second) {
		//Assign the 1st input to "first"
		int first = First;
		//Assign the 2nd input to "second"
		int second = Second;
		
		if (first > second) {
			return 1;
		} else if (second > first) {
			return 0;
		//A condition if the 2 input are the same
		} else {
			return null;
		}
	}

}
