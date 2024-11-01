package practical_2_tests;

import org.junit.jupiter.api.Test;
import practical_2.TempConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TempConverterTest {

    @Test
    void convertCelsiusToFarenheit() {
        TempConverter tmp = new TempConverter();
        int tempA = 0;
        int tempB = 0;
        double expected = 32.0;
        double actual = tmp.tempConvert(tempA, tempB);
        assertEquals(expected, actual);
    }

}