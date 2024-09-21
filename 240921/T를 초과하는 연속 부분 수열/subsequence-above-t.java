import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int max = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (sc.nextInt() > t) {
                cnt++;
                if (max < cnt) {
                    max = cnt;
                }
            } else {
                cnt = 0;
            }
        }

        System.out.print(max);
    }
}