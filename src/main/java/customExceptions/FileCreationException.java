package customExceptions;
/**
 * Exception that occurs when something went wrong with file creation.
 */
public class FileCreationException extends RuntimeException{
    /**
     * Exception that occurs when something went wrong with file creation.
     * @param message custom message
     */
    public FileCreationException(String message) {
        super(message);
    }
}
