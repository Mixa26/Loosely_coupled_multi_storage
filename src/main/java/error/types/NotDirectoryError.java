package error.types;

import error.StorageError;

public class NotDirectoryError implements StorageError {

    public NotDirectoryError(){
        handleError();
    }

    @Override
    public void handleError() {
        System.err.println("Given path is not a directory!");
    }
}
