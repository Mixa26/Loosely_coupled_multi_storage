package customExceptions;

public class NoConfigException extends RuntimeException{
    public NoConfigException(String message) {
        super(message);
    }
}
