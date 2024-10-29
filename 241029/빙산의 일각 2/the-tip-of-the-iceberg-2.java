import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int[] afterNums = new int[n + 1];
        int maxCount = 0;
        for (int h = 1; h <= 1000; h++) {

            for (int i = 0; i < n; i++) {
                afterNums[i + 1] = numbers[i] - h;
            }

            int count = 0;
            for (int i = 1; i < n + 1; i++) {
                if (afterNums[i] > 0 && afterNums[i - 1] <= 0) {
                    count++;
                }
            }

            maxCount = Math.max(maxCount, count);
        }

        System.out.print(maxCount);
    }
}