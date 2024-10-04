import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] manNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            manNumbers[i] = sc.nextInt();
        }

        int minMove = Integer.MAX_VALUE;
        int sumMove = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sumMove += manNumbers[j] * ((j + n - i) % 5);
            }
            minMove = Math.min(sumMove, minMove);
            sumMove = 0;
        }

        System.out.print(minMove);
    }
}