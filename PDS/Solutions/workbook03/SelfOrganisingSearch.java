//Nwafor Chimnadindu Kingsley 3017499
package workbook03;

import java.util.Arrays;
import java.util.Scanner;

public class SelfOrganisingSearch {

	// Declaring int as the data type in the array
	private int[] array;

	// Public Constructor for the selfOrganisingSearch class
	public SelfOrganisingSearch(int size) {
		array = new int[size];
	}

	// The method to populate the array
	public void arrayPop() {
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
	}

	// SelfOrganising Search method
	public int selfSearch(int value) {
		int j = 0;
		while (j < array.length && array[j] != value) {
			j = j + 1;
		}
		if (j == array.length) {
			j = -1;
		} else if (j != 0) {
			int tmpo = array[j];
			for (int i = j; i > 0; i--) {
				array[i] = array[i - 1];

			}
			array[0] = tmpo;
		}

		return j;
	}

	// Method is to return the String representation of the array
	public String toString() {
		return Arrays.toString(array);
	}

	// main method
	public static void main(String[] args) {
		// creating object from the SelfOrganising class
		SelfOrganisingSearch SelfOrganisingSearchTest = new SelfOrganisingSearch(10);

		// Calling the method to populate the array
		SelfOrganisingSearchTest.arrayPop();

		// Testing the method using the alg Object
		System.out.println("Array: " + SelfOrganisingSearchTest.toString());
		
		//A scanner that helps the user test with different values
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value you want to search for: ");
		int value = input.nextInt();
		System.out.println("Value searched is at position: " + SelfOrganisingSearchTest.selfSearch(value));
		System.out.println("Value moved to the first position in the list " + SelfOrganisingSearchTest.toString());

	}

}
