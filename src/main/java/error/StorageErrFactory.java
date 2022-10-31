package error;

import error.types.*;

public class StorageErrFactory {

    public static StorageError createError(StorageErrorType type){
        switch(type){
            case ROOT_EXISTS:
                return new RootExistsError();
            case DIR_EXISTS:
                return new DirExistsError();
            case NO_ROOT:
                return new NoRootError();
            case NO_ROOT_PATH:
                return new NoRootPathError();
            case NOT_ENOUGH_MEMORY:
                return new NotEnoughMemoryError();
            case NO_DIR:
                return new NoDirectoryError();
            case NOT_A_DIRECTORY:
                return new NotDirectoryError();
            case NO_FILE:
                return new NoFileError();
            case FILE_EXISTS:
                return new FileExistsError();
            case MAX_FILES:
                return new MaxFilesError();
            case INVALID_FILE_EXTENSION:
                return new InvalidFileExtensions();
        }

        return null;
    }
}
