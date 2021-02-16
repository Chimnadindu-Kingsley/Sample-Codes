//Nwafor Chimnadindu Kingsley 3017499
package workbook02;

public class CircularQueue {

	//Declaring the attributes
	private int[] circularQueue;
	private int front;
	private int back;

	//Public class constructor
	public CircularQueue(int Size) {
		this.circularQueue = new int[Size];
		this.back = 0;
		this.front = 0;
	}

	public void enQueue(int number) {

		// Check if the array is full
		if (size() == this.circularQueue.length - 1) {
			int numberOfItems = size();

			// create new array double the length of the original array
			int[] newArray = new int[this.circularQueue.length * 2];

			// Copy the original array and infuse it with the new created array
			System.arraycopy(this.circularQueue, front, newArray, 0, this.circularQueue.length - front);
			System.arraycopy(this.circularQueue, 0, newArray, this.circularQueue.length - front, back);

			// Assign new array to the original array
			this.circularQueue = newArray;

			// Assign front and Back new values after copying to the new array
			front = 0;
			back = numberOfItems;
		}

		circularQueue[back] = number;
		if (back < this.circularQueue.length - 1) {
			back++;
		}

		// Reset back to 0 if it is equal to the length of the array -1
		else {
			back = 0;
		}

	}

	// Method to dequeue
	public int deQueue() {
		if (size() == 0) {
			System.out.println("The array is Empty");
		}
		int number = this.circularQueue[this.front];
		// this.circularQueue[this.front] = null;
		this.front++;

		// After incrementing the front and it equals the size.. Reset front and back to
		// Zero
		if (size() == 0) {
			front = 0;
			back = 0;
		}

		// Reset front to 0 if it is equal to the length of the array -1
		else if (front == this.circularQueue.length) {
			front = 0;
		}
		return number;
	}

	// Method to check the difference between the front and the back in the array
	public int size() {
		// if the queue hasn't wrapped
		if (front <= back) {
			return this.back - this.front;
		}
		// If the queue has wrapped
		else
			return back - front + this.circularQueue.length;

	}

	// Method to check is the array is empty
	public boolean isEmpty() {
		return size() == 0;
	}

	public boolean isFull() {
		return size() == this.circularQueue.length - 1;
	}

public static void main(String[] args) {
	
		// Creating a stack, NaiveQueue and CircularQueued objects
		CircularQueue circular = new CircularQueue(5);

		// Enqueue method for CircularQueue
		circular.enQueue(15);	
		circular.enQueue(12);
		
		// Dequeue method for CircularQueue
		System.out.println("deQueued " + circular.deQueue());

		// isEmpty method for Queue
		System.out.println("isEmpty " + circular.isEmpty());

		// isFull method for Queue
		System.out.println("isFull " + circular.isFull());
	
	}

}
