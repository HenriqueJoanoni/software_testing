package practical_2;

/**
 * Write a Java method, swap {}, to swap the first 2 letters of a 4-letter string, passed as a parameter,
 * with the last 2 e.g. “ABCD” is swapped to “CDAB”
 */
public class SwapLetters {
    public String swap(String entryStr) {
        String cutString = entryStr.substring(0, 2);
        String resultString = entryStr.substring(2, 4);

        return resultString + cutString;
    }
}
