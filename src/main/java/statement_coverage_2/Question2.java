package statement_coverage_2;

/**
 * 2. Using Test-first programming…… use the red/green/refactor approach to create the tests and a method, voteCheck(),
 * that receives a user’s age as a parameter and returns the message:
 * <p>
 * ◦ “You are not eligible to Vote” if an age under 18 is entered.
 * <p>
 * • Otherwise “You are eligible to Vote” is returned.
 * <p>
 * Use comments in the test methods to identify the subset of tests required to achieve 100% statement coverage.
 */

public class Question2 {
    public String voteCheck(int age) {
        if (age < 18) {
            return "You are not eligible to Vote! :(";
        }

        return "You are eligible to Vote! :)";
    }
}
