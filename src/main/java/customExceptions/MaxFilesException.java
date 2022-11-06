package customExceptions;

public class MaxFilesException extends RuntimeException{

    public MaxFilesException(){
        super("This directory contains a maximum amount of files");
    }
}
