package applicationcontrollerexample;
/**
 * Aaron Foote
 * The library of bikes
 */
import java.util.ArrayList;

public class Library {

    private ArrayList<Bicycle> bicycles;

    public Library() {
        bicycles = new ArrayList<>();
        String diamondback = "DiamondBack";
        String mountain = "Mountain";
        String road = "Road";

        bicycles.add(new Bicycle(diamondback, "Release 3", mountain, Type.FULL_SUSPENSION));
        bicycles.add(new Bicycle(diamondback, "Clutch 1", mountain, Type.FULL_SUSPENSION));
        bicycles.add(new Bicycle(diamondback, "Overdrive 29", mountain, Type.HARDTAIL));

        bicycles.add(new Bicycle(diamondback, "HaanJo 7C Carbon", road, Type.GRAVEL));
        bicycles.add(new Bicycle(diamondback, "Century 5C Carbon", road, Type.ENDURANCE));
        bicycles.add(new Bicycle(diamondback, "Arden 4 Carbon", road, Type.ENDURANCE));
        bicycles.add(new Bicycle(diamondback, "HaanJenn 2", road, Type.GRAVEL));
        bicycles.add(new Bicycle(diamondback, "Andean 1", road, Type.TRIATHLON));
    }

    public void addBicycle(Bicycle bicycle) {
        this.bicycles.add(bicycle);
    }

//	@Override
//	public String toString() {
//		return "Library [bicycles=" + bicycles + "]";
//	}

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Library [Bicycles=\n\t");
        ArrayList<String> bicycleList = new ArrayList<>();
        for(Bicycle bicycle : bicycles) {
            bicycleList.add(bicycle.toString());
        }
        String bicycleStrings = String.join(",\n\t", bicycleList);
        builder.append(bicycleStrings);
        builder.append("\n]");
        return builder.toString();
    }


}//end Library class
