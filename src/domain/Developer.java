package domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by P on 2015-10-06.
 */
public class Developer {
    private Integer age;
    private List<Language> programmingLanguages;
    private String lastName;
    private String firstName;

    public Developer(String lastName, String firstName, Integer age, Language... languages) {
        this.age = age;
        this.programmingLanguages = new ArrayList<>();
        for (Language language : languages) {
            programmingLanguages.add(language);
        }
        this.lastName = lastName;
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "age=" + age +
                ", programmingLanguages=" + programmingLanguages +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Language> getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(List<Language> programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
