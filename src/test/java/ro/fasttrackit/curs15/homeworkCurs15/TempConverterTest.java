package ro.fasttrackit.curs15.homeworkCurs15;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TempConverterTest {

    @Test
    void fahrenheitToCelsius() {
        TempConverter tempConverter = new TempConverter();

        assertThat(TempConverter.fahrenheitToCelsius(100)).isEqualTo(37, Offset.offset(0.8));
        assertThat(TempConverter.fahrenheitToCelsius(50)).isEqualTo(10);
        assertThat(TempConverter.fahrenheitToCelsius(0)).isEqualTo(-17,Offset.offset(0.8));
    }

    @Test
    void celsiusToFahrenheit(){
        TempConverter tempConverter = new TempConverter();

        assertThat(TempConverter.celsiusToFahrenheit(10)).isEqualTo(37,Offset.offset(0.6));
    }
}
