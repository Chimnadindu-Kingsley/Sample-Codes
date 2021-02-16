// Nwafor Chimnadindu Kingsley 3017499
package workbook07;

import java.util.Arrays;

public class TestMergeSort {
	public static void main(String args[]) {

		// utilising the giving array
		int list3[] = { 2, 3, 2, 5, 6, 1, -2, 3, 14, 12 };
		int list4[] = { 8, 3, 4, 5, 22, -5, -2, 7, 1, 18 };

		// print the giving array
		System.out.println("Giving Array: " + Arrays.toString(list3));

		// creates new object and calls the merge_sort method
		MergeSort Q1 = new MergeSort();
		Q1.merge_sort(list3, 0, list3.length - 1);

		// print the sorted array
		System.out.println("Sorted Array: " + Arrays.toString(list3));
		
		// prints space
		System.out.println("");
		
		// print the giving array
		System.out.println("Giving Array: " + Arrays.toString(list4));

		// creates new object and calls the merge_sort method
		MergeSort Q2 = new MergeSort();
		Q2.merge_sort(list4, 0, list4.length - 1);

		// print the sorted array
		System.out.println("Sorted Array: " + Arrays.toString(list4));
	}

}
