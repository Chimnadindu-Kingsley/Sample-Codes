//Nwafor Chimnadindu Kingsley 3017499
package workbook03;

import java.util.Arrays;
import java.util.Scanner;

public class Binarysearch {

	// Declaring int as the data type
	private int[] array;

	// Constructor for Binarysearch
	public Binarysearch(int array) {
		this.array = new int[array];
	}

	// Method populate the array
	public void arrayPop() {
		for (int i = 0; i < array.length; i++) {
			array[i] = 2 * (i + 1);
		}
	}

	// Method is to return the String representation of the array
	public String toString() {
		return Arrays.toString(array);
	}

	// BinarySearch method
	public int bSearch(int valueToBeFound) {
		int begin = 0;
		int end = array.length;

		while (begin < end) {
			int midPoint = (begin + end) / 2;
			if (array[midPoint] == valueToBeFound) {
				return midPoint;
			} else if (array[midPoint] < valueToBeFound) {
				begin = midPoint + 1;
			} else {
				end = midPoint;
			}
		}
		return -1;
	}

	// Main method
	public static void main(String[] args) {

		// creating object from the Binarysearch class
		Binarysearch binarySearch = new Binarysearch(10);

		// Calling the method to populate the array
		binarySearch.arrayPop();

		// Testing the method using the alg Object
		System.out.println("Array: " + binarySearch.toString());
		
		//A scanner that helps the user test with different values
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value you want to search for: ");
		int value = input.nextInt();
		System.out.println("Value searched is at index " + binarySearch.bSearch(value));
	}

}
