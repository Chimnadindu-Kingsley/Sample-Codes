package workbook08;

public class FactorialRecursive {
	
	// Creating the Factorial Recursive method
		public FactorialRecursive() {
			
		}

		public static int recursive(int num) {
			return (num == 0 || num == 1) ? 1 : (num * recursive(num - 1));
		}

}
