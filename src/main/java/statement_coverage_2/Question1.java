package statement_coverage_2;

/**
 * 1. Using Test-first programming…… use the red/green/refactor approach to create the tests and a method, tipValue(),
 * that accepts a restaurant bill amount as an argument, and returns the amount of the tip you are giving the staff member.
 * The tip should be calculated as 5% of the bill amount.
 * Use comments in the test methods to identify the subset of tests required to achieve 100% statement coverage.
 */

public class Question1 {
    private static final double TIP_PERCENTAGE = 0.05;

    public double tipValue(double restaurantBill) {
        return restaurantBill * TIP_PERCENTAGE;
    }
}
