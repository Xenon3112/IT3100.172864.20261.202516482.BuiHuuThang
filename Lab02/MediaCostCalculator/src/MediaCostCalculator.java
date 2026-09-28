public class MediaCostCalculator {
    public static void main(String[] args) {
        String[] title = {"Lion King", "Star Wars", "Aladin", "Frozen", "Coco"};
        double[] cost = {19.95, 24.95, 18.99, 27.50, 15.00};

        int maxIdx = 0, minIdx = 0;
        double total = 0;

        for (int i = 0; i < cost.length; i++) {
            // Tìm vị trí giá lớn nhất và nhỏ nhất
            if (cost[i] > cost[maxIdx]) maxIdx = i;
            if (cost[i] < cost[minIdx]) minIdx = i;

            // Giảm 10% (nhân 0.9) nếu giá lớn hơn $20
            double finalCost = cost[i] > 20 ? cost[i] * 0.9 : cost[i];
            total += finalCost;
        }

        // In kết quả
        System.out.println("Max cost media: " + title[maxIdx] + " - $" + cost[maxIdx]);
        System.out.println("Min cost media: " + title[minIdx] + " - $" + cost[minIdx]);
        System.out.printf("Total cost after discount: $%.2f\n", total);
    }
}