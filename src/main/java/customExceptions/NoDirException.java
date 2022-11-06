package customExceptions;

public class NoDirException extends RuntimeException{

    public NoDirException(){
        super("Given directory doesn't exist!");
    }
}
