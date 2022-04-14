package basics;
import java.lang.StringBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseString {

//Reverse String
//Write a method that reverses a string.
//For example, 'java interview' becomes 'weivretni avaj'.

    public static String reverseString(String s){
        String reverse = "";
        if (s==null) return s;
        for (int i=s.length() -1; i>=0; i--){
            reverse = reverse + s.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
//        String test = {"abc","def","gfi"};
        System.out.println(reverseString("java interview"));
    }



}
