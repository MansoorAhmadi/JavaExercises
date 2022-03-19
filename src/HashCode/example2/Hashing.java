package HashCode.example2;

import java.util.HashMap;

public class Hashing {
    public static void main(String[] args) {

        //creating the 1st hashmap
        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();

        //putting data inside the hashmap
        map1.put(11, 11);
        map1.put(4, 11);
        System.out.println(map1.hashCode());

        //2nd hashmap
        HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        map2.put(1, 11);
        map2.put(4, 11);
        System.out.println(map2.hashCode());

        //expression
        if (map1.equals(map2)) {
            System.out.println("Hash of map1 and map2 are: " + map1.hashCode() + " " + ":" + " " + map2.hashCode());
        }
    }
}
