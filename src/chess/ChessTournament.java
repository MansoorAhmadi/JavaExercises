package chess;

public class ChessTournament {

    //The numbers in the text/game are 4, it can possibly be until n
    //If we have to find the total number of pairs.
    //We multiply the first player against all for example: Player A * (n-1)
    //

    //what is the return value of the method?
    //It's the number of possible pairs with a given number of players
    //for example we pass 5 as n
    //if number of players are 2 - we return one team
    //else, we recall the function. It will be 5-1
    //4 is not equal 2. Recall the function
    //When 2 equals 2. We return 1 team
    public static int count(int n) {
        if (n == 2) {
            return n - 1;
        } else
            return count(n - 1) + (n - 1);
    }

    public static void main(String[] args) {
        int player4 = 4;
        int player10000 = 10000;
        System.out.println(count(player4));
        System.out.println(count(player10000));
    }


}
