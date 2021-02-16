//Nwafor Chimnadindu Kingsley 3017499
package workbook03;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	//Declaring a private integer array
	private int[] array;

	//A public Constructor with the name LinearSearch
	public LinearSearch(int length) {
		this.array = new int[length];
	}

	//Populating method for the array
	public void fillArray() {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10);
		}
	}

	//This method displays the array in string format
	public String toString() {
		return Arrays.toString(array);
	}

	// Search method with variable valueToBeFound
	public int search(int valueToBeFound) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == valueToBeFound) {
				return i;
			}
		}
		return -1;
	}

	//Main method to test
	public static void main(String[] args) {

		//creating object from the Linearsearch class
		LinearSearch LinearTest = new LinearSearch(15);

		//To populate the array, the method is Called
		LinearTest.fillArray();

		//Testing the method using the array Object
		System.out.println("Array: " + LinearTest.toString());
		//Allows the user test multiple times with different values
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value you want to search for: ");
		int value = input.nextInt();
		System.out.println("The value is at position: " + LinearTest.search(value));
	}
}
