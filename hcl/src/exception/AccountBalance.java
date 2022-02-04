package exception;

import exception.InSufficientBalanceException;

public class AccountBalance {
	
	private double balance;
	

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) throws InSufficientBalanceException {
		if (amount > balance) 
			throw new InSufficientBalanceException("");
		balance -= amount;
	}
}
