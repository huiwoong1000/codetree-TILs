import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] seats = sc.next().toCharArray();

        int maxMinDist = 0;
        for (int i = 0; i < n; i++) {
            if (seats[i] == '1') {
                continue;
            }
            seats[i] = '1';

            int minDist = Integer.MAX_VALUE;
            for (int j = 0; j < n - 1; j++) {
                if (seats[j] == '1') {
                    for (int k = j + 1; k < n; k++) {
                        if (seats[k] == '1') {
                            int dist = k - j;
                            minDist = Math.min(minDist, dist);
                        }
                    }
                }
            }

            maxMinDist = Math.max(maxMinDist, minDist);
            seats[i] = '0';
        }

        System.out.print(maxMinDist);
    }
}