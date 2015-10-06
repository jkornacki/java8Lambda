package examples.example3;

import java.util.Arrays;
import java.util.List;

/**
 * Functional programming presentation demo
 * 
 * @author toto
 *
 */
public class FunctionalProgrammingExample {

	public static boolean isGreaterThan3(int number) {
		return number > 3;
	}

	public static boolean isEven(int number) {
		return number % 2 == 0;
	}

	public static int doubleIt(int number) {
		return number * 2;
	}

	public static void main(String[] args) {
		// CASE: Find double of the first even number greater than 3
		List<Integer> values = Arrays.asList(1, 2, 3, 5, 4, 6, 7, 8, 9, 10);

		// Imperative programming
		int result = 0;
		for (int v : values) {
			if (v > 3 && v % 2 == 0) {
				result = v * 2;
				break;
			}
		}

		System.out.println(result);

		// Declarative programming
		System.out.println(values.stream()
				.filter(FunctionalProgrammingExample::isGreaterThan3)
				.filter(FunctionalProgrammingExample::isEven)
				.map(FunctionalProgrammingExample::doubleIt)
				.findFirst().orElse(0));

	}

}
