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

        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 2; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n - 2; l++) {

                        if (i == k && Math.abs(j - l) <= 2) {
                            continue;
                        }

                        int cnt1 = array[i][j] + array[i][j + 1] + array[i][j + 2];
                        int cnt2 = array[k][l] + array[k][l + 1] + array[k][l + 2];
                        maxCount = Math.max(maxCount, cnt1 + cnt2);
                    }
                }
            }
        }

        System.out.println(maxCount);
    }
}