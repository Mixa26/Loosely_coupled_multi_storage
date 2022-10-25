package error;

import error.types.RootExistsError;
import error.types.StorageErrorType;

public class StorageErrFactory {

    public StorageError createError(StorageErrorType type){
        switch(type){
            case ROOT_EXISTS:
                return new RootExistsError();
        }

        return null;
    }
}
