import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import customExceptions.NoArrayException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Configuration{
    @JsonProperty("folderName")
    private String folderName;
    @JsonProperty("bytes")
    private long bytes;
    @JsonProperty("files")
    private int files;
    @JsonProperty("forbiddenExtension")
    private ArrayList<String> forbiddenExtensions;


    public Configuration(String name) {
        this.folderName = name;
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

    public String toJson(ArrayList<Configuration> arrayList) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        String s = mapper.writeValueAsString(arrayList);

        StringBuilder sb = new StringBuilder();
        //sb.append("{\"arrayList\":");
        sb.append(s);
        //sb.append("}");
        return sb.toString();
    }

    public String toJson() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        String s = mapper.writeValueAsString(this);

        StringBuilder sb = new StringBuilder();
        //sb.append("{\"arrayList\":");
        sb.append(s);
        //sb.append("}");
        return sb.toString();
    }

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
}