//Nwafor Chimnadindu Kingsley 3017499
package Assignment_4_OOD;

import java.util.Scanner;

import Assignment_4_OOD.Account;

public class Bank {

	public static void main(String[] args) {
		// Scanner to get account number input
		Scanner input = new Scanner(System.in);
		int accountNumber = Account.getAccountNumber();

		CurrentAccount Kingsley = new CurrentAccount(accountNumber, 0);
		System.out.println("\nThe account number: " + accountNumber + "\nAvailable Balance: " + " €" + Account.accountBalance);
		Kingsley.depositFunds();
		Kingsley.printAccountInfo();
		
		
		SavingsAccount Nwafor = new SavingsAccount(accountNumber, 0);
		System.out.println("\n\nThe account number: " + accountNumber + "\nAvailable Balance: " + " €" + Account.accountBalance);
		Nwafor.withdrawFunds();
		Nwafor.printAccountInfo();
		
		// Displays the number of object created
		CurrentAccount.displayNumberOfAccounts();
		SavingsAccount.displayNumberOfAccounts();

	}

}