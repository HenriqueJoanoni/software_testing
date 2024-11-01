package practical_2;

public class CheckLargest {
    public int checkLargest(int param1, int param2, int param3) {
        int largest = 0;

        if (param1 > param2 && param1 > param3) {
            largest = param1;
        } else if (param2 > param1 && param2 > param3) {
            largest = param2;
        } else if (param3 > param1 && param3 > param2) {
            largest = param3;
        }

        return largest;
    }
}
