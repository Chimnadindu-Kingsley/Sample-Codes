// Nwafor Chimnadindu Kingsley 3017499
package workbook07;

import java.util.Arrays;

public class TestQuickSort {

	public static void main(String args[]) {
		// utilising the giving array
		int list1[] = { 2, 3, 2, 5, 6, 1, -2, 3, 14, 12 };
		int list1_size = list1.length;
		int list2[] = { 8, 3, 4, 5, 22, -5, -2, 7, 1, 18 };
		int list2_size = list2.length;

		// print the giving array
		System.out.println("Giving Array: " + Arrays.toString(list1));

		// creates new object and calls the quick_sort method
		QuickSort Q1 = new QuickSort();
		Q1.quick_sort(list1, 0, (list1_size - 1));
		
		// print the sorted array
		System.out.println("Sorted Array: " + Arrays.toString(list1));

		// prints space
		System.out.println("");

		// print the giving array
		System.out.println("Giving Array: " + Arrays.toString(list2));

		// creates new object and calls the quick_sort method
		QuickSort Q2 = new QuickSort();
		Q2.quick_sort(list2, 0, (list2_size - 1));

		// print the sorted array
		System.out.println("Sorted Array: " + Arrays.toString(list2));
	}
}
