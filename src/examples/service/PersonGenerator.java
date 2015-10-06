package examples.service;

import domain.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonGenerator {

    public List<Person> generateExamplePerson() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Jan","Kowalski",21));
        persons.add(new Person("Jakub","Kowalczyk",21));
        persons.add(new Person("Piotr","Dudek",20));
        persons.add(new Person("Maciej","Zawadzki",20));
        persons.add(new Person("Julian","Jaboobski",20));
        persons.add(new Person("Julia","Baran",40));
        persons.add(new Person("Marta","Bok",10));
        persons.add(new Person("Daria","Michalska",35));
        persons.add(new Person("Jedrzej","Urbanski",61));
        persons.add(new Person("Anna","Mazur",22));
        return persons;
    }
}
