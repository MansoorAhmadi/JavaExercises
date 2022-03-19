package iValua;

import java.util.LinkedList;
import java.util.*;

public class ArrayOfNIntegers {

    public int solution(int[] A) {
        // write your code in Java SE 8

        //array.size
        //array.length

        //k = value
        //A[k]=k
        //intellij

        LinkedList<Integer> list = new LinkedList<Integer>();
        list.addFirst(A[0]);

        for(int i=1; i<A.length-1; i++){
            if(A[i]==-1){
                list.addLast(-1);
            }

            list.add(A[A[i]]);
        }

        //method
        // list.displayAllNodes();

        //method add first, add last

        return list.size();
    }


}
