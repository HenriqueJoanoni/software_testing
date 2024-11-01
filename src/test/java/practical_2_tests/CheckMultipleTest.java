package practical_2_tests;

import org.junit.jupiter.api.Test;
import practical_2.CheckMultiple;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckMultipleTest {

    @Test
    void checkIfMultipleOf3() {
        System.out.println("Check if an integer is multiple of 3");
        CheckMultiple chk = new CheckMultiple();
        int inputNumber = 5;
        boolean expected = true;
        boolean actResult = chk.multiple(inputNumber);
        assertEquals(expected, actResult);
    }

    @Test
    void checkIfMultipleOf5() {
        System.out.println("Check if an integer is multiple of 5");
        CheckMultiple chk = new CheckMultiple();
        int inputNumber = 3;
        boolean expect = true;
        boolean actResult = chk.multiple(inputNumber);
        assertEquals(expect, actResult);
    }

    @Test
    void checkIfNotMultipleOf3() {
        System.out.println("Check if it's not a multiple of 3");
        CheckMultiple chk = new CheckMultiple();
        int inputNumber = 7;
        boolean expect = false;
        boolean actResult = chk.multiple(inputNumber);
        assertEquals(expect, actResult);
    }

    @Test
    void checkIfNotMultipleOf5() {
        System.out.println("Check if it's not a multiple of 5");
        CheckMultiple chk = new CheckMultiple();
        int inputNumber = 8;
        boolean expect = false;
        boolean actResult = chk.multiple(inputNumber);
        assertEquals(expect, actResult);
    }
}