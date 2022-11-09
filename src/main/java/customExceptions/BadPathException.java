package customExceptions;
/**
 * Exception when a passed path doesn't exist.
 */
public class BadPathException extends RuntimeException{
    /**
     * Exception when a passed path doesn't exist.
     * @param message custom message
     */
    public BadPathException(String message) {
        super(message);
    }
}
