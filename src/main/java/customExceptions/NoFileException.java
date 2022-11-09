package customExceptions;
/**
 * Exception when a provided file doesn't exist.
 */
public class NoFileException extends RuntimeException{
    /**
     * Exception when a provided file doesn't exist.
     */
    public NoFileException(){
        super("File doesn't exist!");
    }
}
