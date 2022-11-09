package customExceptions;
/**
 * Exception that occurs when directory creation didnt succeed.
 */
public class DirCreationException extends RuntimeException{
    /**
     * Exception that occurs when directory creation didnt succeed.
     */
    public DirCreationException(){
        super("Something went wrong creating a directory!");
    }
}
