package examples.example2;


import domain.Developer;
import domain.Language;
import examples.service.DeveloperService;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Developer predicates
 * 
 * @author toto
 *
 */
public class DeveloperPredicates {

	/**
	 * Is developer older than 18 years
	 * 
	 * @return
	 */
	public static Predicate<Developer> isAdult() {
		return d -> d.getAge() >= 18;
	}

    public static void main(String[] args) {
        DeveloperService developerService = new DeveloperService();
        List<Developer>  developers = developerService.getDevelopers();

        List<Developer> javaDevelopers = developers.stream().filter(isJavaDeveloper()).collect(Collectors.toList());

        javaDevelopers.forEach(System.out::println);
    }

    /**
	 * Is developer older than @param age
	 * 
	 * @return
	 */
	public static Predicate<Developer> isOlderThan(Integer age) {
		return d -> d.getAge() > age;
	}

	/**
	 * Produces a predicate that tests if given developer
	 * is a Java developer.
	 */
	public static Predicate<Developer> isJavaDeveloper() {
		return d -> d.getProgrammingLanguages().contains(Language.JAVA);
	}
	
	/**
	 * Filter developers with custom predicate
	 * 
	 * @param developers
	 * @param predicate
	 * @return
	 */
	public static List<Developer> filterDevelopers(List<Developer> developers, Predicate<Developer> predicate) {
        List<Developer> filteredList = new ArrayList<>();
        for(Developer dev : developers) {
            if(predicate.test(dev)) {
                filteredList.add(dev);
            }
        }

        return filteredList;

        // Solution with Stream API
		//return developers.stream().filter(predicate).collect(Collectors.toList());
	}
}
