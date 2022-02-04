/**
 * Utilize a Scanner to input a string that is a name
 * check if length is between 10-15 characters 
 * if true continue, else throw exception
 * separate the string into first, middle, and last names.
 */

package exception;

import java.util.Scanner;

import exception.FullName;
import exception.NameException;


public class NameCLI {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		boolean valid = false;
		
		while (!valid) {
			System.out.println("Enter full name (10-15 characters):");
			FullName name;
			
			try {
				name = new FullName(kb.nextLine());
				System.out.println(String.format(
						"First: %s\n"
						+ "Middle: %s\n"
						+ "Last: %s\n",
						name.getFirst(),
						name.getMiddle(),
						name.getLast()
						));
			} catch (NameException e) {
				System.out.println(e);
			}
		}
		kb.close();
	}

}
