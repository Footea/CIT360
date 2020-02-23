/**
 * Aaron Foote
 * MVC
 */

package MVC;

public class MVCAverageNumber {
    public static void main(String[] args) {

        AverageNumberView theView = new AverageNumberView();

        AverageNumberModel theModel = new AverageNumberModel();

        new AverageNumberController(theView, theModel);

        theView.setVisible(true);

    }
}
