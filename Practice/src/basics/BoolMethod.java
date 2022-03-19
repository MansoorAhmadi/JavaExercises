package basics;

public class BoolMethod {

    // class BooleanOr method a(int i, int j) should return true if one of the argument equals 1
    // of if their sum equals 1

    public static boolean sum(int i, int j){
        if ((i==1 || j==1) || (i+j==1) ) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,5));
        System.out.println(sum(2,3));
        System.out.println(sum(-3,4));
    }
}
