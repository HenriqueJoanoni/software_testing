package practical_1;

/**
 * has been created to tell us whether or not we are allowed to sleep in.
 * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
 * We sleep in if it is not a weekday or we're on vacation.
 * Write the method so that it returns true if we sleep in and false if we don’t.
 * You will also need to write a main method to call this method.
 * Your main method should then display a message indicating whether or not we can sleep in.
 * Test the method through the use of different values for the variables weekday and vacation.
 */
public class Ex2 {
    public static void main(String[] args) {
        boolean sleepCheck = sleepIn(true, true);

        if (sleepCheck) {
            System.out.println("We can sleep in :)");
        } else {
            System.out.println("We're not allowed to sleep in :(");
        }
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday) {
            return true;
        }

        if (vacation) {
            return true;
        }

        return false;
    }
}
