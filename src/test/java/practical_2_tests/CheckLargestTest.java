package practical_2_tests;

import org.junit.jupiter.api.Test;
import practical_2.CheckLargest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckLargestTest {

    @Test
    void checkLargestParam1() {
        System.out.println("Check if the param1 is the largest");
        int param1 = 10;
        int param2 = 5;
        int param3 = 2;
        CheckLargest chk = new CheckLargest();
        int expect = 10;
        int actual = chk.checkLargest(param1, param2, param3);
        assertEquals(expect, actual);
    }

    @Test
    void checkLargestParam2() {
        System.out.println("Check if the param2 is the largest");
        int param1 = 2;
        int param2 = 20;
        int param3 = 10;
        CheckLargest chk = new CheckLargest();
        int expect = 20;
        int actual = chk.checkLargest(param1, param2, param3);
        assertEquals(expect, actual);
    }

    @Test
    void checkLargestParam3() {
        System.out.println("Check if the param3 is the largest");
        int param1 = 7;
        int param2 = 9;
        int param3 = 12;
        CheckLargest chk = new CheckLargest();
        int expect = 12;
        int actual = chk.checkLargest(param1, param2, param3);
        assertEquals(expect, actual);
    }
}