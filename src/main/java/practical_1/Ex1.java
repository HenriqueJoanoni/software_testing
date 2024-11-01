package practical_1;

import java.util.Scanner;

/**
 * has been created to return the sum of 2 integers unless the two values are the same,
 * then the method returns double their sum. Write the sumDouble (int a, int b) method.
 * <p>
 * You will also need to write a main method to call the sumDouble (int a, int b) method.
 * Your main method should then display the message “The sum of the numbers is (the returned sum)”.
 * Test the method through the use of different values for the variables a and b.
 */

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Please insert the first number to sum: ");
            int firstNum = sc.nextInt();

            System.out.println("Please insert the second number to sum: ");
            int secondNum = sc.nextInt();

            int result = sumDouble(firstNum, secondNum);

            if (result == 0) {
                System.out.println(">>>>> You can't sum the same number twice in this program !!");
            } else {
                System.out.println("The sum of the numbers is: " + result);
            }
        } catch (Exception e) {
            System.out.println(">>>>> YOU NEED TO INSERT A VALID NUMBER!");
        }
    }

    public static int sumDouble(int a, int b) {
        if (a == b) {
            return 0;
        }

        return (a + b) * 2;
    }
}
