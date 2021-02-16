// Nwafor Chimnadindu Kingsley 3017499
package workbook07;

public class QuickSort {
	/*
	 * This works by selecting a pivot element, that allows you to swap all other
	 * element that are less than the pivot element
	 */
	
	// The last element is selected as the pivot
	int partition(int intArray[], int low, int high) {
		int pivot = intArray[high];
		// smaller element index
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			// check if current element is less than or equal to pivot
			if (intArray[j] <= pivot) {
				i++;
				// swaping intArray[i] and intArray[j] using temp
				int temp = intArray[i];
				intArray[i] = intArray[j];
				intArray[j] = temp;
			}
		}

		// swap intArray[i+1] and intArray[high] (or pivot)
		int temp = intArray[i + 1];
		intArray[i + 1] = intArray[high];
		intArray[high] = temp;

		return i + 1;
	}

	// method that sorts the array partitions
	void quick_sort(int intArray[], int low, int high) {
		if (low < high) {
			// partition the array around pivot
			int pivot = partition(intArray, low, high);

			// sorts each partition recursively
			quick_sort(intArray, low, pivot - 1);
			quick_sort(intArray, pivot + 1, high);
		}
	}
}
