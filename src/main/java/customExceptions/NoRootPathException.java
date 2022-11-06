package customExceptions;

public class NoRootPathException extends RuntimeException{

    public NoRootPathException(){
        super("Given path doesn't contain root directory!");
    }
}
