import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] result = new int[201];
        int max = 0;

        for (int i = 0; i < n; i++) {
            int start = sc.nextInt() + 100;
            int end = sc.nextInt() + 100;

            for (int j = start; j < end; j++) {
                if (max < ++result[j]) {
                    max = result[j];
                }
            }
        }

        System.out.print(max);
    }
}