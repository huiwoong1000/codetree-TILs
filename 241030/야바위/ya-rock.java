import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] instructions = new int[n][3];
        for (int i = 0; i < n; i++) {
            instructions[i][0] = sc.nextInt();
            instructions[i][1] = sc.nextInt();
            instructions[i][2] = sc.nextInt();
        }

        int maxScore = 0;
        for (int i = 1; i <= 3; i++) {
            int score = 0;
            int[] rock = new int[4];
            rock[i] = 1;

            for (int j = 0; j < n; j++) {
                int a = instructions[j][0];
                int b = instructions[j][1];
                int c = instructions[j][2];
                int temp = rock[a];
                rock[a] = rock[b];
                rock[b] = temp;

                if (rock[c] == 1) {
                    score++;
                }
            }

            maxScore = Math.max(maxScore, score);
        }

        System.out.print(maxScore);
    }
}