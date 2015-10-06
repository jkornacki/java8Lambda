package examples.example4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("1", "2", "3");
		System.out.println(list.stream()
					.map(v -> addPrefix("A", v))
					.map(v -> addPrefix("B", v))
					.collect(Collectors.toList()));
		

	}

	private static String addPrefix(String string, String v) {		
		return v + string;
	}
}
