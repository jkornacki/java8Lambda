package examples.example0;


import domain.Developer;
import domain.Language;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveIfExample {

    public static void main(String[] args) {
        
        List<Developer> developers1 = Arrays.asList(
                new Developer("John", "Scott", 20, Language.JAVA, Language.SCALA),
                new Developer("Betty", "Scott", 32, Language.RUBY, Language.JAVA_SCRIPT),
                new Developer("Robert", "Carter", 32, Language.GROOVY, Language.JAVA),
                new Developer("Tom", "Wood", 41, Language.JAVA, Language.JAVA_SCRIPT, Language.SCALA),
                new Developer("Michael", "Beer", 36, Language.JAVA));
        
//        // old way
//        for (Iterator<Developer> it = developers1.iterator(); it.hasNext(); ) {
//            Developer d = it.next();
//            if (!d.getProgrammingLanguages().contains(Language.JAVA)) {
//                it.remove();
//            }
//        }
//
//        System.out.println(developers1);

        List<Developer> developers2 = Arrays.asList(
                new Developer("John", "Scott", 20, Language.JAVA, Language.SCALA),
                new Developer("Betty", "Scott", 32, Language.RUBY, Language.JAVA_SCRIPT),
                new Developer("Robert", "Carter", 32, Language.GROOVY, Language.JAVA),
                new Developer("Tom", "Wood", 41, Language.JAVA, Language.JAVA_SCRIPT, Language.SCALA),
                new Developer("Michael", "Beer", 36, Language.JAVA));
        
        // new way
        developers2.removeIf(d -> !d.getProgrammingLanguages().contains(Language.JAVA));
        
        System.out.println(developers2);
        
        
        
    }
}
