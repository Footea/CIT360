/**
 * Aaron Foote
 * JSON
 */

package JsonExample;

import java.util.List;

public class bike {

    //declare variables as strings, + array and list
    private String biketype;
    private String maker;
    private String model;
    private Integer size;

  //  public bike(string biketype, string maker, string[] model, list<string> size) {
  //     this.biketype = biketype;
  //      this.maker = maker;
  //      this.model = model;
  //      this.size = size;
  // }

    public String getBiketype() {
        return biketype;
    }

    public void setBiketype( String biketype) {
        this.biketype = biketype;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker( String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel( String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public String toString() {
        return "Type:" + biketype + "  Maker:" + maker + "  Model:" + model + "  Size:" + size;
    }


}
