package basics;

public class LinearSearch {

//Linear Search
//Write a method that returns the index of the first occurrence of given integer in a list.
//Assume that the index of the first element in the list is zero.
//If the number does not exist return -1.

//    [3, 1, 3, 2, 6, 9, 7, 6]
//    input 6 - output expected is 4
//    input 10 - output expected is -1

    public static int search(Integer n, Integer[] list){
        for (int i=0; i<list.length; i++){
            if (list[i].equals(n)) return i;        //OR    if(list[i]==n) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer number = 6;
        Integer[] list = {3, 1, 3, 2, 6, 9, 7, 1};
        System.out.println(search(number,list));
    }
}
