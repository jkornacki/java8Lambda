package examples.service;

import domain.Developer;
import domain.Language;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kornaja.
 */
public class DeveloperService {

    public List<Developer> getDevelopers() {
        List<Developer> developers = new ArrayList<>();
        developers.add(new Developer("John", "Scott", 20, Language.JAVA, Language.SCALA));
        developers.add(new Developer("Betty", "Scott", 32, Language.RUBY, Language.JAVA_SCRIPT));
        developers.add(new Developer("Robert", "Carter", 32, Language.GROOVY, Language.JAVA));
        developers.add(new Developer("Tom", "Wood", 41, Language.JAVA, Language.JAVA_SCRIPT, Language.SCALA));
        developers.add(new Developer("Michael", "Beer", 36, Language.JAVA));
        return developers;

    }
}
