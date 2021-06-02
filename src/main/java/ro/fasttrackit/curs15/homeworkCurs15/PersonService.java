package ro.fasttrackit.curs15.homeworkCurs15;

import java.util.ArrayList;
import java.util.List;

public class PersonService {
    private final List<Person> persons = new ArrayList<>();

    public Person addPerson(int id, String name, int age) {
        Person result = new Person(id, name, age);

        persons.add(result);
        return result;
    }
}
