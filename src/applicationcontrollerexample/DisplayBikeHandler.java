package applicationcontrollerexample;
/**
 * Aaron Foote
 * Display library
 */
import java.util.HashMap;

//import model.Library;

public class DisplayBikeHandler implements Handler {

    @Override
    public Object handleIt(HashMap<String, Object> data) {
        Library library = (Library) data.get("library");

        String s = library.toString();
        System.out.println(s);
        return null;

    }//end handleIt
}//end DisplayBikeHandler
