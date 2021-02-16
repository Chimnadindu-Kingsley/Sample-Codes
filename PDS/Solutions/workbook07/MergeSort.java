// Nwafor Chimnadindu Kingsley 3017499
package workbook07;

public class MergeSort {

	/*
	 * This works when the array on the left half and that on the right half are
	 * sorted in order. First sub array is array index[l.....left_half]. Second sub
	 * array is array[(left_half + 1)......array.length]
	 */

	// This method merges the two sub arrays
	void merge(int array[], int l, int left_half, int end) {
		// Find sizes of two subarrays to be merged
		int n1 = left_half - l + 1;
		int n2 = end - left_half;

		// Create temp arrays
		int Left[] = new int[n1];
		int Right[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			Left[i] = array[l + i];
		for (int j = 0; j < n2; ++j)
			Right[j] = array[left_half + 1 + j];

		// Initial indexes of first and second sub arrays
		int i = 0, j = 0;

		// Initial index of merged sub array array
		int k = l;
		while (i < n1 && j < n2) {
			if (Left[i] <= Right[j]) {
				array[k] = Left[i];
				i++;
			} else {
				array[k] = Right[j];
				j++;
			}
			k++;
		}

		// copy remaining elements of Left[]
		while (i < n1) {
			array[k] = Left[i];
			i++;
			k++;
		}

		// Copy remaining elements of Right[]
		while (j < n2) {
			array[k] = Right[j];
			j++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using
	// merge()
	void merge_sort(int arr[], int l, int end) {
		if (l < end) {
			// Find the middle point
			int left_half = (l + end) / 2;

			// Sort first and second halves
			merge_sort(arr, l, left_half);
			merge_sort(arr, left_half + 1, end);

			// Merge the sorted halves
			merge(arr, l, left_half, end);
		}
	}

}
