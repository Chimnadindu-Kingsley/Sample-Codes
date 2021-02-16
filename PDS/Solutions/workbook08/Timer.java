package workbook08;

public class Timer {

	public static void main(String[] args) {

		/*
		 * The Factorial iteration time complexity is generally lesser than it is for
		 * recursion. The Fibonacci iteration time complexity is generally greater than
		 * it is for the iteration.
		 */

		int result;

		for (int i = 0; i < 6; i++) {

			// set the start time
			long startTime1 = System.nanoTime();
			// call the method and assign to result
			result = FactorialIterative.iterative(i);
			// get the end time
			long endTime1 = System.nanoTime();
			// set the start time
			long startTime2 = System.nanoTime();
			// call the method and assign to result
			result = FactorialRecursive.recursive(i);
			// get the end time
			long endTime2 = System.nanoTime();
			// print the input, output and the total time taken
			System.out.println("Index: " + i);
			System.out.println("Output: " + result);
			System.out.println("Factorial --Iterative Time: " + (endTime1 - startTime1) / 100 + "  "
					+ "Recursive Time: " + (endTime2 - startTime2) / 100);

			System.out.println("");

		}

		System.out.println("\n");

		for (int i = 0; i < 6; i++) {

			// set the start time
			long startTime3 = System.nanoTime();
			// call the method and assign to result
			result = FibonacciIterative.iterative(i);
			// get the end time
			long endTime3 = System.nanoTime();
			// set the start time
			long startTime4 = System.nanoTime();
			// call the method and assign to result
			result = FibonacciRecursive.recursive(i);
			// get the end time
			long endTime4 = System.nanoTime();
			// print the input, output and the total time taken
			System.out.println("Index: " + i);
			System.out.println("Output: " + result);
			System.out.println("Fibonacci Iterative Time: " + (endTime3 - startTime3) / 100 + "  " + "Recursive Time: "
					+ (endTime4 - startTime4) / 100);

			System.out.println("");

		}

	}

}
