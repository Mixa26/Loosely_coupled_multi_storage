package customExceptions;

public class NameExistsException extends RuntimeException{
    public NameExistsException(String message) {
        super(message);
    }
}
