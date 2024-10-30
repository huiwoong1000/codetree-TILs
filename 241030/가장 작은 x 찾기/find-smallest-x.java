import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] betweens = new int[n][2];
        for (int i = 0; i < n; i++) {
            betweens[i][0] = sc.nextInt();
            betweens[i][1] = sc.nextInt();
        }

        for (int x = 1; x < 10000; x++) {
            int number = x;
            boolean isPassed = true;

            for (int i = 0; i < n; i++) {
                number *= 2;

                if (!(betweens[i][0] <= number && number <= betweens[i][1])) {
                    isPassed = false;
                }
            }

            if (isPassed) {
                System.out.print(x);
                break;
            }
        }
    }
}