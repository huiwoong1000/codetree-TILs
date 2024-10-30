import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] numbers = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            numbers[i] = sc.nextInt();
        }

        int maxSum = 0;
        for (int i = 1; i <= n; i++) {
            int sum = 0;

            int value = numbers[i];
            for (int j = 0; j < m; j++) { //'움직임'을 m번 반복
                sum += value;
                value = numbers[value];
            }

            maxSum = Math.max(maxSum, sum);
        }

        System.out.print(maxSum);
    }
}