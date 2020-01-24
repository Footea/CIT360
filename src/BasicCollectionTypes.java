/**
 * Aaron Foote
 * Collection Types
 */
import java.util.*;

public class BasicCollectionTypes {
    public static void main(String[] args) {

//       Scanner input = new Scanner(System.in);
        //System.out.print("Please enter 5 different fruits);

        System.out.println("----- SET -----");
        // create a set, does not show duplicate entries
        Set fruitset = new HashSet();
        fruitset.add(" apple");
        fruitset.add(" orange");
        fruitset.add(" strawberry");
        fruitset.add(" banana");
        fruitset.add(" blueberry");
        fruitset.add(" banana");

        System.out.println("Set: " + fruitset);

        for (String value : (Iterable<String>) fruitset) {
            if (value.equals("banana")) {
                fruitset.add("yummy fruit");
            }
        }
        System.out.println("New Set after for loop: " + fruitset);

        System.out.println("\n----- LIST -----");
        // create a liar
        List farmlist = new ArrayList();
        farmlist.add("Farmer");
        farmlist.add("field");
        farmlist.add("water");
        farmlist.add("harvest");

        System.out.println("List: " + farmlist);

        farmlist.remove("water");

        System.out.println("After remove(): " + farmlist);


        System.out.println("\n---- QUEUE ----");
        //create a queue
        Queue carmaker = new PriorityQueue();
        carmaker.add("Ford");
        carmaker.add("Dodge");
        carmaker.add("Porsche");
        carmaker.add("Kia");
        carmaker.add("Fiat");

        System.out.println("Before: " + carmaker);
        System.out.println("Head: " + carmaker.element());
        carmaker.remove();
        carmaker.poll();
        System.out.println("After removing two elements:" + carmaker);
        System.out.println("Head: " + carmaker.peek());

        System.out.println("\n---- MAP ----");
        //create a map
        Map vegmap = new HashMap();
        vegmap.put("orange", "Carrot");
        vegmap.put("red", "Radish");
        vegmap.put("green", "Lettuce");
        vegmap.put("brown", "Potatoes");
        vegmap.put("bright green", "Peas");
        vegmap.put("dark green", "Green Beans");
        vegmap.put("maroon", "Leaks");

       // System.out.print(vegmap);
        vegmap.forEach((key, value) -> System.out.println(key + " " + value));



    }
}


