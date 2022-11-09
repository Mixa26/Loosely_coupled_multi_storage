package customExceptions;
/**
 * Exception when a given array doesn't exists.
 */
public class NoArrayException extends RuntimeException{
    /**
     * Exception when a given array doesn't exists.
     * @param message custom message
     */
    public NoArrayException(String message) {
        super(message);
    }
}
