package statement_coverage_tests_2;

import org.junit.jupiter.api.Test;
import statement_coverage_2.Question5;

import static org.junit.jupiter.api.Assertions.*;

class Question5Test {

    @Test
    void seasonInvalidDateFull() {
        Question5 q5 = new Question5();
        String expected = "Invalid date";
        assertEquals(expected, q5.season(32, 13));
    }

    @Test
    void seasonInvalidDateDay() {
        Question5 q5 = new Question5();
        String expected = "Invalid date";
        assertEquals(expected, q5.season(32, 5));
    }

    @Test
    void seasonInvalidDateMonth() {
        Question5 q5 = new Question5();
        String expected = "Invalid date";
        assertEquals(expected, q5.season(25, 13));
    }

    @Test
    void seasonSpring() {
        Question5 q5 = new Question5();
        String expected = "Spring";
        assertEquals(expected, q5.season(22, 2));
    }

    @Test
    void seasonSummer() {
        Question5 q5 = new Question5();
        String expected = "Summer";
        assertEquals(expected, q5.season(22, 5));
    }

    @Test
    void seasonAutumn() {
        Question5 q5 = new Question5();
        String expected = "Autumn";
        assertEquals(expected, q5.season(22, 8));
    }

    @Test
    void seasonWinter() {
        Question5 q5 = new Question5();
        String expected = "Winter";
        assertEquals(expected, q5.season(22, 11));
    }
}