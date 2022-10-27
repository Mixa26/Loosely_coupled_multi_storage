import java.util.ArrayList;

public class Metadata {
    private ArrayList<String> names;
    private boolean validResponse;

    public Metadata(ArrayList<String> names){
        this.names = names;
        validResponse = true;
    }

    public Metadata(boolean validResponse){
        this.validResponse = validResponse;
        this.names = new ArrayList<String>();
    }

    public Metadata(){
        this.names = new ArrayList<String>();
        this.validResponse = false;
    }

    public ArrayList<String> getNames() {
        return names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }

    public void setValidResponse(boolean validResponse) {
        this.validResponse = validResponse;
    }

    public boolean isValidResponse() {
        return validResponse;
    }
}
