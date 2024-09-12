import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int offset = 100;
        int max_length = offset * 2 + 1;
        int[][] arr = new int[max_length][max_length];
        int count = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt() + offset;
            int b = sc.nextInt() + offset;

            for (int j = a; j < a + 8; j++) {
                for (int k = b; k < b + 8; k++) {
                    if (arr[j][k] == 0) {
                        count++;
                        arr[j][k] = 1;
                    }
                }
            }
        }

        System.out.print(count);
    }
}