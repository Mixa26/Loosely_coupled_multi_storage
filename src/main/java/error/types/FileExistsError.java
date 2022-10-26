package error.types;

import error.StorageError;

public class FileExistsError implements StorageError {

    public FileExistsError(){
        handleError();
    }

    @Override
    public void handleError() {
        System.err.println("Given file already exists!");
    }
}
