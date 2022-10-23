import java.util.ArrayList;

public class Configuration {
    private int bytes;
    private int files;
    private ArrayList<String> extensions;

    private Configuration() {
        this.bytes = 100;
        this.files = 5;
        this.extensions = new ArrayList<String>();
    }

    public Configuration(int bytes, int files, ArrayList<String> extensions) {
        this.bytes = bytes;
        this.files = files;
        this.extensions = extensions;
    }

    public int getBytes() {
        return bytes;
    }

    public int getFiles() {
        return files;
    }

    public ArrayList<String> getExtensions() {
        return extensions;
    }

    public void setBytes(int bytes) {
        this.bytes = bytes;
    }

    public void setFiles(int files) {
        this.files = files;
    }

    public void setExtensions(ArrayList<String> extensions) {
        this.extensions = extensions;
    }
}
