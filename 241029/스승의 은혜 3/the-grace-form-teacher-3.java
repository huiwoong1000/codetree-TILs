import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] priceArr = new int[n];
        int[] deliveryCharges = new int[n];
        for (int i = 0; i < n; i++) {
            priceArr[i] = sc.nextInt();
            deliveryCharges[i] = sc.nextInt();
        }

        int resultCount = 0;

        for (int i = 0; i < n; i++) {
            int[] totalPriceArr = new int[n];
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    totalPriceArr[j] = priceArr[j] / 2 + deliveryCharges[j];
                } else {
                    totalPriceArr[j] = priceArr[j] + deliveryCharges[j];
                }
            }

            Arrays.sort(totalPriceArr);
            int count = 0;
            int money = b;
            for (int j = 0; j < n; j++) {
                money -= totalPriceArr[j];
                if (money >= 0) {
                    count++;
                }
            }

            resultCount = Math.max(resultCount, count);
        }

        System.out.println(resultCount);
    }
}