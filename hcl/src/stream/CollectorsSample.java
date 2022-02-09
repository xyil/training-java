package stream;

import java.util.stream.Collectors;
import java.util.Set;
import java.util.stream.IntStream;

public class CollectorsSample {
	
	public static void main(String[] args) {
		Set<Integer> str = IntStream.range(0, 5)
				.map(n -> n * n)
				.mapToObj(n -> (Integer) n)
				.collect(Collectors.toSet());
		
		System.out.println(str);
	}
}
