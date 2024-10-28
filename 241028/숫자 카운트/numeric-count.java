import java.util.*;

public class Main {

    private static String[] strNumbers;
    private static int[] count1;
    private static int[] count2;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        strNumbers = new String[n];
        count1 = new int[n];
        count2 = new int[n];

        for (int i = 0; i < n; i++) {
            strNumbers[i] = sc.next();
            count1[i] = sc.nextInt();
            count2[i] = sc.nextInt();
        }
        
        int resultCount = 0;
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    if (i == j || j == k || k == i) {
                        continue;
                    }

                    boolean isPassed = true;

                    for (int x = 0; x < n; x++) {
                        int a = Integer.parseInt(strNumbers[x].substring(0, 1));
                        int b = Integer.parseInt(strNumbers[x].substring(1, 2));
                        int c = Integer.parseInt(strNumbers[x].substring(2, 3));
                        int cnt1 = 0;
                        int cnt2 = 0;

                        if (a == i) {
                            cnt1++;
                        }
                        if (b == j) {
                            cnt1++;
                        }
                        if (c == k) {
                            cnt1++;
                        }
                        
                        if (a == j ||a == k) {
                            cnt2++;
                        }
                        if (b == i || b == k) {
                            cnt2++;
                        }
                        if (c == i || c == j) {
                            cnt2++;
                        }

                        if (count1[x] != cnt1 || count2[x] != cnt2) {
                            isPassed = false;
                            break;
                        }
                    }

                    if (isPassed) {
                        resultCount++;
                    }
                }
            }
        }

        System.out.print(resultCount);
    }
}