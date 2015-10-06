package examples.example1;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamReduceDemo {
	
	public static void main(String[] args) {
		int sum = Stream.of(1, 2, 3, 4, 5).reduce(1, (acc, i) -> acc + i);
		System.out.println(sum);
		
		int sum2 = IntStream.rangeClosed(1, 5).sum();
		System.out.println(sum2);
		
		int mult = IntStream.rangeClosed(1, 5).reduce(1, (acc, i) -> acc * i);
		System.out.println(mult);
	}
}
