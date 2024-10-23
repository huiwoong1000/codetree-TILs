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
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = i - k; j <= i + k; j++) {
                if (0 <= j && j < numbers.length) {
                    count += numbers[j];
                }
            }
            
            maxCount = Math.max(maxCount, count);
        }

        System.out.print(maxCount);
    }
}