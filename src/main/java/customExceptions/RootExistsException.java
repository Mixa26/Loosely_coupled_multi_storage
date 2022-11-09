package customExceptions;
/**
 * Exception when you're trying to make a root, but one already exists.
 */
public class RootExistsException extends RuntimeException{
    /**
     * Exception when you're trying to make a root, but one already exists.
     */
    public RootExistsException(){
        super("Root directory already exists!");
    }
}
