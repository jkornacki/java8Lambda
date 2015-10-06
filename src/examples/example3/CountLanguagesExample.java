package examples.example3;

import examples.example2.Developer;
import examples.example2.Language;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



/** 
 * Count how many developers use each language.
 */
public class CountLanguagesExample {

	public Map<Language, Long> countLanguagesUsingLoops(List<Developer> developers) {
		Map<Language, Long> countByLanguage = new HashMap<>();
		for (Developer dev : developers) {
			for (Language lang : dev.getProgrammingLanguages()) {
				Long count = countByLanguage.get(lang);
				if (count == null) {
					count = (long) 0;
				}
				countByLanguage.put(lang, ++count);
			}
		}
		return countByLanguage;
	}
	
	public Map<Language, Long> countLanguagesUsingStream(List<Developer> developers) {
		return developers.stream()
			.flatMap(dev -> dev.getProgrammingLanguages().stream())
			.collect(Collectors.groupingBy(lang -> lang, Collectors.counting()));
	}
	
	public Map<Language, Long> countLanguagesUsingLoopsAndMapEnhancements(List<Developer> developers) {
		Map<Language, Long> countByLanguage = new HashMap<>();
		for (Developer dev : developers) {
			for (Language lang : dev.getProgrammingLanguages()) {
				countByLanguage.putIfAbsent(lang, (long) 0);
				countByLanguage.compute(lang, (k, v) -> v + 1);
			}
		}
		return countByLanguage;
	}
}
