import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] numbers1 = new int[n];
        int[] numbers2 = new int[m];
        for (int i = 0; i < n; i++) {
            numbers1[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            numbers2[i] = sc.nextInt();
        }

        int[] cnt2 = new int[101];
        for (int i = 0; i < m; i++) {
            cnt2[numbers2[i]]++;
        } 

        int count = 0;
        for (int i = 0; i <= n - m; i++) {
            int[] cnt1 = new int[101];

            for (int j = i; j < i + m; j++) {
                cnt1[numbers1[j]]++;
            }

            if (Arrays.equals(cnt1, cnt2)) {
                count++;
            }
        }

        System.out.println(count);
    }
}