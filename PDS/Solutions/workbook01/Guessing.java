//Nwafor Chimnadindu Kingsley 3017499
package workbook01;

import java.util.Scanner;
public class Guessing {
	//Declaring variables
	int count;
	int guessCount;
	int correctCount;
	//A number is assigned to the Guess randomly 
	final int number = (int) (Math.random()*10);
		
	public void Guessing() {
	//A statement indicating the rules 
	System.out.println("A number have been generated randomly that ranges from 0 to 9");	
	
	//Sets the total guess to 5
	count = 5;
	
	//Create a scanner to prompt the user to enter input
	Scanner input = new Scanner(System.in);	
	System.out.println("Enter " + count + " guesses one after the other: ");
	
	//To limit the number of guess times to 5
	guessCount = 0;
	//A count that increments if the guess is correct
	correctCount = 0;
	//
	while (guessCount < 5) {
		System.out.print("\nYou have " + count + " guess left, Guess the number: ");
		int guess = input.nextInt();
		//Calls the method to check if the guess == number
		if (guess1(guess, number) == false) {			
			//Decrement the total guess count by 1 if the guess is wrong
			count--;
		} else {
			//Increment the total correct count by 1 if the guess is right
			correctCount++;
			}
		//Condition to break out of the loop if the guess match
		guessCount++;		
	}
		if (correctCount > 0) {
			System.out.println("CONGRATULATION, Your guess MATCHED, The guess number is: " + number);
		} else {
			System.out.println("Sorry, all your guesses are WRONG, The guess number is: " + number);
		}
	}
	
	//A method that checks if the guess match the number
	public static boolean guess1(int guess, int number) {		
		if (guess == number) {
			return true;
		} else
			return false;
	}
	
}
	
	
	
	
