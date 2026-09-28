import javax.swing.JOptionPane;

public class EquationsSolver {
    public static void main(String[] args) {
        String choiceStr = JOptionPane.showInputDialog(
            "=== CHƯƠNG TRÌNH GIẢI PHƯƠNG TRÌNH ===\n" +
            "1. Phương trình bậc nhất 1 ẩn (ax + b = 0)\n" +
            "2. Hệ phương trình bậc nhất 2 ẩn\n" +
            "3. Phương trình bậc hai 1 ẩn (ax^2 + bx + c = 0)\n" +
            "Nhập lựa chọn (1-3):"
        );

        if (choiceStr == null) System.exit(0);
        int choice = Integer.parseInt(choiceStr);

        switch (choice) {
            case 1:
                double a = Double.parseDouble(JOptionPane.showInputDialog("Nhập a:"));
                double b = Double.parseDouble(JOptionPane.showInputDialog("Nhập b:"));
                if (a == 0) {
                    JOptionPane.showMessageDialog(null, (b == 0) ? "Vô số nghiệm" : "Vô nghiệm");
                } else {
                    JOptionPane.showMessageDialog(null, "Nghiệm x = " + (-b / a));
                }
                break;
            case 2:
                double a11 = Double.parseDouble(JOptionPane.showInputDialog("Nhập a11:"));
                double a12 = Double.parseDouble(JOptionPane.showInputDialog("Nhập a12:"));
                double b1  = Double.parseDouble(JOptionPane.showInputDialog("Nhập b1:"));
                double a21 = Double.parseDouble(JOptionPane.showInputDialog("Nhập a21:"));
                double a22 = Double.parseDouble(JOptionPane.showInputDialog("Nhập a22:"));
                double b2  = Double.parseDouble(JOptionPane.showInputDialog("Nhập b2:"));

                double D  = a11 * a22 - a21 * a12;
                double D1 = b1  * a22 - b2  * a12;
                double D2 = a11 * b2  - a21 * b1;

                if (D != 0) {
                    JOptionPane.showMessageDialog(null, "x1 = " + (D1 / D) + "\nx2 = " + (D2 / D));
                } else {
                    JOptionPane.showMessageDialog(null, (D1 == 0 && D2 == 0) ? "Vô số nghiệm" : "Vô nghiệm");
                }
                break;
            case 3:
                double a2 = Double.parseDouble(JOptionPane.showInputDialog("Nhập a:"));
                double b22 = Double.parseDouble(JOptionPane.showInputDialog("Nhập b:"));
                double c = Double.parseDouble(JOptionPane.showInputDialog("Nhập c:"));

                if (a2 == 0) {
                    JOptionPane.showMessageDialog(null, (b22 == 0) ? ((c == 0) ? "Vô số nghiệm" : "Vô nghiệm") : "x = " + (-c / b22));
                } else {
                    double delta = b22 * b22 - 4 * a2 * c;
                    if (delta > 0) {
                        double x1 = (-b22 + Math.sqrt(delta)) / (2 * a2);
                        double x2 = (-b22 - Math.sqrt(delta)) / (2 * a2);
                        JOptionPane.showMessageDialog(null, "x1 = " + x1 + "\nx2 = " + x2);
                    } else if (delta == 0) {
                        JOptionPane.showMessageDialog(null, "Nghiệm kép x = " + (-b22 / (2 * a2)));
                    } else {
                        JOptionPane.showMessageDialog(null, "Vô nghiệm thực");
                    }
                }
                break;
        }
        System.exit(0);
    }
}