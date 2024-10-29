import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[][] scoreBoard = new int[k][n];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                scoreBoard[i][j] = sc.nextInt();
            }
        }

        int[] winners = new int[2021];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n - 1; j++) {
                for (int l = j + 1; l < n; l++) {
                    winners[scoreBoard[i][j] * 100 + scoreBoard[i][l]]++;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < winners.length; i++) {
            if (winners[i] == k) {
                count++;
            }
        }

        System.out.print(count);
    }
}