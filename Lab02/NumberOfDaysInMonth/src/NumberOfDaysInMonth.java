import java.util.Scanner;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = 0;
        int year = -1;

        // Vòng lặp yêu cầu nhập tháng hợp lệ
        while (true) {
            System.out.print("Enter month (Full name, Abbreviation, 3 letters, or Number): ");
            String monthInput = scanner.nextLine().trim();
            month = parseMonth(monthInput);

            if (month != -1) {
                break;
            }
            System.out.println("Invalid month! Please enter again.\n");
        }

        // Vòng lặp yêu cầu nhập năm hợp lệ
        while (true) {
            System.out.print("Enter year (non-negative 4-digit number): ");
            String yearInput = scanner.nextLine().trim();

            if (yearInput.matches("\\d+") && yearInput.length() == 4) {
                year = Integer.parseInt(yearInput);
                if (year >= 0) {
                    break;
                }
            }
            System.out.println("Invalid year! Please enter again.\n");
        }

        // Tính số ngày
        int days = getDaysInMonth(month, year);
        System.out.println("\nNumber of days in month " + month + "/" + year + " is: " + days);

        scanner.close();
    }

    // Phương thức chuẩn hóa tháng nhập vào thành số từ 1 đến 12
    private static int parseMonth(String input) {
        String str = input.toLowerCase().replaceAll("\\.", ""); // Loại bỏ dấu chấm nếu có (ví dụ: Jan.)

        switch (str) {
            case "january": case "jan": case "1": return 1;
            case "february": case "feb": case "2": return 2;
            case "march": case "mar": case "3": return 3;
            case "april": case "apr": case "4": return 4;
            case "may": case "5": return 5;
            case "june": case "jun": case "6": return 6;
            case "july": case "jul": case "7": return 7;
            case "august": case "aug": case "8": return 8;
            case "september": case "sep": case "sept": case "9": return 9;
            case "october": case "oct": case "10": return 10;
            case "november": case "nov": case "11": return 11;
            case "december": case "dec": case "12": return 12;
            default: return -1; // Không hợp lệ
        }
    }

    // Kiểm tra năm nhuận
    private static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }

    // Lấy số ngày của tháng
    private static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                return 0;
        }
    }
}