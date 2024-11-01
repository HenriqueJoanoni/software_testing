package TDD;

public class CheckWeekday {
    public String checkWeekday(int weekDay) {
        switch (weekDay) {
            case 1:
                return "[Monday] – it’s the beginning of the week";
            case 2:
                return "[Tuesday] – only 3 days till Friday";
            case 3:
                return "[Wednesday] – only 2 days till Friday";
            case 4:
                return "[Thursday] – only 1 day till Friday";
            case 5:
                return "Friday";
            case 6:
                return "[Saturday] - it's the weekend";
            case 7:
                return "[Sunday] - it's the weekend";
            default:
                return "";
        }
    }
}
