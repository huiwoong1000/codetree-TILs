import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] before = new int[n];
        int[] after = new int[n];
        for (int i = 0; i < n; i++) {
            before[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            after[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            if (after[i] == before[i]) {
                continue;
            }

            int move = before[i] - after[i];
            before[i + 1] += move;
            count += move;
        }

        System.out.print(count);
    }
}