package customExceptions;

public class FileExistsException extends RuntimeException{

    public FileExistsException(){
        super("File exists!");
    }
}
