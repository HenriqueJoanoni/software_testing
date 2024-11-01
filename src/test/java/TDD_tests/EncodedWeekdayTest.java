package TDD_tests;

import TDD.EncodedWeekday;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EncodedWeekdayTest {

    @Test
    void checkIfWeekdayMonday() {
        EncodedWeekday enWkd = new EncodedWeekday();
        assertEquals("7:00", enWkd.encodedWeekDay(1, false));
    }

    @Test
    void checkIfWeekdayTuesday() {
        EncodedWeekday enWkd = new EncodedWeekday();
        assertEquals("7:00", enWkd.encodedWeekDay(2, false));
    }

    @Test
    void checkIfWeekdayWednesday() {
        EncodedWeekday enWkd = new EncodedWeekday();
        assertEquals("7:00", enWkd.encodedWeekDay(3, false));
    }

    @Test
    void checkIfWeekdayThursday() {
        EncodedWeekday enWkd = new EncodedWeekday();
        assertEquals("7:00", enWkd.encodedWeekDay(4, false));
    }

    @Test
    void checkIfWeekdayFriday() {
        EncodedWeekday enWkd = new EncodedWeekday();
        assertEquals("7:00", enWkd.encodedWeekDay(5, false));
    }

    @Test
    void checkIfWeekdaySaturday() {
        EncodedWeekday enWkd = new EncodedWeekday();
        assertEquals("10:00", enWkd.encodedWeekDay(6, false));
    }

    @Test
    void checkIfWeekdaySunday() {
        EncodedWeekday enWkd = new EncodedWeekday();
        assertEquals("10:00", enWkd.encodedWeekDay(7, false));
    }

    @Test
    void checkIfIsHolidayWeekday() {
        EncodedWeekday enWkd = new EncodedWeekday();
        assertEquals("10:00", enWkd.encodedWeekDay(1, true));
    }

    @Test
    void checkIfIsHolidayWeekend() {
        EncodedWeekday enWkd = new EncodedWeekday();
        assertEquals("off", enWkd.encodedWeekDay(7, true));
    }
}