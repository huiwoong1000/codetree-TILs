import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int cnt = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (i == 0 || numbers[i] == numbers[i - 1]) {
                cnt++;

                if (max < cnt) {
                    max = cnt;
                }
            } else {
                cnt = 1;
            }
        }

        System.out.print(max);
    }
}