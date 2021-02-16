//Nwafor Chimnadindu Kingsley 3017499
package Assignment_5;

import java.util.ArrayList;

public class Lab5 {

	// main method
	public static void main(String[] args) {

		// Create Array List to hold Taxable object
		ArrayList<Taxable> kingsley_array = new ArrayList<Taxable>();

		// Add Car objects to the array list s
		kingsley_array.add(new Car("Bugatti", "Chiron", 3500));
		kingsley_array.add(new Car("Volkswagen", "Tiguan", 211));

		// Add employee objects to the array list
		kingsley_array.add(new Employee("Nwafor Kingsley", "2255UA758", 100960));
		kingsley_array.add(new Employee("Nwafor Chimnadindu", "2882FP458", 8790));

		// iteration between the ArrayList
		for (Taxable tax : kingsley_array) {

			// print the tax after calling the method
			tax.printTax();
		}
	}

}
