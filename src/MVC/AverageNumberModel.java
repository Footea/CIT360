package MVC;

/**
 * Aaron Foote
 * MVC Model performs operations for MVC
 */

public class AverageNumberModel {

    private int AverageNumberValue;

    public void addThreeNumbers(int firstNumber, int secondNumber, int thirdNumber){

        AverageNumberValue = (firstNumber + secondNumber + thirdNumber) /3;

    }  // End of addThreeNumbers

    public int getAverageNumberValue(){

        return AverageNumberValue;

    }  // End of getAverageNumberValue


}// End AverageNumberModel
