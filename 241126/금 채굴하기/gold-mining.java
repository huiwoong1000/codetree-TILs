import java.util.*;

public class Main {

    private static int n;
    private static int m;
    private static int[][] board;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int maxGoldCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    int goldCount = getGoldCount(i, j, k);
                    if ((goldCount * m) - (k * k + (k + 1)*(k + 1)) >= 0) {
                        maxGoldCount = Math.max(maxGoldCount, goldCount);
                    }
                }
            }
        }

        System.out.print(maxGoldCount);
    }

    private static int getGoldCount(int i, int j, int k) {

        int goldCount = 0;

        for (int x = i - k; x <= i + k; x++) {
            for (int y = j - k; y <= j + k; y++) {
                if (Math.abs(i - x) + Math.abs(j - y) > k || x < 0 || y < 0 || x > n - 1 || y > n - 1) {
                    continue;
                }

                if (board[x][y] == 1) {
                    goldCount++;
                }
            }
        }

        return goldCount;
    }
}