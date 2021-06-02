package ro.fasttrackit.curs15;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("sum method works")
    void simpleSum() {
        assertThat(calculator.sum(1, 1)).isEqualTo(2);
        assertThat(calculator.sum(3, 2)).isEqualTo(5);
        assertThat(calculator.sum(-3, 2)).isEqualTo(-1);
    }

    @Test
    @DisplayName("minus method works")
    void simpleDiff() {
        assertThat(calculator.dif(2, 1)).isEqualTo(1);
        assertThat(calculator.dif(5, 1)).isEqualTo(4);
        assertThat(calculator.dif(-1, 2)).isEqualTo(-3);
    }

    @Test
    @DisplayName("imultiply method works")
    void simpleImpartire() {
        assertThat(calculator.impartit(2, 2)).isEqualTo(1);
        assertThat(calculator.impartit(1, 0)).isEqualTo(0);
        assertThat(calculator.impartit(-10, 3)).isEqualTo(-3.33, Offset.offset(.1));
    }

    @Test
    @DisplayName("divison method works")
    void simpleInm() {
        assertThat(calculator.inm(1, 1)).isEqualTo(1);
        assertThat(calculator.inm(2, 10)).isEqualTo(20);
        assertThat(calculator.inm(2, 0)).isEqualTo(0);
        assertThat(calculator.inm(0, 2)).isEqualTo(0);
    }
}
