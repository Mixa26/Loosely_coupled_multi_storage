package customExceptions;

public class BadExtensionException extends RuntimeException{
    public BadExtensionException(String message) {
        super(message);
    }
}
