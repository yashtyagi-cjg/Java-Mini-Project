import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class IntroGUI extends Frame implements ActionListener
{
    /**The message encountered when the code is executed
     * 
     */
    String msg="""
        Greetings Ma'am,
        I hope you are having a great day on the other side 
        of the screen. I have prepared my JAVA LAB's Mini 
        Project on the implementing the Gauss Siedel Method
        Gauss Siedel Method is an iterative method to find 
        the roots of simultaneous equation. I have used the 
        principle of OOPS, Exception Handling, Abstract Window 
        Toolkit, Multi Threading, Annotations, and the keen 
        acumen of a Java Programmer.
                                                                 
                """;

    Button continueTo;

    public IntroGUI()
    {
        /**
         * BorderLayout() manager is used to display a Text Area and to position the continue button
         * Below the TextArea is initialized and position along wiht the "Continue" Button
         */
        setLayout(new BorderLayout());
        add(new TextArea(msg), BorderLayout.CENTER);

        continueTo = new Button("Continue");
        add(continueTo, BorderLayout.EAST);
        continueTo.addActionListener(this);

        /**Lambda Expression so that window can be closed using window's toggle buttons. */
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae)
    {
        /**
         * Call to GUI class
         * Where the Gauss Seidel Calculator's Interface is residing
         */
        GUI initialGUI = new GUI();
        initialGUI.setSize(new Dimension(400, 300));
        initialGUI.setTitle("GAUSS SIEDEL JAVA OPEN ENDED EXPERIMENT");
        initialGUI.setVisible(true);
    }
}
