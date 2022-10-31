import java.io.File;
import java.util.ArrayList;
import java.util.Date;

public interface Storage {
    boolean createRoot(Configuration configuration);
    boolean createDir(String path, String name);
    boolean createFiles(String path, String[] names);
    boolean delete(String[] paths);
    boolean relocateFiles(String[] pathsFrom, String pathTo);
    boolean download(String pathFrom, String pathTo);
    boolean rename(String path, String name);

    //search
    Metadata searchAllFilesInDir(String dirPath);
    ArrayList<Object> searchAllDirsInDir(String dirPath);
    ArrayList<Object> searchAllFilesInDirs(String dirPath);
    ArrayList<Object> searchFilesByExt(String path, String ext);
    ArrayList<Object> searchFileBySub(String substring);
    boolean dirContainsFiles(String path,String[] names);
    File folderContainingFile(String name);
    void sort(SortParamsEnum sortBy,boolean ascending);
    ArrayList<File> filesCreatedModifiedOnDate(Date dateFrom, Date dateTo);
    void filterSearchResult(boolean fullPath, boolean showSize, boolean showDateOfCreation, boolean showDateOfModification);

    void printRes(ArrayList<Object> res);
}
