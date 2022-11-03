import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

public class Configuration{
    private long bytes;
    private int files;
    private ArrayList<String> forbiddenExtensions;

    public Configuration() {
        this.bytes = 100;
        this.files = 5;
        this.forbiddenExtensions = new ArrayList<>();
    }


    public Configuration( long bytes, int files, ArrayList<String > forbiddenExtensions){
        this.bytes = bytes;
        this.files = files;
        this.forbiddenExtensions = forbiddenExtensions;
    }

    public String toJson(ArrayList<Configuration> arrayList) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        // Java object to JSON string
        return mapper.writeValueAsString(arrayList);
    }

    public List<Configuration> fromJson(String json) throws JsonProcessingException {
        /**
         * Returns a List< Configuration >, USE THIS ONLY WITH A JSON CONTAINING LIST < CONFIGURATION >
         */
        ArrayList<Configuration> arrayList = new ArrayList<>();

        ObjectMapper mapper = new ObjectMapper();

        return  (List<Configuration>) mapper.readValue(json, List.class);

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