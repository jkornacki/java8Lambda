package examples.example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectToListDemo {

    public static void main(String[] args) {
        List<String> progLangs = Arrays.asList("c#", "java", "python", "scala");
        
        // old way
        List<String> filteredProgLangs = new ArrayList<>();
        for (String lang : progLangs) {
            if (lang.contains("a")) {
                filteredProgLangs.add(lang);
            }
        }
        
        // example1 way
        List<String> filteredProgLangs2 = progLangs.stream()
                .filter(lang -> lang.contains("a"))
                .collect(Collectors.toList());
        
        System.out.println(progLangs);
        System.out.println(filteredProgLangs);
        System.out.println(filteredProgLangs2);
    }
}
