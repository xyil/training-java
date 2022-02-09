package stream;

import java.util.stream.IntStream;

public class ParallelSample {
	public static void main(String[] args) {
		System.out.println("Parallel");
		
		IntStream range = IntStream.rangeClosed(1, 10);
		IntStream rangeParallel = range.parallel();
		System.out.println(rangeParallel.isParallel());
		rangeParallel.parallel().forEach(System.out::println);
		
	}
}
