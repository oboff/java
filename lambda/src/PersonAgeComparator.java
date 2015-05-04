import java.util.Comparator;

/**
 * Created by orlan_000 on 5/3/2015.
 */
public class PersonAgeComparator implements Comparator<Person>{
    public int compare(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }
}
