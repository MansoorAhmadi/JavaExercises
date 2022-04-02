package basics;

public class MethodFinalModifier {

    public static class FinalMethodExample {
        public final void display() {
            // ...
            System.out.println("Final class method");
        }

        public static void main(String[] args) {
            new FinalMethodExample().display();
        }

        class Sample extends FinalMethodExample {
        }


    }

    public static class NonFinalMethodExample {
        public void method() {
            // ...
        }
    }
}
