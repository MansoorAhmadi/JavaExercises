package basics;

public interface DefaultMethod {
    /**
     * Interfaces can contain default methods. True
     */

    // default method
    default void getSides() {
        System.out.println("It's a default method.");
    }

}
