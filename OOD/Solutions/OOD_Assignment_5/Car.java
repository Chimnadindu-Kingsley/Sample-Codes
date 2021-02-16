//Nwafor Chimnadindu Kingsley 3017499
package Assignment_5;

public class Car implements Taxable {

	// attributes of the car class
	private String make;
	private String model;
	private double engine_size;

	// A constructor of 3 argument: make, model and engin_size
	public Car(String make, String model, double engine_size) {
		this.make = make;
		this.model = model;
		this.engine_size = engine_size;

	}

	// Override
	@Override

	// The calculate tax method
	public double calculateTax() {
		double tax = 0;

		// Condition if the engin size is less than 1000
		if (engine_size < 1000) {
			tax = 200;
			// Condition if the engine size is from 1000 to 2000
		} else if (engine_size >= 1000 && engine_size <= 2000) {
			tax = 900;
			// Condition if the engine size is greater than 2000
		} else {
			tax = 1800;
		}
		return tax;

	}

	// Override
	@Override
	// The print tax method
	public void printTax() {
		System.out.println("Car Name: " + make + "\nCar Model: " + model + "\nEngine size: " + engine_size + "\nTax: "
				+ calculateTax() + "\n");

	}

}
