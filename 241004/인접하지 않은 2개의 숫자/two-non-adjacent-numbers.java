import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 2; j < n; j++) {
                maxValue = Math.max(maxValue, numbers[i] + numbers[j]);
            }
        }

        System.out.print(maxValue);
    }
}