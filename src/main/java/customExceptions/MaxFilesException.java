package customExceptions;
/**
 * Exception when there can be no more files added to a directory.
 */
public class MaxFilesException extends RuntimeException{
    /**
     * Exception when there can be no more files added to a directory.
     */
    public MaxFilesException(){
        super("This directory contains a maximum amount of files");
    }
}
