/**
 * Write a Java program to handle exception handling mechanism through
 * user-oriented exception handling let's say you deposit 600 $
 * in favor saving account then you withdraw 100 $ from your account,
 * now you had 500 $ remaining with you, but if you want to withdraw
 * 600 $ again, then your program should throw InSufficientBalance Exception
 */

package exception;

import java.util.Scanner;

import exception.InSufficientBalanceException;
import exception.AccountBalance;

public class AccountBalanceCLI {

	public static void main(String[] args) {
		
		AccountBalance account = new AccountBalance();
		Scanner kb = new Scanner(System.in);
		
		int option = 0;
		
		while (option != 3) {
			
			System.out.println(
					String.format("Menu\n"
							+ "\t(0) balance\n"
							+ "\t(1) deposit\n"
							+ "\t(2) withdraw\n"
							+ "\t(3) exit"
							));
			
			option = kb.nextInt();
			
			// Balance
			if (option == 0) {
				System.out.println("Current balance: " + account.getBalance());
				
			// Deposit
			} else if (option == 1) {
				System.out.println("Enter deposit amount: ");
				double amount = kb.nextDouble();
				account.deposit(amount);
				System.out.println("Current balance: " + account.getBalance());
				
			// Withdraw
			} else if (option == 2) {
				System.out.println("Enter withdraw amount: ");
				double amount = kb.nextDouble();
				try {
					account.withdraw(amount);
				} catch (InSufficientBalanceException e) {
					System.out.println(e);
					System.out.println("Current balance: " + account.getBalance());
				}
				
			// Invalid option
			} else if (option != 3) {
				System.out.println("Invalid. Please select an option from the menu.");
			}
		}
		kb.close();
		System.out.println("Exit");

	}

}
