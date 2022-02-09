package stream;

import java.util.stream.IntStream;

public class LambdaSample{
	public static void main(String[] args) {
		IntStream.range(0, 5).forEach((n) -> {System.out.println(n);});
	}
}