package TDD;

/**
 * Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ..6=Sat, and a boolean indicating if we are on holiday,
 * return a string of the form "7:00" indicating when the alarm clock should ring.
 * Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00".
 * Unless we are on holiday -- then on weekdays it should be "10:00" and weekends it should be "off".
 */
public class EncodedWeekday {
    public String encodedWeekDay(int encWkd, boolean isHoliday) {
        if (isHoliday) {
            if (encWkd >= 1 && encWkd <= 5) {
                return "10:00";
            } else if (encWkd == 6 || encWkd == 7) {
                return "off";
            }
        } else {
            if (encWkd >= 1 && encWkd <= 5) {
                return "7:00";
            } else if (encWkd == 6 || encWkd == 7) {
                return "10:00";
            }
        }
        return "";
    }
}
