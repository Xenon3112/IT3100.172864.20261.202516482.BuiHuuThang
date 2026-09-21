import java.util.Scanner;

public class AddStarsTriangle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter height n: ");
        int n = keyboard.nextInt();

        for (int i = 1; i <= n; i++) {
        	
            // In số dấu sao (*) tương ứng (2*i - 1)
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Xuống dòng sau mỗi hàng
            System.out.println();
        }
        
        keyboard.close();
    }
}