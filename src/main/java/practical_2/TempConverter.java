package practical_2;

/**
 * Write a Java method, tempConvert {}, which receives 2 arguments, and integer denoting a temperature and a letter ‘F’ or ‘C’
 * denoting whether the temperature is in Fahrenheit or Celsius.
 * Your method should return the message “The Celsius/Fahrenheit equivalent of 999 Celsius/Fahrenheit is 999”.
 */
public class TempConverter {
//    public String tempConvert(int tempA, int tempB) {
//
//        /** FORMULA TO CONVERT CELSIUS TO FARENHEIT */
//        int resultTemp = (tempB * 9 / 5) + 32;
//        return "The Celsius/Fahrenheit equivalent of " + tempA + "ºC Celsius/Fahrenheit is " + resultTemp;
//    }
    public double tempConvert(int tempA, int tempB) {

        /** FORMULA TO CONVERT CELSIUS TO FARENHEIT */
        return ((double) (tempB * 9) / 5) + 32;
    }
}
