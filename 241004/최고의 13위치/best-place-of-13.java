import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] coins = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                coins[i][j] = sc.nextInt();
            }
        }

        int maxCoinCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 2; j++) {
                maxCoinCount = Math.max(maxCoinCount, coins[i][j] + coins[i][j + 1] + coins[i][j + 2]);
            }
        }

        System.out.print(maxCoinCount);
    }
}