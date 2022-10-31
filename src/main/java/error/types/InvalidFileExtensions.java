package error.types;

import error.StorageError;

public class InvalidFileExtensions implements StorageError {

    public InvalidFileExtensions(){
        handleError();
    }

    @Override
    public void handleError() {
        System.err.println("Given file has invalid extension!");
    }
}
