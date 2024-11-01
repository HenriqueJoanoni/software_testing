package statement_coverage_tests_2;

import org.junit.jupiter.api.Test;
import statement_coverage_2.Question2;

import static org.junit.jupiter.api.Assertions.*;

class Question2Test {

    @Test
    void voteCheckMajor() {
        Question2 q2 = new Question2();
        String expected = "You are eligible to Vote! :)";
        assertEquals(expected, q2.voteCheck(20));
    }

    @Test
    void voteCheckUnderage() {
        Question2 q2 = new Question2();
        String unexpected = "You are not eligible to Vote! :(";
        assertEquals(unexpected, q2.voteCheck(17));
    }
}