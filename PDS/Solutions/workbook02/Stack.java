//Nwafor Chimnadindu Kingsley 3017499
package workbook02;

public class Stack {

	// defining the attributes
	private int[] stackArray;
	private int top;

	// The Stack class public constructor
	public Stack(int arraySize) {
		this.stackArray = new int[arraySize];
		this.top = 0;
	}

	public void push(int number) {
		// Check if the array is full
		if (top == stackArray.length) {

			// If array is full create a new array double the size of the original array
			int[] newStackArray = new int[2 * stackArray.length];

			// Copy original array to the new created array
			System.arraycopy(stackArray, 0, newStackArray, 0, stackArray.length);

			// Assign new array to the original array
			stackArray = newStackArray;
		}
		stackArray[top++] = number;
	}

	public int pop() {
		// Check if array is empty
		if (isEmpty()) {
			System.out.println("The Stack is Empty");
		}

		int number = stackArray[--top];
		// stackArray[top] = (Integer) null;
		return number;
	}

	// Method to return the top Item without removing it
	public int top() {
		// Check if array its empty
		if (isEmpty()) {
			System.out.println("The Stack is Empty");
		}
		return stackArray[top - 1];
	}

	// Method to check is the array is empty
	public boolean isEmpty() {
		return top == 0;
	}

	public boolean isFull() {
		return top == stackArray.length;
	}

	// Method to print the array
	public void printStackArray() {
		for (int i = top - 1; i >= 0; i--) {
			System.out.println(stackArray[i]);
		}
	}

public static void main(String[] args) {
	
	// Creating a stack, NaiveQueue and CircularQueued objects
	Stack array = new Stack(8);

	// Push method to add items to the stack
	array.push(31);
	array.push(67);
	array.push(87);
	array.push(34);
	array.push(82);
	array.push(17);
		
	// Pop method to pop items from the stack
	System.out.println("popped: " + array.pop());

	// isEmpty method for Stack
	System.out.println("isEmpty: " + array.isEmpty());

	// isFull method for Stack
	System.out.println("isFull: " + array.isFull());

	// array.printStackArray();
	System.out.println("Top: " + array.top());
	}
}
