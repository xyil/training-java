package exception;

public class NameException extends Exception {
	public NameException(String message) {
		System.out.println(message);
	}
	
	public String toString() {
		return "Name must be between 10-15 characters long";
	}
}
