package ro.fasttrackit.curs15.homeworkCurs15;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void validAge(){
        Person person = new Person(1,"Ana",121);



        assertThat(person.getAge()).isEqualTo(121);
    }

    @Test
    void validName(){
        Person person = new Person(1,"Ana",12);

        String result = person.getName("Ana");

        assertThat(result).isEqualTo("Ana");
    }

}