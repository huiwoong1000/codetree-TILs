import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt1 = 0;
        int cnt2 = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            if (number > 0) {
                cnt1++;
                if (max < cnt1) {
                    max = cnt1;
                }
            } else {
                cnt1 = 0;
            }
            if (number < 0) {
                cnt2++;
                if (max < cnt2) {
                    max = cnt2;
                }
            } else {
                cnt2 = 0;
            }
        }

        System.out.print(max);
    }
}