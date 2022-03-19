package basics;

public class SumAndMultiplesOfThreeAndFive {

//    Given a number n, write a method that sums all multiples of three and five up to n (inclusive).
//    input 15          expected 60

    public static int sum(int n){
        int result = 0;
        for (int i=0; i<=n; i++){
            if ((i%3==0) || (i%5==0)){
                result = result + i;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(sum(10));
        System.out.println(sum(15));
    }
}
