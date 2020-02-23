package MVC;

/**
 * Aaron Foote
 * MVC View displays what the user will see
 */

import java.awt.event.ActionListener;

import javax.swing.*;

public class AverageNumberView extends JFrame {
    private JTextField firstNumber  = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secondNumber = new JTextField(10);
    private JLabel additionLabel2 = new JLabel("+");
    private JTextField thirdNumber = new JTextField(10);
    private JButton AverageButton = new JButton("Average");
    private JTextField AverageSolution = new JTextField(10);

   AverageNumberView(){

        // Sets up the view and adds the components

        JPanel userPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 200);

        userPanel.add(firstNumber);
        userPanel.add(additionLabel);
        userPanel.add(secondNumber);
        userPanel.add(additionLabel2);
        userPanel.add(thirdNumber);
        userPanel.add(AverageButton);
        userPanel.add(AverageSolution);

        this.add(userPanel);



    } // End of AverageNumberView

    public int getFirstNumber(){

        return Integer.parseInt(firstNumber.getText());

    }

    public int getSecondNumber(){

        return Integer.parseInt(secondNumber.getText());

    }

    public int getThirdNumber(){

        return Integer.parseInt(thirdNumber.getText());

    }

    public int getAverageSolution(){

        return Integer.parseInt(AverageSolution.getText());

    }

    public void setAverageSolution(int solution){

        AverageSolution.setText(Integer.toString(solution));

    }

    // If the Average Button is clicked execute a method
    // in the Controller named actionPerformed

    void addNumberListener(ActionListener listenForAverageButton){

        AverageButton.addActionListener(listenForAverageButton);

    }

    // Open a popup that contains the error message passed

    void displayErrorMessage(String errorMessage){

        JOptionPane.showMessageDialog(this, errorMessage);

    }


}  // end of AverageNumberView extends
