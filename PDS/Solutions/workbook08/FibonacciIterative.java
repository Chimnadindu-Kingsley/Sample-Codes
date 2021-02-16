package workbook08;

public class FibonacciIterative {
	
	// Creating the Fibonacci iterative method
	public static int iterative(int n) {
		// declare and assign variables
		int fib0 = 0;
		int fib1 = 1;
		int sum = 0;		

		if (n == 0) {
			return n;
		} else if (n == 1) {
			return 1;
		} else {
			// loops through values less than n when i is greater than 1
			for (int i = 2; i <= n; i++) {
				/*
				 * f3 = f2 + f1 == 1 + 0 = 1 
				 * f4 = f3 + f2 == 1 + 1 = 2 
				 * f5 = f4 + f3 == 2 + 1 = 3
				 */
				sum = fib1 + fib0;
				fib0 = fib1;
				fib1 = sum;
			}
			return sum;
		}

	}

}
