package examples.example3;

import static pl.jcommerce.examples.predicates.DeveloperPredicates.filterDevelopers;
import static pl.jcommerce.examples.predicates.DeveloperPredicates.isAdult;
import static pl.jcommerce.examples.predicates.DeveloperPredicates.isJavaDeveloper;
import static pl.jcommerce.examples.predicates.DeveloperPredicates.isOlderThan;

import java.util.List;

import pl.jcommerce.examples.model.Developer;

/**
 * Predicates example
 * 
 * @author toto
 *
 */
public class PredicateExample {
	
	/**
	 * Filter adult developers
	 * 
	 * @param developers
	 * @return
	 */
	public List<Developer> filterAdultDevelopers(List<Developer> developers) {
		return filterDevelopers(developers, isAdult());
	}
	
	/**
	 * Filter developers older than @param age
	 * 
	 * @param developers
	 * @return
	 */
	public List<Developer> filterDevelopersOlderThan(Integer age, List<Developer> developers) {
		return filterDevelopers(developers, isOlderThan(age));
	}
	
	/**
	 * Filter developers older than 35 and are Jave developers 
	 * 
	 * @param developers
	 * 
	 * @see DeveloperPredicates#isOlderThan(Integer)
	 * @see DeveloperPredicates#isJavaDeveloper()
	 */
	public List<Developer> filterOldJavaDevelopers(List<Developer> developers) {
		return filterDevelopers(developers, isOlderThan(35).and(isJavaDeveloper()));
	}
}
