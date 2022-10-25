import com.github.cliftonlabs.json_simple.JsonKey;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsonable;
import com.github.cliftonlabs.json_simple.Jsoner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;

import static java.lang.Math.toIntExact;

public class Configuration implements Jsonable {
    private int bytes;
    private int files;
    private ArrayList<String> forbiddenExtensions;

    public Configuration() {
        this.bytes = 100;
        this.files = 5;
        this.forbiddenExtensions = new ArrayList<>();
    }


    public Configuration( int bytes, int files, ArrayList<String > forbiddenExtensions){
        this.bytes = bytes;
        this.files = files;
        this.forbiddenExtensions = forbiddenExtensions;
    }

    @Override
    public String toJson () {
        /**
         * Calls toJson with writer argument and returns
         * a string containing json data of the Configuration
         * object it is called on.
         */
        final StringWriter writable = new StringWriter();
        try {
            this.toJson(writable);
        } catch (final IOException e) {
            System.out.println("Json problem in class Configuration!");
        }
        return writable.toString();
    }

    @Override
    public void toJson (Writer writer) throws IOException {
        /**
         * Is called by toJson with no arguments
         * and fills the writer with json data
         */
        final JsonObject json = new JsonObject();
        json.put("bytes", this.getBytes());
        json.put("files", this.getFiles());
        json.put("forbiddenExtensions", this.getForbiddenExtensions());
        json.toJson(writer);
    }

    public Configuration fromJson (String fileText)
    {
        /**
         * Grabs json data from a string text and
         * transforms is into a Configuration object
         * which is also returned by this function.
         */
        try {
            JSONParser jsonParser = new JSONParser();
            JSONObject obj = (JSONObject) jsonParser.parse(fileText);
            Configuration config = new Configuration();

            config.setBytes(toIntExact((long) obj.get("bytes")));
            config.setFiles(toIntExact((long) obj.get("files")));
            JSONArray jsonArray = (JSONArray) obj.get("forbiddenExtensions");

            Iterator<String> iterator = jsonArray.iterator();
            ArrayList<String> forbiddenExtensions = new ArrayList<>();
            while (iterator.hasNext()) {
                forbiddenExtensions.add(iterator.next());
            }
            config.setForbiddenExtensions(forbiddenExtensions);

            return config;
        } catch (ParseException e) {
            System.out.println("Jason parse exception!");
        }
        return null;
    }

    public int getBytes() {
        return bytes;
    }

    public int getFiles() {
        return files;
    }

    public ArrayList<String> getForbiddenExtensions() {
        return forbiddenExtensions;
    }

    public void setBytes(int bytes) {
        this.bytes = bytes;
    }

    public void setFiles(int files) {
        this.files = files;
    }

    public void setForbiddenExtensions(ArrayList<String> forbiddenExtensions) {
        this.forbiddenExtensions = forbiddenExtensions;
    }
}