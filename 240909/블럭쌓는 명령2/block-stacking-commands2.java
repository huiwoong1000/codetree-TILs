import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] result = new int[n];
        int max = 0;

        for (int i = 0; i < k; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            for (int j = start; j <= end; j++) {
                if (max < ++result[j]) {
                    max = result[j];
                }
            }
        }

        System.out.print(max);
    }
}