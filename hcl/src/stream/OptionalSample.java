package stream;

import java.util.Optional;

public class OptionalSample {
	public static void main(String[] args) {
		String[] str = new String[10];
		Optional<String> checkNull = Optional.ofNullable(str[5]);
		if(checkNull.isPresent()) {
			String s = str[5].toLowerCase();
			System.out.print(s);
		} else
			System.out.println("string is null");
	}

}
