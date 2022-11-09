package customExceptions;
/**
 * Exception when a passed file is not a directory.
 */
public class NotDirectoryException extends RuntimeException{
    /**
     * Exception when a passed file is not a directory.
     */
    public NotDirectoryException(){
        super("This is not a directory!");
    }
}
