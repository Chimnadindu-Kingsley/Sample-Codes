//Nwafor Chimnadindu Kingsley 3017499
package Assignment_4_OOD;

import Assignment_4_OOD.Account;

//the new class inherits the attribute of the Account class
public class SavingsAccount extends Account {

	// declared attribute of the class
	static double interest;
	static double newBalance;
	static int savingsAccountCreated = 0;

	public SavingsAccount(int accountNumber, double accountBalance) {
		super(accountNumber, accountBalance);
		savingsAccountCreated++;
	}

	double accountBalance = Account.accountBalance;

	public void printAccountInfo() {
		System.out.println("Account: Savings Account" + "\nAccount Number: " + Account.accountNumber + "\nBalance:" + Account.accountBalance);
	}

	/** Create static method displayNumberOfAccounts */
	public static void displayNumberOfAccounts() {
		System.out.println("Total Savings Accounts = " + savingsAccountCreated);
	}

	public static void deposit(double accountBalance, double deposit) {

		if (accountBalance > 0) {
			interest = interest(accountBalance);
			newBalance = interest + accountBalance;
			// Prints out the new balance, the interest generated and the current balance
			System.out.println("The account number: " + Account.accountNumber + " Have been credited with:" + deposit);
			System.out.println("The interest (15%) generated is: " + interest);
			
			// Assigns the current balance as the new account balance
			Account.accountBalance = newBalance;
		} else {
			System.out.println("Available balance is 0, please proceed to deposit");
			Assignment_4_OOD.Account.depositFunds();
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