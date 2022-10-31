package error.types;

import error.StorageError;

public class MaxFilesError implements StorageError {

    public MaxFilesError(){
        handleError();
    }

    @Override
    public void handleError() {
        System.err.println("Root directory reached max amount of files!");
    }
}
