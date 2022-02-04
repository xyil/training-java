package exception;

import exception.NameException;

public class FullName {

	private String first;
	private String middle;
	private String last;
	
	public FullName(String fullname) throws NameException{
		if (fullname.length() < 10 || fullname.length() > 15) {
			throw new NameException("");
		}
		
		String[] names = fullname.trim().split(" ");
		
		first = names[0];
		
		// troubleshoot: returns null along with rest of middle
		int n = 1;
		while(n < names.length - 1) {
			middle = String.join(" ", middle, names[n]);
			n++;
		}
		
		last = names[names.length - 1];
	}
	
	public String getFirst() {
		return first;
	}
	
	public String getMiddle() {
		return middle;
	}
	
	public String getLast() {
		return last;
	}
}
