import java.util.ArrayList;

public class Configuration {
    private long bytes;
    private int files;
    private ArrayList<String> extensions;

    public Configuration() {
        this.bytes = 100;
        this.files = 5;
        this.extensions = new ArrayList<String>();
    }

    public Configuration(long bytes, int files, ArrayList<String> extensions) {
        this.bytes = bytes;
        this.files = files;
        this.extensions = extensions;
    }

    public long getBytes() {
        return bytes;
    }

    public int getFiles() {
        return files;
    }

    public ArrayList<String> getExtensions() {
        return extensions;
    }

    public void setBytes(long bytes) {
        this.bytes = bytes;
    }

    public void setFiles(int files) {
        this.files = files;
    }

    public void setExtensions(ArrayList<String> extensions) {
        this.extensions = extensions;
    }
}
