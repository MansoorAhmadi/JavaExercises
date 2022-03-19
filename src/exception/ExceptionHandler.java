package exception;

public class ExceptionHandler {

//    Update the code by implementing the following rules”
//    If an exception is thrown by s.execute() then call
//    c.rollback() and propagate the exception, otherwise call c.commit()
//    In any circumstances, c.close() must be called before leaving the method a(Service s, Connection c)

    void a(Service service, Connection connection){

        service.setConnection();
        try {
            service.execute();
            connection.commit();
        } catch (Exception e) {
            e.printStackTrace();
            connection.rollback();
        } finally {
            connection.close();
        }
    }





}
