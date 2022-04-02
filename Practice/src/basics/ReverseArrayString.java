package basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayString {

    public static void reverseArray(String[] arr) {
        // Converting Array to List
        List<String> list = Arrays.asList(arr);

        // Reversing the list using Collections.reverse() method
        Collections.reverse(list);

        // Converting list back to Array
        String[] reversedArray = list.toArray(arr);

        // Printing the reverse Array
        System.out.print(Arrays.toString(reversedArray));
    }


    public static void main(String[] args) {
        String[] arr = {"Java", "is", "awesome", "and", "fun"};
        reverseArray(arr);
    }
}
