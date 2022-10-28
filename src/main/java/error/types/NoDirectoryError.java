package error.types;

import error.StorageError;

public class NoDirectoryError implements StorageError {

    public NoDirectoryError(){
        handleError();
    }

    @Override
    public void handleError() {
        System.out.println("Given directory does not exist!");
    }
}
