package customExceptions;

public class BadPathException extends RuntimeException{
    public BadPathException(String message) {
        super(message);
    }
}
