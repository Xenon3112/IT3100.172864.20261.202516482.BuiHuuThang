import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingAndCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử mảng
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] myArray = new int[n];

        // Nhập từng phần tử
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            myArray[i] = scanner.nextInt();
        }

        // In mảng ban đầu
        System.out.println("\nOriginal Array: " + Arrays.toString(myArray));

        // Sắp xếp mảng tăng dần
        Arrays.sort(myArray);
        System.out.println("Sorted Array:   " + Arrays.toString(myArray));

        // Tính tổng và trung bình cộng
        int sum = 0;
        for (int num : myArray) {
            sum += num;
        }
        double average = (double) sum / myArray.length;

        // In kết quả
        System.out.println("Sum of array elements: " + sum);
        System.out.printf("Average value of array elements: %.2f\n", average);

        scanner.close();
    }
}