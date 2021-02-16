//Nwafor Chimnadindu Kingsley 3017499
package Assignment_3_OOD;

import java.util.Scanner;

public class Account {

	// Attributes for the call Account
	static int accountNumber;
	static double accountBalance = 0;

	public Account(int accountNumber, double accountBalance) {
	}

	public static int getAccountNumber() {
		// Takes in an input for the account number
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the account number: ");
		int accountNumber1 = input.nextInt();
		accountNumber = accountNumber1;
		return accountNumber;
	}

	public static void depositFunds() {
		// Request for the amount to be deposited
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amout you want to deposite: ");
		// Stores the amount to be deposited in 'deposit'
		double deposit = input.nextInt();

		// Prompts the user to enter the type of account
		System.out.println("Enter 1 for Savings Account, 2 for Current Account: ");
		// Stores the type of account in 'account'
		int account = input.nextInt();
		// Prints an error message if the user does not enter a valid amount
		if (deposit <= 0) {
			System.out.println("ERROR\nPlease enter a valid amount");
		} else {

			// Sums up the previous balance with the deposit
			accountBalance = accountBalance + deposit;

			// Condition if the account to deposit is current
			if (account == 2) {
				// Prints out the new balance
				System.out.println("\nThe account number: " + accountNumber + " Have been credited with: " + deposit
						+ "\nCurrent Balance is: " + accountBalance);
				// Condition if the account to deposit is savings
			} else {
				SavingsAccount.display(accountBalance, deposit);
			}
		}

	}

	public static void withdrawFunds() {
		// Request for the amount to be withdrawn
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amout you want to withdraw: ");
		// Stores the amount to withdraw in 'withdraw'
		double withdraw = input.nextInt();

		// Prompt the user to enter the account type
		System.out.println("Enter 1 for Savings Account, 2 for Current Account: ");
		// Stores the account type in 'account'
		int account = input.nextInt();

		// Condition if the account to withdraw is savings
		if (account == 1) {
			// Prints an error message if the withdrawer is less than the account balance
			if (withdraw > accountBalance) {
				System.out.println("Insufficient funds, please retry again");
			} else {
				// Subtracts the withdrawer from the account balance
				accountBalance = accountBalance - withdraw;
				// prints out the new balance
				System.out.println("\nThe account number: " + accountNumber + " Have been debited with: " + withdraw
						+ "\nCurrent Balance is: " + accountBalance);
			}
			// Condition if the account to withdraw is current
		} else {
			CurrentAccount.withdrawFunds(withdraw);
		}

	}
}
