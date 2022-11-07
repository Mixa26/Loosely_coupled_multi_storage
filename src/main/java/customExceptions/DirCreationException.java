package customExceptions;

public class DirCreationException extends RuntimeException{

    public DirCreationException(){
        super("Something went wrong creating a directory!");
    }
}
