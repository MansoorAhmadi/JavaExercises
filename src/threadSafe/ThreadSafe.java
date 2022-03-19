package threadSafe;

public class ThreadSafe {

    //make Thread.increment() a thread safe.

    private static int count = 0;
    //*****************************************

    // increment the count in a thread safe manner

    //*****************************************

    //synchronised makes the access and increment one at a time in a safer manner.
    public static synchronized int increment(){
        count = count + 1;
        return count;
    }

}
