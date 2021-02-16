//Nwafor Chimnadindu Kingsley 3017499
package Assignment_8_OOD;

// java imports
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Lab8 {

	// Main method with throw exception to catch error
	public static void main(String[] args) throws IOException {
		// Create an Array list for customer
		ArrayList<Customer> customersList = new ArrayList<Customer>();

		// Populate the array list with customer
		customersList.add(new Customer("Nwafor Kingsley", 24, 6181684));
		customersList.add(new Customer("Samuel Jacob", 35, 5847459));
		customersList.add(new Customer("Chris Zeto", 16, 7585456));
		customersList.add(new Customer("Donald Trump", 49, 2145587));
		customersList.add(new Customer("Leo Messi", 31, 3655874));

		// Sort the customers list
		Collections.sort(customersList);

		// print writer
		PrintWriter out = null;
		out = new PrintWriter(new FileWriter("OutFile.txt"));
		for (int i = 0; i < customersList.size(); i++) {
			out.println(customersList.get(i).toString());
			out.println("Test");
		}
		if (out != null) {
			out.close();
		}
		// Print line
		System.out.println("File Created");

	}

}
