package error.types;

import error.StorageError;

public class RootExistsError implements StorageError {

    public RootExistsError(){
        handleError();
    }

    @Override
    public void handleError() {
        System.err.println("Root folder already exists");
    }
}
