package stream;

import java.util.function.Predicate;

public class PredicateSample {
	public static void main(String[] args) {
		Predicate<Integer> greaterthan = n -> (n > 5);
		System.out.println(greaterthan.test(10));
	}
}
