package basics;

public class TwinStrings {

    /***
     * If 2 Words are Twins
     */
    public static boolean isTwins(String a, String b){
        if ((a.length() == 0) || (b.length() == 0) || (a.length() != b.length())) return false;
        String a2 = a.toUpperCase();
        String b2 = b.toUpperCase();
        for (int i = 0; i < a.length(); i++) {
            if (a2.contains(String.valueOf(b2.charAt(i))))
                return true;
        }

        return false;
    }

    // NB: To check if Letters repetition is permitted is this Challenge
    public static void main(String[] args) {
        System.out.println(isTwins("mansOOR","MANsoor"));
        System.out.println(isTwins("mansOOR","ahMadi"));
    }


}
