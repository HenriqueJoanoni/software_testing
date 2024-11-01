package statement_coverage_tests_2;

import org.junit.jupiter.api.Test;
import statement_coverage_2.Question4;

import static org.junit.jupiter.api.Assertions.*;

class Question4Test {

    @Test
    void discountCheckUnderage() {
        Question4 q4 = new Question4();
        String expected = "You are entitled to a Junior discount!";
        assertEquals(expected, q4.discountCheck(12));
    }

    @Test
    void discountCheckPensioner() {
        Question4 q4 = new Question4();
        String expected = "You are entitled to a Pensioner discount!";
        assertEquals(expected, q4.discountCheck(70));
    }

    @Test
    void discountCheckMajor() {
        Question4 q4 = new Question4();
        String expected = "You must pay full price!";
        assertEquals(expected, q4.discountCheck(25));
    }
}