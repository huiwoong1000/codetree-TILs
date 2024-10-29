import java.util.*;

public class Main {

    private static int[][] segments;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        segments = new int[n][2];
        for (int i = 0; i < n; i++) {
            segments[i][0] = sc.nextInt();
            segments[i][1] = sc.nextInt();
        }

        int minArea = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int[] xs = new int[n - 1];
            int[] ys = new int[n - 1];
            int k = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }

                xs[k] = segments[j][0];
                ys[k] = segments[j][1];
                k++;
            }
            Arrays.sort(xs);
            Arrays.sort(ys);
            minArea = Math.min(minArea, (xs[2] - xs[0]) * (ys[2] - ys[0]));
        }

        System.out.print(minArea);
    }
}