//Nwafor Chimnadindu Kingsley 3017499
package workbook01;

import java.util.Scanner;
public class Odd {

	public static void main(String[] args) {
		//Request the user to input a positive value
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		//Calls on the check method
		if (check(number) == true) {
		System.out.println("The number is an EVEN number");
		} else {
			System.out.println("The number is an ODD number");
		}
	}
	
	//A method that checks if the number is even or odd
	public static boolean check(int number) {
		int remainder;
		//The positive number is divided by 2 and the remainder is taken
		remainder = (number % 2);
		//An if statement, if the remainder is not 0, then its an odd number
		if (remainder >= 1) {
			return false;
		} else 		
		return true;		
	}

}
