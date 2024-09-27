import java.util.*;

public class Main {

    private static int n = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] numbers = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        int[] di = {0, 1, 0, -1};
        int[] dj = {1, 0, -1, 0};
        int ni = 0;
        int nj = 0;
        int resultCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int oneCount = 0;

                for (int dirNum = 0; dirNum < 4; dirNum++) {
                    ni = i + di[dirNum];
                    nj = j + dj[dirNum];
                    if (isInRange(ni, nj) && numbers[ni][nj] == 1) {
                        oneCount++;
                    }
                }

                if (3 <= oneCount) {
                    resultCount++;
                }
            }
        }

        System.out.print(resultCount);
    }

    private static boolean isInRange(int i, int j) {
        return (0 <= i && i < n) && (0 <= j && j < n);
    }
}