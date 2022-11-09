import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A class used for tracking limitations on a folder.
 */
public class Configuration{
    /**
     * The name of the folder to limit.
     */
    @JsonProperty("folderName")
    private String folderName;
    /**
     * The maximum amount of bytes that can be stored to a folder.
     */
    @JsonProperty("bytes")
    private long bytes;
    /**
     * The maximum number of files to be stored in a folder.
     */
    @JsonProperty("files")
    private int files;
    /**
     * Extensions that are forbidden to be stored in this folder exp. "exe".
     */
    @JsonProperty("forbiddenExtension")
    private ArrayList<String> forbiddenExtensions;
    /**
     * A path for the folder to limit
     */
    private String configPath;


    public Configuration(String name) {
        this.folderName = name;
        this.bytes = 100;
        this.files = 5;
        this.forbiddenExtensions = new ArrayList<>();
    }

    public Configuration(String name, String path){
        this.folderName = name;
        this.configPath = path;
        this.bytes = 100;
        this.files = 5;
        this.forbiddenExtensions = new ArrayList<>();
    }

    public Configuration() {

    }

    public Configuration(String name ,long bytes, int files, ArrayList<String > forbiddenExtensions){
        this.folderName = name;
        this.bytes = bytes;
        this.files = files;
        this.forbiddenExtensions = forbiddenExtensions;
    }

    public Configuration(String configPath,String name ,long bytes, int files, ArrayList<String > forbiddenExtensions){
        this.configPath = configPath;
        this.folderName = name;
        this.bytes = bytes;
        this.files = files;
        this.forbiddenExtensions = forbiddenExtensions;
    }

    /**
     * A function that writes a Configuration's to Json.
     * @param arrayList list of configurations to write to json
     * @return a string of the to write into a .json file
     * @throws JsonProcessingException a jackson library exception
     */
    public String toJson(ArrayList<Configuration> arrayList) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        String s = mapper.writeValueAsString(arrayList);

        StringBuilder sb = new StringBuilder();
        //sb.append("{\"arrayList\":");
        sb.append(s);
        //sb.append("}");
        return sb.toString();
    }

    /**
     * A function that writes a Configuration's to Json.
     * @return a string of the to write into a .json file
     * @throws JsonProcessingException a jackson library exception
     */
    public String toJson() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        String s = mapper.writeValueAsString(this);

        StringBuilder sb = new StringBuilder();
        //sb.append("{\"arrayList\":");
        sb.append(s);
        //sb.append("}");
        return sb.toString();
    }

    /**
     * A function that reads a json format and transforms it into a list of Configuration's.
     * @param json json string to be transformed into Configuration's
     * @return A java List of Configuration's.
     * @throws JsonProcessingException a jackson library exception
     * @throws IOException input output exception if something goes wrong
     */
    public List<Configuration> fromJson(String json) throws JsonProcessingException, IOException {
        /**
         * Returns a List< Configuration >, USE THIS ONLY WITH A JSON CONTAINING LIST < CONFIGURATION >
         */
        ArrayList<Configuration> arrayList = new ArrayList<>();


        ObjectMapper mapper = new ObjectMapper();
        List<Configuration> myObjects = mapper.readValue(json, new TypeReference<List<Configuration>>(){});
        return (ArrayList<Configuration>)myObjects;
    }

    public String getFolderName() {
        return folderName;
    }

    public long getBytes() {
        return bytes;
    }

    public int getFiles() {
        return files;
    }

    public ArrayList<String> getForbiddenExtensions() {
        return forbiddenExtensions;
    }

    public void setFolderName(String folderName) {
        this.folderName = folderName;
    }

    public void setBytes(long bytes) {
        this.bytes = bytes;
    }

    public void setFiles(int files) {
        this.files = files;
    }

    public void setForbiddenExtensions(ArrayList<String> forbiddenExtensions) {
        this.forbiddenExtensions = forbiddenExtensions;
    }

    public void setConfigPath(String configPath) {
        this.configPath = configPath;
    }

    public String getConfigPath() {
        return configPath;
    }

    @Override
    public String toString() {
        return "Configuration{" +
                "folderName='" + folderName + '\'' +
                ", bytes=" + bytes +
                ", files=" + files +
                ", forbiddenExtensions=" + forbiddenExtensions +
                ", configPath='" + configPath + '\'' +
                '}';
    }
}