package exception;

public interface Connection {

    void commit();
    void rollback();
    void close();
}
