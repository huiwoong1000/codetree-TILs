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

        List<Integer> scoreList = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n - 1; j++) {
                for (int l = j + 1; l < n; l++) {
                    scoreList.add(scoreBoard[i][j] * 10 + scoreBoard[i][l]);
                }
            }
        }

        scoreList.sort(null);
        int totalCount = 0;
        int count = 1;
        for (int i = 0; i < scoreList.size() - 1; i++) {
            if (scoreList.get(i) == scoreList.get(i + 1)) {
                count++;
            } else {
                count = 1;
            }
            
            if (count == k) {
                totalCount++;
            }
        }

        System.out.print(totalCount);
    }
}