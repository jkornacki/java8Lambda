package examples.example3;

import java.util.stream.Stream;

/**
 * This example shows how stream operations order is processed
 * 
 * @author toto
 *
 */
public class ProcessingOrderExample {

	public static void main(String[] args) {
		orderWithSortedOperation();
	}

	/**
	 * Intermediate operations will only be executed when a terminal operation is present.
	 */
	private static void emptyOutput() {
		Stream.of("1", "2", "3", "4", "5").filter(s -> {
			System.out.println("filter: " + s);
			return true;
		});
	}

	private static void nonEmptyOutput() {
		Stream.of("1", "2", "3", "4", "5").filter(s -> {
			System.out.println("filter: " + s);
			return true;
		}).forEach(s -> System.out.println("forEach: " + s));
	}
	
	private static void whyItWorksThatWay() {
		Stream.of("d2", "c2", "a1", "b3", "c").map(s -> {
			System.out.println("map: " + s);
			return s.toUpperCase();
		}).anyMatch(s -> {
			System.out.println("anyMatch: " + s);
			return s.startsWith("A");
		});
	}
	
	// IMPORTANT ORDER
	
	private static void orderExample() {
		
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return s.startsWith("A");
	    })
	    .forEach(s -> System.out.println("forEach: " + s));
		
		// vs
		
		Stream.of("d2", "a2", "b1", "b3", "c")
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return s.startsWith("a");
	    })
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .forEach(s -> System.out.println("forEach: " + s));
	}
	
	private static void orderWithSortedOperation() {
		Stream.of("d2", "a2", "b1", "a3", "c")
	    .sorted((s1, s2) -> {
	        System.out.printf("sort: %s; %s\n", s1, s2);
	        return s1.compareTo(s2);
	    })
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return s.startsWith("a");
	    })
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .forEach(s -> System.out.println("forEach: " + s));
		
		// vs
		System.out.println("VS");
		
		Stream.of("d2", "a2", "b1", "a3", "c")
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return s.startsWith("a");
	    })
	    .sorted((s1, s2) -> {
	        System.out.printf("sort: %s; %s\n", s1, s2);
	        return s1.compareTo(s2);
	    })
	    .map(s -> {
	        System.out.println("map: " + s);
	        return s.toUpperCase();
	    })
	    .forEach(s -> System.out.println("forEach: " + s));
	}
	
	
}
