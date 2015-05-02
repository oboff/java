public class Main {

    public static void main(String[] args) {

        Person p = new Person();

        p.addPerson("Jim", 18, Person.Sex.MALE);
        p.addPerson("Julie", 34, Person.Sex.FEMALE);
        p.addPerson("Tom", 12, Person.Sex.MALE);
        p.addPerson("Alex", 24, Person.Sex.MALE);

        p.checkPerson();

    }
}
