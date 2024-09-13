import java.util.*;

public class Main {
    public static void main(String[] args) {

        int offset = 100;
        int maxLength = offset * 2 + 1;
        int[][] arr = new int[maxLength][maxLength];

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++)  {
            int x1 = sc.nextInt() + offset;
            int y1 = sc.nextInt() + offset;
            int x2 = sc.nextInt() + offset;
            int y2 = sc.nextInt() + offset;

            for (int j = x1; j < x2; j++) {
                for (int k = y1; k < y2; k++) {
                    if (i % 2 == 0) {
                        arr[j][k] = 1; //red
                    } else {
                        arr[j][k] = 2; //blue
                    }
                }
            }
        }

        int count = 0;
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < maxLength;  j++) {
                if (arr[i][j]  == 2) {
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}