package customExceptions;

public class RootExistsException extends RuntimeException{
    public RootExistsException(){
        super("Root directory already exists!");
    }
}
