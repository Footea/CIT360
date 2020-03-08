package applicationcontrollerexample;
/**
 * Aaron Foote
 * Application controller
 */

import java.util.HashMap;
//import java.util.logging.Handler;

public class BikeAppController {
    private HashMap<String, Handler> commands;

    public BikeAppController() {
        commands = new HashMap<String, Handler>();
        commands.put("addBicycle", new AddBikeHandler());
        commands.put("bikeselection", new DisplayBikeHandler());
        commands.put("bikemenu", new BikeMenuHandler());
    }

    public Object doCommand(String commandKey, HashMap<String, Object> commandData) throws Exception {
        Handler command = commands.getOrDefault(commandKey, null);
        if (command == null) {
            throw new Exception("There is no command with the key word '" + commandKey + "'.");
        }

        return command.handleIt(commandData);
    }

}//end BikeAppController class
