import java.awt.*;
import java.awt.event.*;

/**
 * This class is part of Exception Handling which is executed when non numeric values are entered.
 * It displays a simple Error message using the TextArea element
 * WindowListener has also been added to facilitate the closing of the window using Toggle Buttons
 */
@SuppressWarnings("serial")
public class FormatExceptionGUI extends Frame{

    String msg= "Only NUMERIC VALUES ALLOWED!!!!"+ 
                "Restart the Program!";

    TextArea  errMsg;
    FormatExceptionGUI()
    {
        errMsg = new TextArea(msg, 300, 300);
        add(errMsg);
        
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }
    
}
