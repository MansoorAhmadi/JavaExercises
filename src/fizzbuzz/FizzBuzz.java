package fizzbuzz;

public class FizzBuzz {

    static void fizz(){
        for (int i=1; i<=100; i++){
            if ((i%5==0) && (i%3==0)){
                System.out.println("fizzbuzz");
            } else if (i%5==0){ //let's suppose we have 15 in here
                System.out.println("buzz");
            } else if (i%3==0){
                System.out.println("fizz");
            } else
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        fizz();
    }
}
