//Nwafor Chimnadindu Kingsley 3017499
package workbook01;

public class Tax {
	
	// Declaring the variables as private.
	private double First_Salary;
	private double Second_Salary;
		
	// Creating a two parameters constructor for the Tax class 
	public Tax(double first, double second) {
		this.First_Salary = first;
		this.Second_Salary = second;			
	}
		
	// Method to sum the first and Second income and further return the total
	public double Combined_Income() {
		double Total = First_Salary + Second_Salary;
		return Total;
	}
		
	// Method to calculate the combined Tax percentage
	public double calculate() {
	double Total = this.First_Salary + this.Second_Salary;
			
		if (Total <= 15000) {
			//To return 0% tax
			return 0.0;
		} else if (Total > 15000 && Total <= 19999.99) {
			//To return 10% tax
			return Total * 0.10; 
		} else if (Total > 20000 && Total <= 29999.99) {
			//To return 20% tax
			return Total * 0.20;
		} else {
			//To return 30% tax
			return Total * 0.30;
		}
	}
}

