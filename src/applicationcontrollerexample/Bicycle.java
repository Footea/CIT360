package applicationcontrollerexample;
/**
 * Aaron Foote
 *
 */
public class Bicycle {

    private String maker;
    private String model;
    private String use;
    private Type type;

    public Bicycle(String maker, String model, String use, Type type) {
        this.maker = maker;
        this.model = model;
        this.use = use;
        this.type = type;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bike [Maker: " + maker + ", Model: " + model + ", Use: " + use + ", Type: " + type.toString() + "]";
    }


}//end Bicycle class
