//Nwafor Chimnadindu Kingsley 3017499
package Assignment_3_OOD;

import Assignment_3_OOD.Account;

//the new class inherits the attribute of the Account class
public class SavingsAccount extends Account {

	// declared attribute of the class
	static double interest;
	static double newBalance;

	public SavingsAccount(int accountNumber, double accountBalance) {
		super(accountNumber, accountBalance);
	}

	double accountBalance = Account.accountBalance;

	public static void display(double accountBalance, double deposit) {

		if (accountBalance > 0) {
			interest = interest(accountBalance);
			newBalance = interest + accountBalance;
			// Prints out the new balance, the interest generated and the current balance
			System.out.println("The account number: " + Account.accountNumber + " Have been credited with:" + deposit);
			System.out.println("The interest (15%) generated is: " + interest);
			System.out.println("Current Balance: " + newBalance);

			// Assigns the current balance as the new account balance
			Account.accountBalance = newBalance;
		} else {
			System.out.println("Available balance is 0, please proceed to deposit");
			Assignment_3_OOD.Account.depositFunds();
		}
	}

	// Interest method created
	public static double interest(double accountBalance) {
		double interest = 0;
		// Gets 15% of the account balance
		interest = accountBalance * 0.15;
		return interest;
	}

}
