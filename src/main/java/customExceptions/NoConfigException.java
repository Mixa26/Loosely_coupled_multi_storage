package customExceptions;
/**
 * Exception that occurs if a root that is being connected to doesnt have a configuration inside it.
 */
public class NoConfigException extends RuntimeException{
    /**
     * Exception that occurs if a root that is being connected to doesnt have a configuration inside it.
     * @param message custom message
     */
    public NoConfigException(String message) {
        super(message);
    }
}
