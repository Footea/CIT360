package applicationcontrollerexample;
/**
 * Aaron Foote
 * Adds new bikes to library
 */
import java.util.HashMap;
import java.util.Scanner;

//import main.model.Bike;
//import main.model.Model;
//import main.model.Library;

public class AddBikeHandler implements Handler {

    @Override
    public Object handleIt(HashMap<String, Object> data) {
        Scanner scanner = (Scanner) data.get("scanner");
        Library library = (Library) data.get("library");

        System.out.print("Enter bicycle maker: ");
        String maker = scanner.nextLine();
        System.out.print("Enter the model of your bike: ");
        String model = scanner.nextLine();
        System.out.print("Enter the use Road or Mountain: ");
        String use = scanner.nextLine();
        System.out.println("Bike Type:");
        int i = 1;
        Type[] types = Type.values();
        int typeSelection = 0;
        while (typeSelection < 1 || typeSelection > types.length) {
            for (Type type : types) {
                System.out.println(i++ + "-" + type.toString());
            }
            System.out.print("Bike Type: ");
            typeSelection = GetNextInt(scanner);
            i = 1;
        }
        Type selectedType = types[typeSelection - 1];

        Bicycle newBicycle = new Bicycle(maker, model, use, selectedType);
        library.addBicycle(newBicycle);
        return null;
    }

    private int GetNextInt(Scanner scanner) {
        String input = scanner.nextLine();
        try {
            return Integer.parseInt(input);
        } catch (Exception e) {
            System.out.println("Please choose a type from the list");
            return -1;
        }

    }//end handleIt


}//end AddBikeHandler class
