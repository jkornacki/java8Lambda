package examples.example2;

import domain.Developer;
import domain.Language;
import examples.service.DeveloperService;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by kornaja.
 */
public class ToMapExample {

    public static void main(String[] args) {
        DeveloperService developerService = new DeveloperService();
        List<Developer> developers = developerService.getDevelopers();

        Map<Developer, List<Language>> developerLanguageMap = developers.stream()
                .collect(Collectors.toMap(d -> d, d -> d.getProgrammingLanguages()));

        developerLanguageMap.forEach((developer, languages) -> {
            System.out.println("---");
            System.out.println("Dev: "+developer.getFirstName()+" "+developer.getLastName());
            System.out.println("Lang: "+languages);
        });
    }
}
