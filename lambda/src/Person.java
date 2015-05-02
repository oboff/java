import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

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

    public static List<Person> roster = new ArrayList<>();
    public static void printRoster() {
        System.out.println("***BEGIN ROSTER***");
        for (Person p : roster) {
            p.printPerson();
        }
        System.out.println("***END ROSTER***");
    }
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
    public void checkPerson5() {
        processPersons(
                roster,
                p -> p.getGender() == Sex.MALE
                && p.getAge() >= 18
                && p.getAge() <= 25,
                p -> p.printPerson()
        );
    }
    public static void processPersons (
            List<Person> roster,
            Predicate<Person> tester,
            Consumer<Person> block) {
        for (Person p : roster) {
            if (tester.test(p)) {
                block.accept(p);
            }
        }
    }

    public void checkPerson4() {
        printPersonsWithPredicate(
                roster,
                p -> p.getGender() == Person.Sex.MALE
                        && p.getAge() >= 18
                        && p.getAge() <= 25
        );
    }

    public void addPerson(String name, int age, Sex gender) {
        Person p = new Person(name, age, gender);
        roster.add(p);
    }

    public static void printPersonsWithPredicate(
            List<Person> roster, Predicate<Person> tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

//    interface Predicate<Person> {
//        boolean test(Person t);
//    }

    public void checkPerson3() {
        printPersons(
                roster,
                (Person p) -> p.getGender() == Sex.MALE
                && p.getAge() >= 18
                && p.getAge() <= 25
        );
    }

    public void checkPerson2() {
        printPersons(
                roster,
                new CheckPerson() {
                    public boolean test(Person p) {
                        return p.getGender() == Person.Sex.MALE
                                && p.getAge() >= 18
                                && p.getAge() <= 25;
                    }
                }
        );
    }

    public void checkPerson() {
        printPersons(roster, new CheckPersonEligibleForSelectiveService());
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