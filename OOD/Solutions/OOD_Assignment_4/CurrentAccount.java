//Nwafor Chimnadindu Kingsley 3017499
package Assignment_4_OOD;

import Assignment_4_OOD.Account;

public class CurrentAccount extends Account {

	// declared attribute of this class
	double overdraft;
	static int currentAccountCreated = 0;

	public CurrentAccount(int accountNumber, double accountBalance) {
		super(accountNumber, accountBalance);
		currentAccountCreated++;
	}

	// The abstract method
	public void printAccountInfo() {
		System.out.println("Account: Current Account" + "\nAccount Number: " + Account.accountNumber + "\nBalance:" + Account.accountBalance);
	}

	/** Create static method displayNumberOfAccounts */
	public static void displayNumberOfAccounts() {
		System.out.println("Total Current Accounts = " + currentAccountCreated);
	}

	public static void withdrawFunds(double withdraw) {
		// Assigns a value to the overdraft
		double overdraft = -accountBalance;

		if ((Account.accountBalance - withdraw) < overdraft) {
			System.out.println("You cannot withdraw beyound your overdraft");
		} else {
			// Subtracts the withdrawer from the account balance
			accountBalance = (Account.accountBalance - withdraw);
			// prints out the new balance
			System.out.println("\nThe account number: " + accountNumber + " Have been debited" + " €" + withdraw);
		}

	}
}
