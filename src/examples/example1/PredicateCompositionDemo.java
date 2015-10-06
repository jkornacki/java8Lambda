package examples.example1;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PredicateCompositionDemo {

	
	// Find the sum of all the multiples of 3 or 5 below 1000.
	public static void main(String[] args) {
		
		// traditional way
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		// integer range stream + predicate composition
		IntPredicate isDivBy3 = x -> x % 3 == 0;
		IntPredicate isDivBy5 = x -> x % 5 == 0;
		
		System.out.println(
			IntStream.range(1, 1000)
				.filter(isDivBy3.or(isDivBy5))
				.sum()
		);
	}
}
