package helloLoop;

public class HelloLoop {

    public static void hello(String[] hell){
        for (int i=0; i<hell.length; i++){
            System.out.println(hell[i]);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"Hello", "You", "!"};
        hello(arr);
    }


}
