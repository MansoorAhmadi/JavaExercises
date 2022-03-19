public class OddIntegers {
    public static void main(String[] args) {
        //Odd operation
        //write an algorithm to print odd integers only until 99
        for (int i=5; i<=99; i++){

            //expressions are always inside parenthesis (i%2)
            if ((i%2) !=0 ){
                System.out.println(i);
            }
        }
    }
}
