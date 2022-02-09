package stream;

import java.util.function.BiFunction; 

public class BiFunctionSample {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
		
		System.out.println(add.apply(2, 5));
	}
}
