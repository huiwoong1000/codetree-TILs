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
        int maxSize = 0;

        for (int dx = i; dx < n; dx++) {
            for (int dy = j; dy < m; dy++) {
                boolean isRectangle = true;
                for (int x = i; x <= dx; x++) {
                    for (int y = j; y <= dy; y++) {
                        if (board[x][y] <= 0) {
                            isRectangle = false;
                        }
                    }
                }

                if (isRectangle) {
                    maxSize = Math.max(maxSize, (dx - i + 1) * (dy - j + 1));
                }
            }
        }

        return maxSize;
    }
}