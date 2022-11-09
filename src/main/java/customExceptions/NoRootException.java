package customExceptions;
/**
 * Exception that occurs when you're trying to do operations on a storage, but you havent made or connected to one.
 */
public class NoRootException extends RuntimeException {
    /**
     * Exception that occurs when you're trying to do operations on a storage, but you havent made or connected to one.
     * @param message custom message
     */
    public NoRootException(String message) {
        super(message);
    }
}
