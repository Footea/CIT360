package applicationcontrollerexample;
/**
 * Aaron Foote
 *The type options for bikes
 */
public enum Type {

    FULL_SUSPENSION("Full Suspension "),
    HARDTAIL("Hardtail"),
    GRAVEL("Gravel"),
    ENDURANCE("Endurance"),
    TRIATHLON("Triathlon"),
    OTHER("Other");

    private String name;

    private Type(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}//end Type
