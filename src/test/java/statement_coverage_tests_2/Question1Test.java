package statement_coverage_tests_2;

import org.junit.jupiter.api.Test;
import statement_coverage_2.Question1;

import static org.junit.jupiter.api.Assertions.*;

class Question1Test {

    @Test
    void tipValueTest1() {
        Question1 q1 = new Question1();
        double expected = 16.25;
        assertEquals(expected, q1.tipValue(325));
    }

    @Test
    void tipValueTest2() {
        Question1 q1 = new Question1();
        double unexpected = 25.5;
        assertNotEquals(unexpected, q1.tipValue(200));
    }
}