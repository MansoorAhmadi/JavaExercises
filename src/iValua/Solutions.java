package iValua;
import java.util.*;

public class Solutions {


    public int solution(int[] A) {
        // write your code in Java SE 8

        //for (int i)
        //if i < value[]
        //return minimum

        // given an array A of N integers, returns the smallest positive integer
        // (greater than 0) that does not occur in A.
        //For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
        //
        //Given A = [1, 2, 3], the function should return 4.
        //
        //Given A = [−1, −3], the function should return 1.

        int smallInt = 1;

        if (A.length == 0) return smallInt;

        Arrays.sort(A);

        if (A[0] > 1)
            return smallInt;

        if (A[A.length - 1] <= 0)
            return smallInt;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == smallInt) {
                smallInt++;
            }
        }

        return smallInt;




    }

    public static void main(String[] args) {

        int[] A = {1, 3, 6, 4, 1, 2};
        Solutions solutions = new Solutions();
        System.out.println(solutions.solution(A));

        //    Given A = [1, 2, 3], the function should return 4.
        int[] A1 = {1, 2, 3};
        int[] A2 = {-1, -3};

        System.out.println(solutions.solution(A1));
        System.out.println(solutions.solution(A2));

    }


}
