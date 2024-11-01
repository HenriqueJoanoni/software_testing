package statement_coverage_2;

/**
 * Using Test-first programming…… use the red/green/refactor approach to create the tests and a method, cardPayment(),
 * that receives the price of an item and the appropriate VAT % rate as parameters, calculates the total price (price + VAT)
 * of the item and return the message “Contactless” if the total price is less than €30 otherwise return the message “PIN required”.
 * Use comments in the test methods to identify the subset of tests required to achieve 100% statement coverage.
 */
public class Question3 {
    public String cardPayment(double price, double vat) {
        double totalPrice = (price + vat);

        if (totalPrice < 30) {
            return "Contactless";
        }
        return "PIN required";
    }
}
