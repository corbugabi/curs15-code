package ro.fasttrackit.curs15.homeworkCurs15;

public class PersonMain {
    public static void main(String[] args) {
        PersonService personService = new PersonService();

        System.out.println(personService.addPerson(10,"ana",12));
        System.out.println(personService);
    }

}
