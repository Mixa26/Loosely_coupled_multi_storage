package error.types;

import error.StorageError;

public class DirExistsError implements StorageError {

    public DirExistsError(){
        handleError();
    }

    @Override
    public void handleError() {
        System.err.println("Directory with this name already exists!");
    }
}
