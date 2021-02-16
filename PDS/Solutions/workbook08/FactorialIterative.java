package workbook08;

public class FactorialIterative {
	
	//Creating the Factorial Iterative method
		public FactorialIterative() {
			
		}

		public static int iterative(int n) {
			int factorial = 1;
			for (int i = 2; i <= n; i++) {
				factorial = factorial * i;
			}
			return factorial;
		}

}
