package customExceptions;
/**
 * Exception when a provided file already exists.
 */
public class FileExistsException extends RuntimeException{
    /**
     * Exception when a provided file already exists.
     */
    public FileExistsException(){
        super("File exists!");
    }
}
