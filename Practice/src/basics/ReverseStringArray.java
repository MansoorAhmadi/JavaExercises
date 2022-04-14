package basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStringArray {

    //CAPGEMINI
    public static String reverseArray(String[] arr) {

        String reverse = "";
        for (int i = arr.length -1; i>=0; i--) {
            reverse = reverse.concat(arr[i]);
        }
        return reverse;
}


    public static void main(String[] args) {
        String[] arr = {"abc", "def", "ghi"};
        System.out.println(reverseArray(arr));
    }
}
