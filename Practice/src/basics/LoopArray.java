package basics;

public class LoopArray {

    //Array[] of = "Hello", "You", "!" should be printed in the following format:
    //Hello
    //You
    //!

    public static void hello(String[] text){
        for (int i=0; i< text.length; i++){
            System.out.println(text[i]);
        }
    }

    public static void main(String[] args) {
        String[] message = {"Hello", "You", "!"};
        hello(message);
    }
}
