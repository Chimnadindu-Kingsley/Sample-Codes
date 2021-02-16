//Nwafor Chimnadindu Kingsley 3017499
package workbook02;

public class NaiveQueue {

	// Inputting the attributes
	private int[] naiveQueue;
	private int front;
	private int back;

	// The NaiveQueue public class constructor
	public NaiveQueue(int Size) {
		this.naiveQueue = new int[Size];
		this.back = 0;
		this.front = 0;
	}

	// Method to add integer values to the array
	public void enQueue(int number) {

		// Check if the array is full
		if (size() == naiveQueue.length - 1) {

			// create new array double the length of the original array
			int[] newArray = new int[naiveQueue.length * 2];

			// Copy original array to the new created array
			System.arraycopy(naiveQueue, 0, newArray, 0, naiveQueue.length);

			// Assign new array to the original array
			this.naiveQueue = newArray;
		}

		naiveQueue[back] = number;
		back++;
	}

	// Method to dequeue
	public int deQueue() {
		if (size() == 0) {
			System.out.println("The array is Empty");
		}
		int number = this.naiveQueue[this.front];
		// this.naiveQueue[this.front] = null;
		this.front++;

		// After incrementing the front and it equals the size.. Reset front and back to
		// Zero
		if (size() == 0) {
			front = 0;
			back = 0;
		}
		return number;
	}

	// Method to return the difference between the back and the front values
	public int size() {

		return this.back - this.front;
	}

	// Method to check is the array is empty
	public boolean isEmpty() {
		return size() == 0;
	}

	public boolean isFull() {
		return size() == this.naiveQueue.length - 1;
	}

public static void main(String[] args) {
	
		// Creating a stack, NaiveQueue and CircularQueued objects
		NaiveQueue naive = new NaiveQueue(4);

		// Enqueue method for NaiveQueue
		naive.enQueue(2);
		
		// Dequeued method to pop items from the NaiveQueue
		System.out.println("deQueued " + naive.deQueue());

		// isEmpty method for Queue
		System.out.println("isEmpty " + naive.isEmpty());

		// isFull method for Queue
		System.out.println("isFull " + naive.isFull());

	}
	
}
