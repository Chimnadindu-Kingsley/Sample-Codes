package workbook04;

public class ArrayStructuresSkeleton {

	private static int[] theArray = new int[50];

	private int arraySize = 10;

	public void generateRandomArray() {

		for (int i = 0; i < arraySize; i++) {

			theArray[i] = (int) (Math.random() * 10) + 10;

		}

	}

	public void printHorzArray(int i, int j) {

		for (int n = 0; n < 51; n++)
			System.out.print("-");

		System.out.println();

		for (int n = 0; n < arraySize; n++) {

			System.out.print("| " + n + "  ");

		}

		System.out.println("|");

		for (int n = 0; n < 51; n++)
			System.out.print("-");

		System.out.println();

		for (int n = 0; n < arraySize; n++) {

			System.out.print("| " + theArray[n] + " ");

		}

		System.out.println("|");

		for (int n = 0; n < 51; n++)
			System.out.print("-");

		System.out.println();

		// END OF FIRST PART

		// ADDED FOR BUBBLE SORT

		if (j != -1) {

			// ADD THE +2 TO FIX SPACING

			for (int k = 0; k < ((j * 5) + 2); k++)
				System.out.print(" ");

			System.out.print(j);

		}

		// THEN ADD THIS CODE

		if (i != -1) {

			// ADD THE -1 TO FIX SPACING

			for (int l = 0; l < (5 * (i - j) - 1); l++)
				System.out.print(" ");

			System.out.print(i);

		}

		System.out.println();

	}

//-------------- SELECTION SORT-----------------
//Selection sort search for the smallest number in the array
// saves it in the minimum spot and then repeats searching
// through the entire array each time

//public void selectionSort(){
	public void selectionSort(int[] myArray) {

		// Loops through the array to find the position with the smallest value
		for (int i = 0; i <= myArray.length - 2; i++) {
			// Stores the point in the loop 'i', in 'smallest position'
			int smallestposition = i;
			// moves to the next position
			for (int j = (i + 1); j <= myArray.length - 1; j++) {
				// Filters out values that are zero out of the array
				if (myArray[j] != 0)
					// checks if the value at position j is smaller than the value at the smallest
					// position
					if (myArray[j] < myArray[smallestposition]) {
						// passes the position of j as the new smallest position
						smallestposition = j;
					}
			}
			// calls the swap method and passes the value through it
			swapValues(myArray, i, smallestposition);
		}
	}

//-------------- INSERTION SORT-----------------
// The Insertion Sort is normally the best of 
// the elementary sorts. Unlike the other sorts that
// had a group sorted at any given time, groups are
// only partially sorted here.

//public void insertionSort(){
	public void insertionSort(int[] myArray) {
		// loops through the array
		for (int j = 1; j <= myArray.length - 1; j++) {
			// stores the position of j in a temporal file 'temp'
			int temp = myArray[j];
			// Updates the position i as the position before j
			int i = j - 1;
			/*
			 * sets condition for position 'i' to be less than zero to remain in the loop
			 * -&&- sets the condition for position 'i' to be less than position j passed to
			 * 'temp' -&&- sets the condition to filter the values that are zero in the
			 * array
			 */
			while (i >= 0 && myArray[i] > temp && myArray[i + 1] != 0) {
				// Passes the position 'i' to the incremented position by 1
				myArray[i + 1] = myArray[i];
				// Decrement position 'i'
				i--;
			}
			// returns the 'temp' file to the incremented position of 'i'
			myArray[i + 1] = temp;
		}
	}

//-------------- BUBBLE SORT-----------------

	// This bubble sort will sort everything from
	// smallest to largest

//public void bubbleSort(){
	public void bubbleSort(int[] myArray) {
		// Loops through the array to the position before the last
		for (int i = 0; i < myArray.length - 2; i++) {
			// loops through the array
			for (int j = 0; j < myArray.length - i - 1; j++) {
				// filter the values that are zero in the array
				if (myArray[j + 1] != 0)
					// Checks if the value at position 'j' is greater than that of 'j+1'
					if (myArray[j] > myArray[j + 1]) {
						// calls the swap method and passes the values through it
						swapValues(myArray, j, j + 1);
					}
			}
		}
	}

//-------------- Swap Values-----------------		

//public void swapValues()
	public void swapValues(int[] myArray, int i, int j) {

		// Does the swap using a temporal store 'temp'
		int temp = myArray[j];
		// swaps the array value at the smallest position to the value 'i'
		myArray[j] = myArray[i];
		// returns the 'temp' file to the position of 'i'
		myArray[i] = temp;
	}

//---------------------TESTING---------------------

	public static void main(String[] args) {

		// An object is created with the name newArray
		ArrayStructuresSkeleton newArray = new ArrayStructuresSkeleton();

		System.out.println("Random array unsorted");
		newArray.generateRandomArray();
		newArray.printHorzArray(-1, -1);

		// newArray.selectionSort();

		System.out.print("Testing selection sort\n");
		newArray.generateRandomArray();
		newArray.selectionSort(theArray);
		newArray.printHorzArray(-1, -1);

		// newArray.insertionSort();

		System.out.print("Testing insertion sort\n");
		newArray.generateRandomArray();
		newArray.insertionSort(theArray);
		newArray.printHorzArray(-1, -1);

		// newArray.bubbleSort();

		System.out.print("Testing bubble sort\n");
		newArray.generateRandomArray();
		newArray.bubbleSort(theArray);
		newArray.printHorzArray(-1, -1);
	}
}
