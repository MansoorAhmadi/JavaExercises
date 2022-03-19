package concatenation;

public class StringConcat {

    // from an array which contains "f", "o", "o", "bar" it should result foobar
    // the array should join character strings end to end






    static String concat(String[] strings){
        String value = "";
        for (int i = 0; i<strings.length; i++){
            value = value.concat(strings[i]);
        }
        System.out.println(value);
        return value;
    }
}
