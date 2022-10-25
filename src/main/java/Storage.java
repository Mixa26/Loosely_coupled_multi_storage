import java.io.File;
import java.util.ArrayList;

public interface Storage {
    boolean createRoot(Configuration configuration);
    boolean createDir(String path, String name);
    boolean createFiles(String path, String[] names);
    boolean delete(String[] paths);
    boolean relocateFiles(String[] paths);
    boolean download(String[] pathsFrom, String pathTo);
    boolean rename(String name);

    //search
    Metadata searchAllFilesInDir(String dirPath);
    ArrayList<File> searchAllDirsInDir(String dirPath);
    ArrayList<File> searchAllFilesInDirs(String dirPath);
    ArrayList<File> searchFilesByExt(String ext);
    ArrayList<File> searchFileBySub(String substring);
    boolean dirContainsFiles(String[] names);
    File folderContainingFile(String name);
    void sort(SortParamsEnum sortBy,boolean ascending);
    ArrayList<File> filesCreatedModifiedOnDate(String dirPath);
    void filterSearchResult(boolean fullPath, boolean showSize, boolean showDateOfCreation, boolean showDateOfModification);
}
