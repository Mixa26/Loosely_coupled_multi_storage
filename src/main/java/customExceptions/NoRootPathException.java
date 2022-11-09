package customExceptions;
/**
 * Exception that occurs when you haven't provided a root in the path.
 */
public class NoRootPathException extends RuntimeException{
    /**
     * Exception that occurs when you haven't provided a root in the path.
     */
    public NoRootPathException(){
        super("Given path doesn't contain root directory!");
    }
}
