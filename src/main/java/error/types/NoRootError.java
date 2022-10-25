package error.types;

import error.StorageError;

public class NoRootError implements StorageError {

    public NoRootError(){
        handleError();
    }

    @Override
    public void handleError() {
        System.err.println("No root directory");
    }
}
