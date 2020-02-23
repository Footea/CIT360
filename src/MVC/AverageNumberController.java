package MVC;
/**
 * Aaron Foote
 * MVC Controller coordinates interactions with the View and Model
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class AverageNumberController {

    private AverageNumberView theView;
    private AverageNumberModel theModel;

    public AverageNumberController(AverageNumberView theView, AverageNumberModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        // Tell the View that whenever the average button
        // is clicked to execute the actionPerformed method
        // in the NumberListener inner class

        this.theView.addNumberListener(new NumberListener());
    }

    class NumberListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            int firstNumber, secondNumber, thirdNumber;

            // Surround interactions with the view with
            // a try block in case numbers weren't
            // properly entered

            try{

                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();
                thirdNumber = theView.getThirdNumber();

                theModel.addThreeNumbers(firstNumber, secondNumber, thirdNumber);

                theView.setAverageSolution(theModel.getAverageNumberValue());

            }

            catch(NumberFormatException ex){

                System.out.println(ex);

                theView.displayErrorMessage("Please input an Integer in each box");

            }

        }

    }
}
