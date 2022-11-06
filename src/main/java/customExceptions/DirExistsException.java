package customExceptions;

public class DirExistsException extends RuntimeException{

    public DirExistsException(){
        super("Directory already exists!");
    }
}
