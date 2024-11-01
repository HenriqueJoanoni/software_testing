package statement_coverage_2;

/**
 * 4. Using Test-first programming…… use the red/green/refactor approach to create the tests and a method, discountCheck(), that accepts a person’s age as a parameter and
 * ◦ Returns the message “You are entitled to a Junior discount” if an age under 16 is entered.
 * • Returns the message “You are entitled to a Pensioner discount” if an age 65 or above is entered.
 * • Otherwise returns the message “You must pay full price”.
 * Use comments in the test methods to identify the subset of tests required to achieve 100% statement coverage.
 */
public class Question4 {
    public String discountCheck(int age) {
        if (age < 16) {
            return "You are entitled to a Junior discount!";
        } else if (age >= 65) {
            return "You are entitled to a Pensioner discount!";
        }
        return "You must pay full price!";
    }
}
