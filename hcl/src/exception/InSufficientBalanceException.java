package exception;

public class InSufficientBalanceException extends Exception {
	public InSufficientBalanceException(String message) {
		System.out.println(message);
	}
	
	public String toString() {
		return "Insufficient Balance";
	}
}