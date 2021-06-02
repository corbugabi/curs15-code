package ro.fasttrackit.curs15.recursive;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class SumNumbersTest {

    @Test
    void testSumNumbers() {
        SumNumbers sumNumbers = new SumNumbers();

        assertThat(sumNumbers.sum(0)).isEqualTo(0);
        assertThat(sumNumbers.sum(1)).isEqualTo(1);
        assertThat(sumNumbers.sum(10)).isEqualTo(55);
        assertThat(sumNumbers.sum(1132)).isEqualTo(641278);
    }


}