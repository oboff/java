import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by orlan_000 on 5/2/2015.
 */

public class Person {
    public Person() {}
    public Person(String name, int age, Sex gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    int age;

    public static List<Person> personList = new ArrayList<>();

    public int getAge() {
        // ...
        return age;
    }

    public String getName() {
        return name;
    }

    private Sex getGender() {
        return gender;
    }

    public void printPerson() {
        System.out.println(this.getName() + " " + this.getAge() + " " + this.getGender());
    }

    public void addPerson(String name, int age, Sex gender) {
        Person p = new Person(name, age, gender);
        personList.add(p);
    }

    public void checkPerson() {
        printPersons(personList, new CheckPersonEligibleForSelectiveService());
    }

    class CheckPersonEligibleForSelectiveService implements CheckPerson {
        public boolean test(Person p) {
            return p.gender == Person.Sex.MALE &&
                    p.getAge() >= 18 &&
                    p.getAge() <= 25;
        }
    }

    public static void printPersons(
            List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    public static void printPersonsWithinAgeRange(
            List<Person> roster, int low, int high) {
        for (Person p : roster) {
            if (low <= p.getAge() && p.getAge() < high) {
                p.printPerson();
            }
        }
    }

    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }
}