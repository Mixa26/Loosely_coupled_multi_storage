package customExceptions;
/**
 * Exception when either the maximum available number of folders or bytes granted by the configuration have been passed for a directory.
 */
public class NoSpaceException extends RuntimeException{
    /**
     * Exception when either the maximum available number of folders or bytes granted by the configuration have been passed for a directory.
     * @param message
     */
    public NoSpaceException(String message) {
        super(message);
    }
}
