//Nwafor Chimnadindu Kingsley 3017499
package Assignment_3_OOD;

public class CurrentAccount extends Account {

	// declared attribute of this class
	double overdraft;

	public CurrentAccount(int accountNumber, double accountBalance) {
		super(accountNumber, accountBalance);
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
			System.out.println("\nThe account number: " + accountNumber + " Have been debited" + "\nCurrent Balance is: " + accountBalance);
		}

	}
}
