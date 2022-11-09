package customExceptions;
/**
 * Exception when a certain folder name already exists.
 */
public class NameExistsException extends RuntimeException{
    /**
     * Exception when a certain folder name already exists.
     * @param message custom message
     */
    public NameExistsException(String message) {
        super(message);
    }
}
