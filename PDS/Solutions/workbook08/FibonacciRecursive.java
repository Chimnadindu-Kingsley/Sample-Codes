package workbook08;

public class FibonacciRecursive {
	
	// Creating the Fibonacci Recursive method
	public FibonacciRecursive() {

	}

	public static int recursive(int n) {

		return (n == 0) ? n : (n <= 2) ? 1 : (recursive(n - 1) + recursive(n - 2));

	}

}
