package basics;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FindMaximum {

//Find Maximum
//Write a method that returns the largest integer in the list.
//You can assume that the list has at least one element.

    public static Integer maximum(Integer[] list){
//        int result = 1;
//        for (int i=0; i<list.length; i++){
//            if (list[i] > result) {
//                result = list[i];
//            }
//        }
//        return result;

        //OR
        int maximum = list[0];
        for (int i : list) {
            if (i > maximum) {
                maximum = i;
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        Integer[] list = {3,16,5,1,8,15,17};
        System.out.println(maximum(list));
    }

}
