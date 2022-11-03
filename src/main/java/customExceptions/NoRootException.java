package customExceptions;

public class NoRootException extends RuntimeException {
    public NoRootException(String message) {
        super(message);
    }
}
