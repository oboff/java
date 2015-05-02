package thejavatutorial.javaOO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by orlan_000 on 5/2/2015.
 */
public class LambdaExpressions {
    private static ArrayList<Person> personList;

    public void addPerson(String name, int age, Person.Sex sex) {
        Person p = new Person(name, age, sex);
        personList.add(p);
    }

    public Person.Sex addGender() {

    }
}

interface CheckPerson {
    boolean test(Person p);
}

class CheckForSelectiveService implements CheckPerson {
    public boolean test(Person p) {
        return p.getGender() == Person.Sex.MALE &&
                p.getAge() >= 18 &&
                p.getAge() <= 25;
    }
}

class Person {

    public enum Sex {
        MALE, FEMALE
    }

    private String name;
    LocalDate birthday;
    private Sex gender;
    String emailAddress;
    private int age;

    public Person() {}
    public Person(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.gender = sex;
    }

    public int getAge() {
        // ...
        return age;
    }

    public String getName() {
        return name;
    }

    public Sex getGender() {
        return this.gender;
    }

    public void printPerson() {
        // ...
    }
}