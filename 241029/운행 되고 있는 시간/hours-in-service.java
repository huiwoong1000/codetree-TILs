import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] startTimes = new int[n];
        int[] endTimes = new int[n];
        for (int i = 0; i < n; i++) {
            startTimes[i] = sc.nextInt();
            endTimes[i] = sc.nextInt();
        }

        int maxRunningTime = 0;

        for (int i = 0; i < n; i++) {
            int[] runningTimes = new int[1001];

            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                
                for (int k = startTimes[j]; k < endTimes[j]; k++) {
                    runningTimes[k] = 1;
                }
            }

            int runningTime = 0;
            for (int k = 0; k < runningTimes.length; k++) {
                runningTime += runningTimes[k];
            }

            maxRunningTime = Math.max(maxRunningTime, runningTime);
        }

        System.out.print(maxRunningTime);
    }
}