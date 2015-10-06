package examples.example1;

import domain.Person;
import examples.service.PersonGenerator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SortCompareThen {

    public static void main(String[] args) {
        PersonGenerator personGenerator = new PersonGenerator();

        List<Person> persons = personGenerator.generateExamplePerson();

        System.out.println("Przed sortowaniem");

        persons.forEach(System.out::println);

        Collections.sort(persons, Comparator.comparing(Person::getAge).thenComparing(Comparator.comparing(Person::getLastName)));

        System.out.println("Po sortowaniu");
        persons.forEach(System.out::println);

    }
}
