package error.types;

import error.StorageError;

public class NoFileError implements StorageError {

    public NoFileError(){
        handleError();
    }

    @Override
    public void handleError() {
        System.err.println("Given file does not exist!");
    }
}
