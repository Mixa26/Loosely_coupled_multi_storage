package customExceptions;
/**
 * Exception when a extension is forbidden in a directory
 */
public class BadExtensionException extends RuntimeException{
    /**
     * Exception when a extension is forbidden in a directory
     * @param message custom message
     */
    public BadExtensionException(String message) {
        super(message);
    }
}
