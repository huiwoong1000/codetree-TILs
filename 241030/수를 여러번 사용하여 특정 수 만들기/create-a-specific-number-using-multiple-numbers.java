import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maxSum = 0;
        for (int i = 0; i <= c; i += a) {
            for (int j = 0; j <= c; j += b) {
                int sum = i + j;
                if (sum <= c) {
                    maxSum = Math.max(maxSum, sum);
                }
            }
        }

        System.out.print(maxSum);
    }
}