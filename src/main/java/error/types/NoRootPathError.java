package error.types;

import error.StorageError;

public class NoRootPathError implements StorageError {

    public NoRootPathError(){
        handleError();
    }

    @Override
    public void handleError() {
        System.err.println("No root path in the provided path!");
    }
}
