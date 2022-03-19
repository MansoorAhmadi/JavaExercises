package basics;

public class Concatenation {

    // from an array which contains "f", "o", "o", "bar" it should result foobar
    // the array should join character strings end to end

    public static String concatenating(String[] argument){
        String result="";
        for (int i=0; i<argument.length; i++){
            result = result.concat(argument[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        String[] foobar= {"f","o","o","bar"};
        System.out.println(concatenating(foobar));
    }


}
