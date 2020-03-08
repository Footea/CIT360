package applicationcontrollerexample;
/**
 * Aaron Foote
 *
 */
import java.util.HashMap;

public interface Handler {
    public Object handleIt(HashMap<String, Object> data);
}//end Handler
