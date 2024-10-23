import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] numbers = new int[101];

        for (int i = 0; i < n; i++) {
            int candy = sc.nextInt();
            int index = sc.nextInt();
            numbers[index] += candy;
        }

        int maxCount = 0;
        for (int i = k; i < numbers.length - k; i++) {
            int count = 0;
            for (int j = i - k; j <= i + k; j++) {
                count += numbers[j];
            }

            maxCount = Math.max(maxCount, count);
        }

        System.out.print(maxCount);
    }
}