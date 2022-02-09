package stream;

import java.util.stream.IntStream;

public class ForEachSample {
	public static void main(String[] args) {
		IntStream.range(1, 10).forEach((n) -> {System.out.println(n*n);});
	}
}
