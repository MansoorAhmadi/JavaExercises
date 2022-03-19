package basics;

public class Even {

    //write an algorithm to print even integers only until 99
    public static void evenInteger(){
        int number = 99;
        for (int i=0; i<=number; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        evenInteger();
    }
}
