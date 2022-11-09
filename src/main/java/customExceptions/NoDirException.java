package customExceptions;
/**
 * Exception when a provided directory doesn't exist.
 */
public class NoDirException extends RuntimeException{
    /**
     * Exception when a provided directory doesn't exist.
     */
    public NoDirException(){
        super("Given directory doesn't exist!");
    }
}
