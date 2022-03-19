package thread;

public class Main {
    public static void main(String[] args) {

        ThreadMethod threadMethod = new ThreadMethod();
        Thread thread = new Thread(threadMethod);

        // It does not start a separate call stack
        thread.run();
    }

}
