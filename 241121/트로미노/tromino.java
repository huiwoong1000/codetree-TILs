import java.util.*;

public class Main {

    private static int n;
    private static int m;
    private static int[][] board;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        board = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        System.out.print(Math.max(getMaxCountWithBlock1(), getMaxCountWithBlock2()));
    }

    private static int getMaxCountWithBlock1() {

        int maxCount = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < m - 1; j++) {
                int[] candidates = {board[i][j], board[i][j + 1], board[i + 1][j], board[i + 1][j + 1]};
                Arrays.sort(candidates);
                maxCount = Math.max(maxCount, candidates[1] + candidates[2] + candidates[3]);
            }
        }

        return maxCount;
    }

    private static int getMaxCountWithBlock2() {

        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 2; j++) {
                maxCount = Math.max(maxCount, board[i][j] + board[i][j + 1] + board[i][j + 2]);
            }
        }

        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n; j++) {
                maxCount = Math.max(maxCount, board[i][j] + board[i + 1][j] + board[i + 2][j]);
            }
        }

        return maxCount;
    }
}