import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] students = new int[n + 1];
        int ans = -1;
        
        for (int i = 0; i < m; i++) {
            int st = sc.nextInt();
            students[st]++;
            if (students[st] >= k) {
                ans = st;
            }
        }

        System.out.print(ans);
    }
}