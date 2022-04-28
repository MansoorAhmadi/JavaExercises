package basics;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AverageValue {

//Average Value (Java 8 Lambdas and Streams)
//Write a method that returns the average of a list of integers.

    public static Double average(List<Integer> list){
        return list
                .stream()
                .mapToInt(i -> i)
                .average()
                .getAsDouble();
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(20);
        list.add(20);
        System.out.println(average(list));
    }

}
