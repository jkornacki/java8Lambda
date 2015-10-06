import domain.Person;
import examples.service.PersonGenerator;

import java.util.List;

/**
 * Created by P on 2015-10-05.
 */
public class Example5 {

    public static void main(String[] args) {
        PersonGenerator personGenerator = new PersonGenerator();

        List<Person> persons = personGenerator.generateExamplePerson();

        persons.forEach(
                (p) -> {
                    System.out.println(p);
                });

    }
}





