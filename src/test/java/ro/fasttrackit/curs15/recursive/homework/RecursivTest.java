package ro.fasttrackit.curs15.recursive.homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RecursivTest {
    Recursiv recursiv = new Recursiv();

    @Test
    void sum(){
        Recursiv recursiv = new Recursiv();

        assertThat(recursiv.sum(4)).isEqualTo(10);
        assertThat(recursiv.rev("ana")).isEqualTo("ana");
        assertThat(recursiv.even(23)).isEqualTo(132);
    }
}