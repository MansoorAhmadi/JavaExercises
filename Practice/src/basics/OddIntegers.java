package basics;

public class OddIntegers {

    public static void odd(){
        int number = 99;
        for (int i=0; i<=number; i++){
            if (i%2==1){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        odd();
    }
}
