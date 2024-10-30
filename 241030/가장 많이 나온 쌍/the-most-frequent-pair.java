import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] fairs = new int[m][2];
        for (int i = 0; i < m; i++) {
            fairs[i][0] = sc.nextInt();
            fairs[i][1] = sc.nextInt();
        }

        int maxCount = 0;
        for (int i = 0; i < m; i++) {
            int candidateA = fairs[i][0];
            int candidateB = fairs[i][1];

            int count = 0;
            for (int j = 0; j < m; j++) {
                if ((candidateA == fairs[j][0] && candidateB == fairs[j][1])
                 || (candidateA == fairs[j][1] && candidateB == fairs[j][0])) {
                    count++;
                 }
            }

            maxCount = Math.max(maxCount, count);
        }

        System.out.print(maxCount);
    }
}