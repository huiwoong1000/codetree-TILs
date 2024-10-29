import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int maxCount = 0;
        for (int k = 1; k <= 100; k++) {
            int count = 0;
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if ((numbers[j] - k) == (k - numbers[i])) {
                        count++;
                    }
                }
            }

            maxCount = Math.max(maxCount, count);
        }

        System.out.print(maxCount);
    }
}