import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class GUI extends Frame implements ActionListener{

    String msg = "";
    double[][] matrix;
    double[] passValue;
    Button calculate;
    boolean error;

    /**The TextField is to take the input from the user of the variable values.
     * The Labels are to provide clarity as to which Text field corresponds to which variable.
     */
    TextField x1, x2, x3, y1, y2, y3, z1, z2, z3, c1, c2, c3;
    Label equation1x, equation1y, equation1z, equation1e, add1e1, add1e2, equation2x, equation2y, equation2z, equation2e, add2e1, add2e2, equation3x, equation3y, equation3z, equation3e, add3e1, add3e2, extra;

    GUI()
    { 
        /**Here the The Label objects, Button objects, Text Field Objects are being created. Which later on will add to the Frame.
         * The bounds are set respectively for each element to increase its asthetic appeal.
         * Action Listners in case of Buttons are also attached.
         * The matrix is to store the input as processing the equation in form of Matrix(i.e 2D array) is easier.
         */
        matrix = new double[3][4];

        equation1x = new Label("x1");
        equation1y = new Label("y1");
        equation1z = new Label("z1");
        equation1e = new Label("=");
        add1e1 = new Label("+");
        add1e2 = new Label("+");

        equation2x = new Label("x2");
        equation2y = new Label("y2");
        equation2z = new Label("z2");
        equation2e = new Label("=");
        add2e1 = new Label("+");
        add2e2 = new Label("+");

        equation3x = new Label("x3");
        equation3y = new Label("y3");
        equation3z = new Label("z3");
        equation3e = new Label("=");
        add3e1 = new Label("+");
        add3e2 = new Label("+");
        

        equation1x.setBounds(70, 40, 15, 30);
        add1e1.setBounds(90, 40, 15, 30);
        equation1y.setBounds(140, 40, 15, 30);
        add1e2.setBounds(160, 40, 15, 30);
        equation1z.setBounds(210, 40, 15, 30);
        equation1e.setBounds(250, 40, 15, 30);
        
        equation2x.setBounds(70, 80, 15, 30);
        add2e1.setBounds(90, 80, 15, 30);
        equation2y.setBounds(140, 80, 15, 30);
        add2e2.setBounds(160, 80, 15, 30);
        equation2z.setBounds(210, 80, 15, 30);
        equation2e.setBounds(250, 80, 15, 30);

        equation3x.setBounds(70, 120, 15, 30);
        add3e1.setBounds(90, 120, 15, 30);
        equation3y.setBounds(140, 120, 15, 30);
        add3e2.setBounds(160, 120, 15, 30);
        equation3z.setBounds(210, 120, 15, 30);
        equation3e.setBounds(250, 120, 15, 30);

        calculate = new Button("Calculate");

        calculate.setBounds(150, 200, 80, 30);


        x1 = new TextField();
        y1 = new TextField();
        z1 = new TextField();
        c1 = new TextField();

        x2 = new TextField();
        y2 = new TextField();
        z2 = new TextField();
        c2 = new TextField();

        x3 = new TextField();
        y3 = new TextField();
        z3 = new TextField();
        c3 = new TextField();


        x1.setBounds(40, 40, 20, 30);
        y1.setBounds(110, 40, 20, 30);
        z1.setBounds(180, 40, 20, 30);
        c1.setBounds(270, 40, 20, 30);

        x2.setBounds(40, 80, 20, 30);
        y2.setBounds(110, 80, 20, 30);
        z2.setBounds(180, 80, 20, 30);
        c2.setBounds(270, 80, 20, 30);

        x3.setBounds(40, 120, 20, 30);
        y3.setBounds(110, 120, 20, 30);
        z3.setBounds(180, 120, 20, 30);
        c3.setBounds(270, 120, 20, 30);

        
        add(equation1x);
        add(equation1y);
        add(equation1z);
        add(equation1e);
        add(add1e1);
        add(add1e2);

        add(equation2x);
        add(equation2y);
        add(equation2z);
        add(equation2e);
        add(add2e1);
        add(add2e2);

        add(equation3x);
        add(equation3y);
        add(equation3z);
        add(equation3e);
        add(add3e1);
        add(add3e2);

        add(x1);
        add(y1);
        add(z1);
        add(c1);

        add(x2);
        add(y2);
        add(z2);
        add(c2);

        add(x3);
        add(y3);
        add(z3);
        add(c3);


        add(calculate);
        calculate.addActionListener(this);

        extra = new Label("*Only Numeric Data");
        extra.setBounds(250, 280, 50, 20);
        add(extra);

        /**
         * This here has been added so that upon clicking the exit of the window it closes.
         * It is a lambda expresion
         */
        addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent ae)
    {
        try{
            /**Here the values from the TextField is being stored in the matrix.
             * Here the use of the Integer.parseInt() is to check whether the input value is numeric or not
             * Now, it is within the try block, as in case of any value other than Numeric it will throw a NumberFormat Exception.
             */
            matrix[0][0] = Integer.parseInt(x1.getText());
            matrix[0][1] = Integer.parseInt(y1.getText());
            matrix[0][2] = Integer.parseInt(z1.getText());
            matrix[0][3] = Integer.parseInt(c1.getText());

            matrix[1][0] = Integer.parseInt(x2.getText());
            matrix[1][1] = Integer.parseInt(y2.getText());
            matrix[1][2] = Integer.parseInt(z2.getText());
            matrix[1][3] = Integer.parseInt(c2.getText());

            matrix[2][0] = Integer.parseInt(x3.getText());
            matrix[2][1] = Integer.parseInt(y3.getText());
            matrix[2][2] = Integer.parseInt(z3.getText());
            matrix[2][3] = Integer.parseInt(c3.getText());

        }catch(NumberFormatException e)
        {
            /**
             * Here the exception is being managed to ensure smooth execution of the rest of the program.
             * Here a call to FormatExceptionGUI is made which handles the exception, and displays the output to the user GRAPHICALLY.
             * If this catch block executes then the code beyond this block is rendered useless.
             */
           System.out.println("Number Format Exception Occurred. Only Numeric entries Allowed!!");
           FormatExceptionGUI excepGui = new FormatExceptionGUI();
           excepGui.setSize(new Dimension(400, 100));
           excepGui.setTitle("ERROR");
           excepGui.setVisible(true);
           return;
        }

        /**
         * Till now I have got the values, and have stored them in a 2D Array called matrix. 
         * Now, I have created an Instance of CLass GaussSeidel where processing of the input takes place and the ouptut is returned.
         * gaussSeidel.print() will print out the matrix which was sent to be operated upon.
         * gaussSeidel.solve return a 3x1 Matrix containg the final values of x, y, and z.
         */
        GaussSeidel gausSeidel = new GaussSeidel(matrix);

        if (!gausSeidel.makeDominant())
        {
            System.out.println("The system isn't diagonally dominant: " + "The method cannot guarantee convergence.");
            error = true;
        }

        System.out.println();
        gausSeidel.print();
        passValue = gausSeidel.solve();
        
        /**
         * PostGUI is used to reder the ouput received from the GaussSeidel Graphically.
         */
        PostGUI postGUI = new PostGUI(passValue, error);
        postGUI.setSize(new Dimension(200, 200));
        postGUI.setTitle("RESULT");
        postGUI.setVisible(true);
    }
    

}
