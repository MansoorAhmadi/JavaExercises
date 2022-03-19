package basics;

public class Factorial {

//Factorial
//Write a method that calculates the factorial of a given number.
//Factorial is the product of all positive integers less than or equal to n. For example, factorial(4) = 4x3x2x1 = 24.
//TIP: To make it more interesting, try to do it recursively.

    public static int factor(int n){
    int result = 1;
    for(int i=1; i<=n; i++){
        result *= i;
    }
    return result;
    }

    public static void main(String[] args) {
        System.out.println(factor(4));
    }
}
