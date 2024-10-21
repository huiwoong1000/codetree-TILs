import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int maxCount = -1;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 2; j++) {
                int firstCount = array[i][j] + array[i][j + 1] + array[i][j + 2];
                int secondCount = 0;

                for (int k = i; k < n - 1; k++) {
                    for (int l = j; l < n - 2; l++) {
                        secondCount = array[k + 1][l] + array[k + 1][l + 1] + array[k + 1][l + 2];
                        if (maxCount < firstCount + secondCount) {
                            maxCount = firstCount + secondCount;
                        }

                        if (n - l > 5) {
                            secondCount = array[k][l + 3] + array[k][l + 4] + array[k][l + 5];
                            if (maxCount < firstCount + secondCount) {
                                maxCount = firstCount + secondCount;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(maxCount);
    }
}