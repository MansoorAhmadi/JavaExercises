package basics;

import java.util.List;
import java.util.stream.Collectors;

public class ConvertListToUpperCase {

//Convert to Upper Case (Java 8 Lambdas and Streams)
//Write a method that converts all strings in a list to their upper case.

    public static List<String> upperCase(List<String> list) {
        return list.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> input1 = List.of("abc, bbb");
        List<String> input2 = List.of("ab, abcd");
        List<String> input3 = List.of("aaa");

        System.out.println(upperCase(input1));
        System.out.println(upperCase(input2));
        System.out.println(upperCase(input3));
    }
}
