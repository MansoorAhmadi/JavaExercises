package enumuration;



public class Enum {

    enum Planet {
        MERCURY, VENUS, EARTH
    }

    public static void main(String[] args) {
        Planet.MERCURY.equals(Planet.MERCURY);

        //it doesn't work outside parenthesis
//        Planet.MERCURY == Planet.MERCURY;
//        Planet.MERCURY == Planet.VENUS;

        //it will work this way, becasue it's an expression
        System.out.println(Planet.MERCURY == Planet.MERCURY); // true
        System.out.println(Planet.MERCURY == Planet.VENUS); // false

    }
}
