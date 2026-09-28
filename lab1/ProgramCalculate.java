import javax.swing.JOptionPane;

public class ProgramCalculate {
    public static void main(String[] args) {
        String strNum1 ;
        String strNum2 ;

        strNum1 = JOptionPane.showInputDialog(null,
                "Please input the first number: ", "Input the first number",
                JOptionPane.INFORMATION_MESSAGE);

        strNum2 = JOptionPane.showInputDialog(null,
                "Please input the second number: ", "Input the second number",
                JOptionPane.INFORMATION_MESSAGE);

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;

        System.out.println("Sum: " + sum);
        System.out.println("difference: " + difference);
        System.out.println("product: " + product);
        System.out.println("quotient: " + quotient);
    }
}