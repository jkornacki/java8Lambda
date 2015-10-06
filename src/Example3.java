import domain.Person;
import examples.service.PersonGenerator;

import java.util.Comparator;
import java.util.List;

public class Example3 {

    static int abc = 1;


    public static void main(String[] args) {
        PersonGenerator personGenerator = new PersonGenerator();

        List<Person> persons = personGenerator.generateExamplePerson();

        System.out.println("Przed sortowaniem");

        persons.forEach(System.out::println);
        //Old way
        persons.sort( new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getAge().compareTo(o2.getAge());
                    }
                }
        );
        //New way
        persons.sort((Person p1, Person p2) -> p1.getAge().compareTo(p1.getAge()));

        System.out.println("Po sortowaniu");
        persons.forEach(System.out::println);


    }
}
