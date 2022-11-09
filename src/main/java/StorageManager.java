/**
 * The class responsible for loading up a concrete storage.
 */
public class StorageManager {
    /**
     * A concrete storage to be used in the application.
     */
    private static Storage storage;

    /**
     * A function which sets the concrete storage to use.
     * @param st storage to be used
     */
    public static void registerStorage(Storage st)
    {
        storage = st;
    }

    /**
     * A function that returns a concrete storage.
     * @param path path to the storage
     * @return the storage to be used
     */
    public static Storage getStorage(String path)
    {
        storage.setPath(path);
        return storage;
    }
}
