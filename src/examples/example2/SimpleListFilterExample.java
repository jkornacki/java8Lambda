package examples.example2;

import domain.Developer;
import domain.Language;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Simple list filtering example using streams
 * 
 * @author toto
 *
 */
public class SimpleListFilterExample {

	/**
	 * Filter Java developers using earlier Java version
	 * 
	 * @return
	 */
	public List<Developer> filterJavaDevelopers(List<Developer> developers) {
		List<Developer> javaDevelopers = new ArrayList<>();

		for (Developer dev : developers) {
			if (dev.getProgrammingLanguages().contains(Language.JAVA)) {
				javaDevelopers.add(dev);
			}
		}

		return javaDevelopers;
	}

	/**
	 * Filter Java developers using Java 8 streams
	 * 
	 * @return
	 */
	public List<Developer> filterJavaDevelopersLikeABoss(
			List<Developer> developers) {
		return developers
				.stream()
				.filter(dev -> dev.getProgrammingLanguages().contains(Language.JAVA))
				.collect(Collectors.toList());
	}

}
