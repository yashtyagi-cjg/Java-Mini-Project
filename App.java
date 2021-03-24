import java.awt.*;


/**This is the driver code it makes a call to IntroGUI which displays a welocome message and a Continue Button
 * When Continue Button is pressed it makes a call to GUI class, where the graphical display has been rendered
 * If non-numeric values are entered then a call to FormatExceptionGUIclass is made.
 * When correct values are entered, then a call to GaussSeidel class is made which print the input and gives the solved output.
 * Now This output is transferred to the POSTGUI class which renders the final output.
 */


public class App {
    public static void main(String[] args) throws Exception {
        IntroGUI initialGUI = new IntroGUI();
        initialGUI.setSize(new Dimension(400, 400));
        initialGUI.setTitle("GAUSS SIEDEL JAVA OPEN ENDED EXPERIMENT");
        initialGUI.setVisible(true);
    }
}
