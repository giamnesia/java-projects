import javax.swing.JOptionPane;

public class main {

    public static void main (String[] args){
        double num1, num2, addition;
        String operator;
        String test;

         test= JOptionPane.showInputDialog ("Enter First Number: ");
         num1= Double.parseDouble(test);
         test= JOptionPane.showInputDialog("Enter Second Number");
        num2= Double.parseDouble(test);
        test= JOptionPane.showInputDialog("Choose operator (+, -, *, / )");
        operator=test;

        if (operator.equals ("+")){
            compute x= new compute();
            compute.add(num1,num2);
            JOptionPane.showMessageDialog( null,
                    "Answer : " + compute.num1 + " + " + compute.num2 + " = "+ compute.add);
        }

       else if (operator.equals ("-")){
            compute x= new compute();
            compute.subtraction(num1,num2);
            JOptionPane.showMessageDialog( null,
                    "Answer : " + compute.num1 + " - " + compute.num2 + " = "+ compute.subtraction);
        }
        else if (operator.equals ("*")){
            compute x= new compute();
            compute.multiply(num1,num2);
            JOptionPane.showMessageDialog( null,
                    "Answer : " + compute.num1 + " * " + compute.num2 + " = "+ compute.multiply);
        }
        else if (operator.equals ("/")){
            compute x= new compute();
            compute.divide(num1,num2);
            JOptionPane.showMessageDialog( null,
                    "Answer : " + compute.num1 + " / " + compute.num2 + " = "+ compute.divide );
        }
        else {
            JOptionPane.showMessageDialog(null,
                    "Wrong Operator",
                    "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }

    }
}
