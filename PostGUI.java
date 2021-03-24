import java.awt.*;
import java.awt.event.*;

/** This class is used to display the final output of the Program 
 * 
 */
@SuppressWarnings("serial")
public class PostGUI extends Frame implements ActionListener{
    boolean error = false;
    double[] finalValues;
    Button exit;
    Label result;
    Label errStatement;
    Label info;

    PostGUI(double[] tempResult, boolean e)
    {
        finalValues = tempResult;
        error = e;

        //Internal Mathematical Logic
        if(error)
        {
            errStatement = new Label("The system isn't diagonally dominant: The method cannot guarantee convergence.");
            errStatement.setBounds(40, 40, 450, 20); 
            add(errStatement);
        }

        //To display the final values on screen 
        result = new Label("The final values are x = " + finalValues[0] + ", y = " + finalValues[1] + ", z = " + finalValues[2]);
        result.setBounds(40, 60, 450, 20);
        add(result);

        //To inform user on how to exit the program
        info = new Label("Click anywhere on the screen to exit!");
        info.setBounds(60, 90, 250, 20);
        add(info);
    
        exit = new Button("");
        add(exit);
        exit.setBounds(60, 100, 20, 40);
        exit.addActionListener(this);

        //To enable user control over window's close Button
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }

    // To determine what action to take when button is pressed
    public void actionPerformed(ActionEvent ae)
    {
        System.exit(0);
    }

}
