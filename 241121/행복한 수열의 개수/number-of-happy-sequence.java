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

        int answer = 0;
        for (int k = 0; k < n; k++) {
            for (int i = 0; i <= n - m; i++) {
                int count = 1;
                for (int j = i; j < i + m - 1; j++) {
                    if (board[k][j] == board[k][j + 1]) {
                        count++;
                    }
                }

                if (count >= m) {
                    answer++;
                    break;
                }
            }
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i <= n - m; i++) {
                int count = 1;
                for (int j = i; j < i + m - 1; j++) {
                    if (board[j][k] == board[j + 1][k]) {
                        count++;
                    }
                }

                if (count >= m) {
                    answer++;
                    break;
                }
            }
        }
        
        System.out.print(answer);
    }
}