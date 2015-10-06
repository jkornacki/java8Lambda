package examples.example3;

import examples.example2.Developer;

import java.util.Comparator;

public class CompositeComparatorExample {

	public Comparator<Developer> createCompositeComparatorOldWay() {
		return new Comparator<Developer>() {

			@Override
			public int compare(Developer d1, Developer d2) {
				int result = d1.getLastName().compareTo(d2.getLastName());
				if (result != 0) {
					return result;
				}
				result = d1.getFirstName().compareTo(d2.getFirstName());
				if (result != 0) {
					return result;
				}
				return d1.getAge().compareTo(d2.getAge());
			}
		};
	}
	
	public Comparator<Developer> createCompositeComparatorNewWay() {
		return Comparator.comparing(Developer::getLastName)
				.thenComparing(Developer::getFirstName)
				.thenComparing(Developer::getAge);
	}
	
}
