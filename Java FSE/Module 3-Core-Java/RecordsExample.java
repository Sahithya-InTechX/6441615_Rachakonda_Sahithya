import java.util.List;
import java.util.stream.Collectors;

record Person(String name, int age) {}

public class RecordsExample {
    public static void main(String[] args) {
        Person p1 = new Person("Sahithya", 21);
        Person p2 = new Person("Racha", 25);
        Person p3 = new Person("Anil", 17);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        List<Person> people = List.of(p1, p2, p3);
        List<Person> adults = people.stream()
                .filter(person -> person.age() >= 18)
                .collect(Collectors.toList());

        System.out.println("Adults: " + adults);
    }
}
