import customExceptions.BadPathException;
import customExceptions.FileCreationException;
import customExceptions.NoRootException;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public interface Storage {
    /**
     * Connects to a root repository if it exists, and if not it makes a new one on the specified path with the default name.
     * Connection to the root repo is based on its default name.
     * @param path path where to make the root directory
     * @param configuration tells the repository the maximum number of bytes that could be uploaded,
     *                      maximum amount of files and forbidden file extensions
     * @return true if no errors encountered, false if something went wrong
     */
    boolean createRoot(String path, Configuration configuration) throws BadPathException;

    /**
     * Creates a folder on the provided path, with a provided name
     * @param path where to make the folder ("" for inside of root, exp. "folder/folder1" will be added to folder1)
     * @param name of the folder
     * @param configuration limits for the amount of bytes,files and forbidden extensions in this folder
     * @return true if no errors encountered, false if something went wrong
     */
    boolean createDir(String path, String name, Configuration configuration) throws NoRootException;

    /**
     * Creates one or more file's and puts them inside of repository on provided path with provided names
     * @param path where to upload the files (exp. "folder/folder1 will add all files to "folder1" inside of "folder")
     * @param names name of files to be created inside of repository on provided path
     * @return true if no errors encountered, false if something went wrong
     */
    boolean createFiles(String path, String[] names) throws FileCreationException;

    /**
     * Deletes folders/files specified by paths
     * @param paths of files/folders to be deleted (exp. "folder/folder1")
     * @return true if no errors encountered, false if something went wrong
     */
    boolean delete(String[] paths);

    /**
     * Relocates one or more files specified in paths to a path specified
     * @param pathsFrom the paths of files to be relocated (exp. "folder/folder1")
     * @param pathTo the path destination where files will be relocated (exp. "folder/folder1")
     * @return true if no errors encountered, false if something went wrong
     */
    boolean relocateFiles(String[] pathsFrom, String pathTo);

    /**
     * Downloads a folder/file specified by path
     * @param pathFrom the path of folder/file to be downloaded (exp. "folder/folder1")
     * @param pathTo the local PC path where the folder/file will be downloaded
     * @return true if no errors encountered, false if something went wrong
     */
    boolean download(String pathFrom, String pathTo) throws UnsupportedOperationException;

    /**
     * Renames a folder/file
     * @param path path to the folder/file to be renamed (exp. "folder/folder1")
     * @param name the new name a folder/file will get
     * @return true if no errors encountered, false if something went wrong
     */
    boolean rename(String path, String name);

    //search
    /**
     * Returns all files in a directory (subdirectories not included) provided by path
     * @param dirPath the path of a folder to be searched for files
     * @return the list of files from the provided folder path
     */
    ArrayList<Object> searchAllFilesInDir(String dirPath);

    /**
     * Returns all files from subdirectories of a directory provided (provided directories files not included)
     * @param dirPath path to a folder which subfolders will be searched for files
     * @return the list of files from the subfolders of provided folder path
     */
    ArrayList<Object> searchAllDirsInDir(String dirPath);

    /**
     * Returns all files from a directory and its subdirectories
     * @param dirPath path to a folder to be searched for files (subfolders will be searched as well)
     * @return the list of files objects from the provided folder (and its subfolders)
     */
    ArrayList<Object> searchAllFilesInDirs(String dirPath);

    /**
     * Searches files by extension provided in a directory provided by path
     * @param path path to the folder to be searched for files with a certain extension
     * @param ext the extension of files to be searched for (exp. "exe" notice there is no dot!)
     * @return the list of files found with the provided extension in a provided folder
     */
    ArrayList<Object> searchFilesByExt(String path, String ext);

    /**
     * Searches the whole root directory for files containing a provided string in their name
     * @param substring the string to be searched for in file names
     * @return the list of files containing a provided substring in their name
     */
    ArrayList<Object> searchFileBySub(String substring);

    /**
     * Checks if a directory contains a single file or multiple files
     * @param path path to the folder to be searched for certain files
     * @param names name of files to be searched for in the provided folder (they must be exact!)
     * @return true if all files from the list found in the folder, false otherwise
     */
    boolean dirContainsFiles(String path,String[] names);

    /**
     * Finds the name of the folder which contains a file with a provided name
     * @param name a name to be searched for in the root directory
     * @return the first name found (if there are multiple) of the folder containing the file
     */
    String folderContainingFile(String name) throws FileNotFoundException;

    /**
     * Sorts the last search result which returned a ArrayList< Object > of files
     * @param sortBy can sort by name, date of creation or date of modification (provide argument as exp. "SortParamsEnum.NAME")
     * @param ascending true if sort should be ascending, false otherwise (alphabetically, or by date)
     */
    void sort(SortParamsEnum sortBy,boolean ascending);

    /**
     * Finds all files created or modified between two dates provided
     * @param dateFrom the date after which to search for files
     * @param dateTo the date before which to search for files
     * @return the list of files created or modified between the dates provided
     */
    ArrayList<Object> filesCreatedModifiedOnDate(Date dateFrom, Date dateTo);

    /**
     * Prints file details filtered
     * @param fullPath true to print the whole path from root to file, false to only print the name of the file
     * @param showSize true to show file size in KB, false to not show it at all
     * @param showDateOfCreation true to show the exact time of file creation, false to not show it at all
     * @param showDateOfModification true to show the exact time of last file modification, false to not show it at all
     */
    void filterSearchResult(boolean fullPath, boolean showSize, boolean showDateOfCreation, boolean showDateOfModification);

    /**
     * A simple function which prints the names of files provided as a list
     * @param res the list of files to be printed
     */
    void printRes(ArrayList<Object> res);
}
