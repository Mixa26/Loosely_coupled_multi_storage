package customExceptions;
/**
 * Exception that is passed when a directory that is trying to be created already exists.
 */
public class DirExistsException extends RuntimeException{
    /**
     * Exception that is passed when a directory that is trying to be created already exists.
     */
    public DirExistsException(){
        super("Directory already exists!");
    }
}
