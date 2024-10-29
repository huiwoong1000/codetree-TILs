import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dots = new int[n][2];
        for (int i = 0; i < n; i++) {
            dots[i][0] = sc.nextInt();
            dots[i][1] = sc.nextInt();
        }

        int maxArea = 0;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if ((dots[i][0] == dots[j][0] || dots[i][0] == dots[k][0] || dots[j][0] == dots[k][0])
                    && (dots[i][1] == dots[j][1] || dots[i][1] == dots[k][1] || dots[j][1] == dots[k][1])) {
                        maxArea = Math.max(
                            maxArea, 
                            getArea(dots[i][0], dots[i][1], dots[j][0], dots[j][1], dots[k][0], dots[k][1])
                        );
                    }
                }
            }
        }

        System.out.print(maxArea);
    }

    private static int getArea(int x1, int y1, int x2, int y2, int x3, int y3) {

        return Math.abs((x1 * y2 + x2 * y3 + x3 * y1) - (x2 * y1 + x3 * y2 + x1 * y3));
    }
}