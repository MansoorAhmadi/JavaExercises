package basics;

public class isPrimeNumber {

    public static Boolean isPrime(Integer n) {
        boolean prime = true;
        for (int i = n-1; i > 1 ; i--) {
            if (n%i==0){
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(15));
    }
}
