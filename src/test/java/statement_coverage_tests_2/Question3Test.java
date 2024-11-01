package statement_coverage_tests_2;

import org.junit.jupiter.api.Test;
import statement_coverage_2.Question3;

import static org.junit.jupiter.api.Assertions.*;

class Question3Test {

    @Test
    void testCardPaymentContactless() {
        Question3 q3 = new Question3();
        String expected = "Contactless";
        assertEquals(expected, q3.cardPayment(10.0, 2.0));
    }

    @Test
    void testCardPaymentPinRequired() {
        Question3 q3 = new Question3();
        String expected = "PIN required";
        assertEquals(expected, q3.cardPayment(40.0, 5.0));
    }
}