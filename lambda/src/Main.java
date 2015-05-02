public class Main {

    public static void main(String[] args) {

        Person p = new Person();

        p.addPerson("Jim", 18, Person.Sex.MALE);
        p.addPerson("Julie", 34, Person.Sex.FEMALE);
        p.addPerson("Tom", 12, Person.Sex.MALE);
        p.addPerson("Alex", 24, Person.Sex.MALE);
        p.addPerson("Michelle", 21, Person.Sex.FEMALE);

        Person.printRoster();
//        p.checkPerson();
//        p.checkPerson2();
//        p.checkPerson3();
//        p.checkPerson4();
        p.checkPerson5();
    }
}
