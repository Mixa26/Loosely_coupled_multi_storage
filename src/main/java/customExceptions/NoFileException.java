package customExceptions;

public class NoFileException extends RuntimeException{

    public NoFileException(){
        super("File doesn't exist!");
    }
}
