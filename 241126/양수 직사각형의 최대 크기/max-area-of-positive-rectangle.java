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

        int maxSize = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                maxSize = Math.max(maxSize, getMaxPositiveRectangleSize(i, j));
            }
        }

        System.out.print(maxSize);
    }

    private static int getMaxPositiveRectangleSize(int i, int j) {

        int width = 0;
        int height = 0;

        for (int y = j; y < m; y++) {
            if (board[i][y] < 0) {
                width = y - j;
                break;
            }

            width = m - j;
        }

        for (int x = i; x < n; x++) {
            boolean isRectangle = true;

            for (int y = j; y < width; y++) {
                if (board[x][y] < 0) {
                    height = x - i;
                    isRectangle = false;
                    break;
                }
            }

            if (!isRectangle) {
                break;
            } else {
                height = n - i;
            }
        }

        return width * height;
    }
}