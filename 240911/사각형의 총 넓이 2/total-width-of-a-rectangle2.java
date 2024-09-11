import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int offset = 100;
        int[][] result = new int[offset * 2 + 1][offset * 2 + 1];

        for (int i = 0; i < n; i++) {
            int x1 = sc.nextInt() + offset;
            int y1 = sc.nextInt() + offset;
            int x2 = sc.nextInt() + offset;
            int y2 = sc.nextInt() + offset;

            for (int j = x1; j < x2; j++) {

                for (int k = y1; k < y2; k++) {
                    result[j][k] = 1;
                }
            }
        }
    
        int count = 0;
        for (int i = 0; i < offset * 2 + 1; i++) {

            for (int j  = 0; j < offset * 2 + 1; j++) {
                if (result[i][j] == 1) {
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}