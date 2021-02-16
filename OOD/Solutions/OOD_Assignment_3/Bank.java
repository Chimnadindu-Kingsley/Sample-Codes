//Nwafor Chimnadindu Kingsley 3017499
package Assignment_3_OOD;

import java.util.Scanner;

import Assignment_3_OOD.Account;

public class Bank {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int accountNumber = Account.getAccountNumber();
		System.out.println("The account number: " + accountNumber + "\nStarting Balance: " + Account.accountBalance);
		
		Account Kingsley = new Account(accountNumber, 0);
		
		// Creates a loops to allow the user test the accounts
		int command = 0;
		// Allows the user to run the program 50 times
		while (command <= 50) {
			System.out.print("\nPress: 1 to 'deposite', 2 to 'withdraw', 3 to end 'transaction': ");
			// Stores the command you want in 'value'
			int value = input.nextInt();

			if (value == 1) {
				// Calls on the method to deposit funds
				Kingsley.depositFunds();
			} else if (value == 2) {
				// Calls on the withdraw method
				Kingsley.withdrawFunds();
			} else if (value == 3) {
				// Condition to break out of the loop
				command = 50;
			} else {
				System.out.println("Wrong Command!!!");
			}
			// Increment the amount of command
			command++;
		}

	}

}
