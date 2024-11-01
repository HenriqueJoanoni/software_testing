package practical_2_tests;

import org.junit.jupiter.api.Test;
import practical_2.SwapLetters;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SwapLettersTest {

    @Test
    void checkSwapOfLetters() {
        System.out.println("Check if the letters will be swapped");
        String entryString = "ABCD";
        SwapLetters swp = new SwapLetters();
        String exp = "CDAB";
        String actual = swp.swap(entryString);
        assertEquals(exp, actual);
    }

    @Test
    void checkSwapOfNewLetters() {
        System.out.println("Check if the function will swap a new sequence of letters");
        String entryString = "JHPJ";
        SwapLetters swp = new SwapLetters();
        String exp = "PJJH";
        String actual = swp.swap(entryString);
        assertEquals(exp, actual);
    }

}