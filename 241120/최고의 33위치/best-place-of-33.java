import java.util.*;

public class Main {

    private static int n;
    private static int[][] board;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int maxCoinCount = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                maxCoinCount = Math.max(maxCoinCount, getCountOfCoin(i, j));
            }
        }

        System.out.print(maxCoinCount);
    }

    private static int getCountOfCoin(int i, int j) {

        int count = 0;
        for (int x = i; x <= i + 2; x++) {
            for (int y = j; y <= j + 2; y++) {
                count += board[x][y];
            }
        }

        return count;
    }
}