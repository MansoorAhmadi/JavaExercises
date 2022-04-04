package basics;

import java.util.Scanner;

public class Factorials {

    /**
     * @method - looping to find tha value of a factorial number - lower number to higher
     * @param number
     * @return
     */
    private static int factorialLowerNumberToHigher(int number){
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * @method - looping to find tha value of a factorial number - higher number to lower
     * @param number
     * @return
     */
    private static int factorialHigherNumberToLower(int number){
        int factorial = 1;
        for (int i=number; i >= 1; i--) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * @method - Recursion factorial calculation
     * @param number
     * @return
     */
    private static int recursiveFactorial(int number){
        if (number==1) return 1;
        return number * recursiveFactorial(number - 1);
    }



    public static void main(String[] args) {

        //user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("To calculate an integer, input a number: ");
        int input = scanner.nextInt();

        System.out.println("Lower to Higher incrementing: " + factorialLowerNumberToHigher(input));
        System.out.println("Higher to Lower decrementing: " + factorialHigherNumberToLower(input));
        System.out.println("Recursive factorial: " + recursiveFactorial(input));
    }
}
