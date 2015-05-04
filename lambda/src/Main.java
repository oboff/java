import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Person p = new Person();

//        p.addPerson("Jim", 18, Person.Sex.MALE);
//        p.addPerson("Julie", 34, Person.Sex.FEMALE);
//        p.addPerson("Tom", 12, Person.Sex.MALE);
//        p.addPerson("Alex", 24, Person.Sex.MALE);
//        p.addPerson("Michelle", 21, Person.Sex.FEMALE);

//        p.printRoster();
//        p.checkPerson();
//        p.checkPerson2();
//        p.checkPerson3();
//        p.checkPerson4();
//        p.checkPerson5();
//        p.checkPerson6();
//        p.checkPerson7();

        List<Person> roster = Person.createRoster();
        Person[] rosterAsArray = roster.toArray(new Person[roster.size()]);
        Arrays.sort(rosterAsArray, (a, b) -> Person.compareByAge(a, b));
        Collections.reverse(Arrays.asList(rosterAsArray));

        Arrays.sort(rosterAsArray, Person::compareByAge);
        for (int i = 0; i < rosterAsArray.length; i++) rosterAsArray[i].printPerson();

        System.out.println(roster.get(0).isLargerThan(roster.get(1)));
    }
}
