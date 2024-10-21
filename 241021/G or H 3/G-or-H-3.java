import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] numbers = new int[10000];
        int maxPosition = 0;

        for (int i = 0; i < n; i++) {
            int position = sc.nextInt() - 1;
            char c = sc.next().charAt(0);

            if (c == 'G') {
                numbers[position] = 1;
            } else if (c == 'H') {
                numbers[position] = 2;
            }

            maxPosition = Math.max(position, maxPosition);
        }

        int maxScore = 0;
        for (int i = 0; i <= maxPosition - k; i++) {
            int sumScore = 0;
            for (int j = i; j <= i + k; j++) {
                sumScore += numbers[j];
            }

            maxScore = Math.max(maxScore, sumScore);
        }

        System.out.print(maxScore);
    }
}