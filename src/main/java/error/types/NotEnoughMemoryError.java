package error.types;

import error.StorageError;

public class NotEnoughMemoryError implements StorageError {

    public NotEnoughMemoryError(){
        handleError();
    }

    @Override
    public void handleError() {
        System.err.println("Root directory doesn't have any more memory!");
    }
}
