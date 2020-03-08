package applicationcontrollerexample;
/**
 * Aaron Foote
 *
 */
import java.util.HashMap;
import java.util.Scanner;

public class BikeMenuHandler implements Handler {

    public BikeMenuHandler() {
    }

    @Override
    public Object handleIt(HashMap<String, Object> data) {
        System.out.println("Bicycle List:");
        System.out.println("\t1-View Bike List");
        System.out.println("\t2-Add Bike to List");
        System.out.println("\t0-Exit");
        System.out.print("Choose (1, 2, or 0): ");

        Scanner scanner = (Scanner)data.get("scanner");
        int selection = GetNextInt(scanner);
        return selection;
    }//end handleIt

    private int GetNextInt (Scanner scanner) {
        String input = scanner.nextLine();
        try {
            int result = Integer.parseInt(input);
            return result;
        } catch (Exception e) {
            System.out.println("Oops that didn't work , please try again.");
            return -1;
        }
    }//end GetNextInt
}//end BikeMenuHandler