package practical_2;

public class CheckMultiple {
    /**
     * Write a Java method, multiple {}, to check whether an integer value, passed as a parameter, is a multiple of 3 or 5.
     *
     * @param entryParam int
     * @return boolean
     */
    public boolean multiple (int entryParam) {
        return entryParam % 3 == 0 || entryParam % 5 == 0;
    }
}
