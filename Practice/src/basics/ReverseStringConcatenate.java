package basics;

import java.util.Arrays;

public class ReverseStringConcatenate {

    public static String reverse(String[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append(array);
        sb.reverse();
//        for (int i = array.length - 1; i >= 0; i--) {
//            sb.reverse().append(array[i]);
//        }
        return sb.append(sb).toString();
    }

    public static void main(String[] args) {
        String[] strings = {"abc", "def", "ghi"};
        System.out.println((reverse(strings)));
    }



}
