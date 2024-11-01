package statement_coverage_2;

/**
 * 5. Using Test-first programming…… use the red/green/refactor approach to create the tests and a method, season (),
 * that receives 2 integers representing a day (1-31) and a month (1-12)
 * and returns a String showing whether or not the date supplied is in Spring, Summer, Autumn or Winter.
 * <p>
 * Date ranges are as follows:
 * • Feb 20 to May 19 – Spring
 * • May 20 to Aug 19 – Summer
 * • Aug 20 to Nov 19 – Autumn
 * • Nov 20 to Feb 19 – Winter
 * Use comments in the test methods to identify the subset of tests required to achieve 100% statement coverage.
 */
public class Question5 {
    public String season(int day, int month) {
        String returnValue = "";

        if (day >= 20 && month == 2) {
            returnValue  = "Spring";
        }

        if (day >= 20 && month == 5) {
            returnValue = "Summer";
        }

        if (day >= 20 && month == 8) {
            returnValue = "Autumn";
        }

        if (day >= 20 && month == 11) {
            returnValue = "Winter";
        }

        if (day > 31 || month > 12) {
            returnValue = "Invalid date";
        }

        return returnValue;
    }
}
