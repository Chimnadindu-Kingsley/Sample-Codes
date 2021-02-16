//Nwafor Chimnadindu Kingsley 3017499
package Assignment_5;

public class Employee implements Taxable, PRSI {

	// attributes of the employee class
	private String name;
	private String ppsNumber;
	private double annualSalary;
	private double salary;

	// A constructor of 3 argument: name, ppsNumber and annualSalary
	public Employee(String name, String ppsNumber, double annualSalary) {
		this.name = name;
		this.ppsNumber = ppsNumber;
		this.annualSalary = annualSalary;
		this.salary = this.annualSalary / 52;
	}

	// Override
	@Override

	// The calculatePRSI method
	public double calculatePRSI() {

		// Condition if the salary is less than 325
		if (salary < 325) {
			return 0;
			//Condition if the salary is greater than 325
		} else {
			return (salary * rate);
		}

	}

	// Override
	@Override
	// The calculate tax method
	public double calculateTax() {

		// Condition if the annual salary is less than 33800
		if (annualSalary <= 33800) {
			return (salary * 0.20d);
		} else {
			// Condition if the annual salary is more than 33800
			return ((annualSalary - 33800) * 0.4 + (33800 * 0.2));
		}
	}

	// The print Tax method
	public void printTax() {
		System.out.println("Employee Name: " + name + "\nPPS NO: " + ppsNumber + "\nPRSI: " + calculatePRSI()
				+ "\nTAX: " + calculateTax() + "\n");
		
	}

}
