package customExceptions;

public class NotDirectoryException extends RuntimeException{

    public NotDirectoryException(){
        super("This is not a directory!");
    }
}
