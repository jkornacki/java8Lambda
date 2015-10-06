import domain.Person;
import examples.service.PersonGenerator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;



/**
 * Created by P on 2015-10-05.
 */
public class Example4 {

    public static void main(String[] args) {
        PersonGenerator personGenerator = new PersonGenerator();

        List<Person> persons = personGenerator.generateExamplePerson();

        System.out.println("Przed sortowaniem");

        persons.forEach(
                (person -> {
                    System.out.println(person);
                }));

        Collections.sort(persons, Comparator.comparing(Person::getAge).thenComparing(Comparator.comparing(Person::getLastName)));

        System.out.println("Po sortowaniu");
        persons.forEach(
                (person -> {
                    System.out.println(person);
                }));

    }
}