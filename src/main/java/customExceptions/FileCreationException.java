package customExceptions;

public class FileCreationException extends RuntimeException{
    public FileCreationException(String message) {
        super(message);
    }
}
