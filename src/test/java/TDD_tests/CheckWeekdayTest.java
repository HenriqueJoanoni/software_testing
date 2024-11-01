package TDD_tests;

import TDD.CheckWeekday;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckWeekdayTest {

    @Test
    void checkMonday() {
        CheckWeekday wkd = new CheckWeekday();
        int wdkParam = 1;
        String expect = "[Monday] – it’s the beginning of the week";
        String actual = wkd.checkWeekday(wdkParam);
        assertEquals(expect, actual);
    }

    @Test
    void checkTuesday() {
        CheckWeekday wkd = new CheckWeekday();
        int wdkParam = 2;
        String expect = "[Tuesday] – only 3 days till Friday";
        String actual = wkd.checkWeekday(wdkParam);
        assertEquals(expect, actual);
    }

    @Test
    void checkWednesday() {
        CheckWeekday wkd = new CheckWeekday();
        int wkdParam = 3;
        String expect = "[Wednesday] – only 2 days till Friday";
        String actual = wkd.checkWeekday(wkdParam);
        assertEquals(expect, actual);
    }

    @Test
    void checkThursday() {
        CheckWeekday wkd = new CheckWeekday();
        int wkdParam = 4;
        String expect = "[Thursday] – only 1 day till Friday";
        String actual = wkd.checkWeekday(wkdParam);
        assertEquals(expect, actual);
    }

    @Test
    void checkFriday() {
        CheckWeekday wkd = new CheckWeekday();
        int wkdParam = 5;
        String expect = "Friday";
        String actual = wkd.checkWeekday(wkdParam);
        assertEquals(expect, actual);
    }

    @Test
    void checkSaturday() {
        CheckWeekday wkd = new CheckWeekday();
        int wkdParam = 6;
        String expect = "[Saturday] - it's the weekend";
        String actual = wkd.checkWeekday(wkdParam);
        assertEquals(expect, actual);
    }

    @Test
    void checkSunday() {
        CheckWeekday wkd = new CheckWeekday();
        int wkdParam = 7;
        String expect = "[Sunday] - it's the weekend";
        String actual = wkd.checkWeekday(wkdParam);
        assertEquals(expect, actual);
    }
}